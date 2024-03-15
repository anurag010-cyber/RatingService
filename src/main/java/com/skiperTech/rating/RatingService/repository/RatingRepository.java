package com.skiperTech.rating.RatingService.repository;

import com.skiperTech.rating.RatingService.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating,String > {

    // custom find

    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);
}
