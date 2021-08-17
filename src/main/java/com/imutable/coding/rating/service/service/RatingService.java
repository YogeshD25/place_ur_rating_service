package com.imutable.coding.rating.service.service;

import com.imutable.coding.rating.service.model.Rating;
import com.imutable.coding.rating.service.repository.RatingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Slf4j
@Service
public class RatingService {

    private RatingRepository ratingRepository;

    @Autowired
    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public Mono<Rating> saveCategory(Rating rating){
        log.info("Inside Rating Service for Saving Rating");
        return ratingRepository.save(rating);
    }

    public Flux<Rating> getAllRatingByPlaceId(long id){
        log.info("Inside Rating Service for getting all Rating By Id");
        return ratingRepository.findRatingById(id);
    }
}
