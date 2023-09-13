package com.felix.testtaskparsingshop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "graphic_cards_with_min_average_price", uniqueConstraints = @UniqueConstraint(columnNames = "of_date"))
@Getter
@Setter
@RequiredArgsConstructor
public class VideoCard {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "price")
    private double price;

    @Column(name ="of_date")
    private LocalDate date;
}
