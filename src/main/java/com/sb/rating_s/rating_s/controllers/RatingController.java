package com.sb.rating_s.rating_s.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.rating_s.rating_s.entities.Rating;
import com.sb.rating_s.rating_s.services.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	@Autowired
	RatingService ratingService;
	
	@PostMapping
	public ResponseEntity<Rating> createUser(@RequestBody Rating u){
		Rating u1=ratingService.saveRating(u);
		return ResponseEntity.status(HttpStatus.CREATED).body(u1);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Rating> getSingleUser(@PathVariable String id){
		Rating u1=ratingService.getRating(id);
		return ResponseEntity.ok(u1);
	}
	
	@GetMapping("/users/{userid}")
	public ResponseEntity<List<Rating>> getByUserId(@PathVariable String id){
		return ResponseEntity.ok(ratingService.getByUserId(id));
	}
	
	@GetMapping("/hotels/{hotelid}")
	public ResponseEntity<List<Rating>> getByHotelId(@PathVariable String id){
		return ResponseEntity.ok(ratingService.getByHotelId(id));
	}
	
	@GetMapping
	public ResponseEntity<List<Rating>> getAllUsers(){
		List<Rating> u1=ratingService.getAllRatings();
		return ResponseEntity.ok(u1);
	}
}
