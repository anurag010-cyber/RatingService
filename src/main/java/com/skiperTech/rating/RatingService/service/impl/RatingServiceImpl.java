package com.skiperTech.rating.RatingService.service.impl;

import com.skiperTech.rating.RatingService.entity.Rating;
import com.skiperTech.rating.RatingService.repository.RatingRepository;
import com.skiperTech.rating.RatingService.service.RatingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    private final RatingRepository repository;

    public RatingServiceImpl(RatingRepository repository) {
        this.repository = repository;
    }

    @Override
    public Rating createRating(Rating rating) {
        String randomId= UUID.randomUUID().toString();
        rating.setRatingId(randomId);

        return repository.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return repository.findAll();
    }

    @Override
    public List<Rating> getRatingForUser(String userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingForHotel(String hotelId) {
        return repository.findByHotelId(hotelId);
    }
}
