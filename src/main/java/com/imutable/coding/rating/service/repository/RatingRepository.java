package com.imutable.coding.rating.service.repository;

import com.imutable.coding.rating.service.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating,Long> {

    @Query("SELECT r from Rating r WHERE r.placeId = :placeId")
    List<Rating> findRatingById(@Param("placeId") long placeId);

}
