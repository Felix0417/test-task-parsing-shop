package com.felix.testtaskparsingshop.job;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ParseSite {

    @Value("${site.url}")
    private String url;

    @Value("${site.search.class}")
    private String htmlClassName;

    @Value("${site.search.attribute}")
    private String htmlClassAttribute;

    public double getAverageMinPrice() {
        Elements elements = getAllPricesFromPage();
        return elements.stream()
                .mapToInt(element -> Integer.parseInt(element.attr(htmlClassAttribute)))
                .sorted()
                .limit(5)
                .average()
                .orElse(0);
    }

    private Elements getAllPricesFromPage(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        // данные о браузере можно узнать по ссылке в браузере - chrome://version/
        options.addArguments("--user-agent=Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36");
        options.addArguments("--headless", "--window-size=1920,1200","--ignore-certificate-errors", "--silent");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get(url);
        Document doc = Jsoup.parse(webDriver.getPageSource());
        webDriver.quit();
        return doc.select(htmlClassName);
    }
}