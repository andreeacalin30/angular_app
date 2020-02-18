package com.andreeapp.MyBikeApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.andreeapp.MyBikeApp.model.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {
		
	
}
