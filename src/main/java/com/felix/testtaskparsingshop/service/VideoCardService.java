package com.felix.testtaskparsingshop.service;

import com.felix.testtaskparsingshop.job.ParseSite;
import com.felix.testtaskparsingshop.entity.VideoCard;
import com.felix.testtaskparsingshop.repository.VideoCardRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class VideoCardService {

    private final VideoCardRepository repository;

    private final ParseSite parseSite;

    public List<VideoCard> getLastFiveElements(){
        return repository.getLastFiveElements();
    }

    @SneakyThrows
    @Transactional
    @Scheduled(cron = "0 0 12 * * ?") //каждый день в 12 часов дня
    public void save(){
        double averageMinPrice = parseSite.getAverageMinPrice();
        VideoCard videoCard = new VideoCard();
        videoCard.setPrice(averageMinPrice);
        videoCard.setDate(LocalDate.now());
        repository.save(videoCard);
    }
}