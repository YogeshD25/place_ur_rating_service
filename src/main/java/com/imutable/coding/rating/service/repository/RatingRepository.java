package com.imutable.coding.rating.service.repository;

import com.imutable.coding.rating.service.model.Rating;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public interface RatingRepository extends ReactiveCrudRepository<Rating,Long> {

    @Query("SELECT r from Rating r WHERE r.placeId = :placeId")
    Flux<Rating> findRatingById(@Param("placeId") long placeId);

}
