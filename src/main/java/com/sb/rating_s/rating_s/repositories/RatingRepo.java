package com.sb.rating_s.rating_s.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sb.rating_s.rating_s.entities.Rating;

public interface RatingRepo extends MongoRepository<Rating, String>{
	
	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);
}
