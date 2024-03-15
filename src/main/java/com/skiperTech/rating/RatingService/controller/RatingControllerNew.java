package com.skiperTech.rating.RatingService.controller;

import com.skiperTech.rating.RatingService.entity.Rating;
import com.skiperTech.rating.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rate")
public class RatingControllerNew {

    @Autowired
    RatingService ratingService;
    @PostMapping
    public Rating createRating( @RequestBody Rating rating){
        return ratingService.createRating(rating);

    }
}
