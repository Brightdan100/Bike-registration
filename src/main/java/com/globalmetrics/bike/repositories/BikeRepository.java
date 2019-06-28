package com.globalmetrics.bike.repositories;

import com.globalmetrics.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {



}
