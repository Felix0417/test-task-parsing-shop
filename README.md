Примечания

Все необходимые данные находятся в папке resources

1. Важно чтобы у вас стояла свежая версия google chrome(на момент публикации 116) [скачать тут](https://www.google.com/intl/ru/chrome/)
 
2. Chromedriver можно найти [тут](https://googlechromelabs.github.io/chrome-for-testing/#stable)

3. Настройки для запроса через Selenium можно взять из браузера по адресу - chrome://version/ 

4. Можно поднять БД через докер, тестовые данные инжектятся через запуск контейнера.

5. Страницу запуска с отрисовкой графика сделал с использованием JS


ТЗ:

Реализовать веб приложение, которое будет показывать среднюю минимальную цену на видеокарты RTX 4070TI на сайте Ситилинк.

На веб странице приложения показан график средней за последние 5 дней.

Приложение реализовать с помощью Spring Boot. 

Данные стягивать с сайта DNS раз в день по крону и складывать в postgresql.

Реализация фронтенд на усмотрение реализатора

Результат представить в виде ссылки на репозиторий github с инструкцией по запуску.