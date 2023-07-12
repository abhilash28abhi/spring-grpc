package com.aggregatorservice.controller;

import com.aggregatorservice.service.AggregatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class AggregatorController {

    @Autowired
    private AggregatorService aggregatorService;

    @GetMapping("/api/doubles/{number}")
    public Flux<Long> getAllDoubles(@PathVariable int number){
        return this.aggregatorService.getAllDoubles(number);
    }
}
