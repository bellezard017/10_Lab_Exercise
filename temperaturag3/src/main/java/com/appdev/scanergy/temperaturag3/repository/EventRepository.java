package com.appdev.scanergy.temperaturag3.repository;

import com.appdev.scanergy.temperaturag3.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<EventEntity, Long> {
}
