package com.felix.testtaskparsingshop.web.controller;

import com.felix.testtaskparsingshop.service.VideoCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class VideoCardController {

    private final VideoCardService service;

    @GetMapping("/")
    public String getAll(Model model) {
        model.addAttribute("chartData", service.getLastFiveElements());
        return "chart";
    }
}
