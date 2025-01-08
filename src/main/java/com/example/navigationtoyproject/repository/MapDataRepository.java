package com.example.navigationtoyproject.repository;

import com.example.navigationtoyproject.entity.MapDataEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapDataRepository extends CrudRepository<MapDataEntity, Long> {

    List<MapDataEntity> findMapDataEntitiesByMapVersion(String mapVersion);
}
