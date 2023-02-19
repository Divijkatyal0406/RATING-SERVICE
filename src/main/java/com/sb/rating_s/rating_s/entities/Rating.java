package com.sb.rating_s.rating_s.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Rating {
	
	private String hotelId;
	@Id
	private String ratingId;
	private String userId;
	private int rating;
	private String remark;

}
