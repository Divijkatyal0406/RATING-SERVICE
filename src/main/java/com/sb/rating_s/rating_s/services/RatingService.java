package com.sb.rating_s.rating_s.services;

import java.util.List;

import com.sb.rating_s.rating_s.entities.Rating;

public interface RatingService {

	Rating saveRating(Rating u);
	
	List<Rating> getAllRatings();
	
	Rating getRating(String id);
	
	List<Rating> getByUserId(String id);
	
	List<Rating> getByHotelId(String id);
}
