package com.felix.testtaskparsingshop.repository;

import com.felix.testtaskparsingshop.entity.VideoCard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VideoCardRepository extends CrudRepository<VideoCard, Long> {

    @Query("SELECT v FROM VideoCard v ORDER BY v.date DESC LIMIT 5")
    List<VideoCard> getLastFiveElements();
}
