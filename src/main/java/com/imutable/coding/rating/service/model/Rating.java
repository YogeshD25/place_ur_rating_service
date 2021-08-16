package com.imutable.coding.rating.service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "review_rating")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    @Id
    @SequenceGenerator(
            name = "place_sequence",
            sequenceName = "place_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "place_sequence"
    )
    @JsonIgnore
    private long reviewId;
    @Column
    private long placeId;
    @Column
    private String userMobile;
    @Column
    private String reviewDescription;
    @Column
    private float reviewStar;
    @Column
    @JsonIgnore
    private Date timestamp;

}
