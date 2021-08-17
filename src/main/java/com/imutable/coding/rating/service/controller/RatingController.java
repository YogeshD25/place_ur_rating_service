package com.imutable.coding.rating.service.controller;

import com.imutable.coding.rating.service.model.Rating;
import com.imutable.coding.rating.service.service.RatingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/rating")
@Slf4j
public class RatingController {

    private RatingService ratingService;

    @Autowired
    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping
    public Flux<Rating> getAllRatingByPlaceId(@RequestParam long id) {
        log.info("Inside Rating Controller in getAllRatingByPlaceId");
        return ratingService.getAllRatingByPlaceId(id);
    }

    @PostMapping
    public Mono<Rating> savePlace(@RequestBody Rating rating) {
        log.info("Inside Rating Controller in saveRating");
        return ratingService.saveCategory(rating);
    }
}
