package com.example.navigationtoyproject.repository;

import com.example.navigationtoyproject.entity.MapVersionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapVersionRepository extends CrudRepository<MapVersionEntity, Long> {

    MapVersionEntity findTopByOrderByCreatedAtDesc();
}