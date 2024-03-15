package com.skiperTech.rating.RatingService.controller;

import com.skiperTech.rating.RatingService.entity.Rating;
import com.skiperTech.rating.RatingService.service.RatingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    private final RatingService repository;

    public RatingController(RatingService repository) {
        this.repository = repository;
    }


    // create rating
//    @PostMapping("/save")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
        System.out.println("data" + rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.createRating(rating));
    }

    @PostMapping("/")
    public ResponseEntity<Rating> createRatingRecord(@RequestBody Rating rating) {
        return ResponseEntity.ok(repository.createRating(rating));
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getAllRating() {
        return ResponseEntity.ok(repository.getAllRating());
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getAllUserRatingByUSerId(@PathVariable String userId) {
        return ResponseEntity.ok(repository.getRatingForUser(userId));
    }

    @GetMapping("/hotel/{hotelId}")

    public ResponseEntity<List<Rating>> getAllHotelRatingByHotelId(@PathVariable String hotelId) {
        return ResponseEntity.ok(repository.getRatingForUser(hotelId));
    }
}
