package com.imutable.coding.rating.service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.sql.Date;


@Table("review_rating")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    @Id
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
    private Date created_at;

}
