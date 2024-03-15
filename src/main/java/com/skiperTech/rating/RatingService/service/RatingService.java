package com.skiperTech.rating.RatingService.service;

import com.skiperTech.rating.RatingService.entity.Rating;

import java.util.List;

public interface RatingService {
    //create rating for hotel
    Rating createRating(Rating rating);

    // get all rating
    List<Rating> getAllRating();

    //get all rating UerId
    List<Rating> getRatingForUser(String userId);

    //get all rating for hotel
    List<Rating> getRatingForHotel(String  hotelId);
}
