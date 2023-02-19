package com.sb.rating_s.rating_s.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.rating_s.rating_s.entities.Rating;
import com.sb.rating_s.rating_s.exceptions.ResourceNotFoundExc;
import com.sb.rating_s.rating_s.repositories.RatingRepo;
import com.sb.rating_s.rating_s.services.RatingService;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	RatingRepo ratingRepo;

	@Override
	public Rating saveRating(Rating u) {
		return ratingRepo.save(u);
	}

	@Override
	public List<Rating> getAllRatings() {
		return ratingRepo.findAll();
	}

	@Override
	public Rating getRating(String id) {
		return ratingRepo.findById(id).orElseThrow(()-> new ResourceNotFoundExc("Rating "+id+" not found"));
	}

	@Override
	public List<Rating> getByUserId(String id) {
		return ratingRepo.findByUserId(id);
	}

	@Override
	public List<Rating> getByHotelId(String id) {
		return ratingRepo.findByHotelId(id);
	}
	
	

}
