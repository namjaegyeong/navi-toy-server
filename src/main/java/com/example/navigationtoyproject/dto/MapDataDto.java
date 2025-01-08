package com.example.navigationtoyproject.dto;

import com.example.navigationtoyproject.entity.MapDataEntity;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MapDataDto {
    private Integer customLocationMarkerId;
    private Double wgs84_x;
    private Double wgs84_y;

    @Builder
    public MapDataDto(MapDataEntity mapDataEntity) {
        this.customLocationMarkerId = Math.toIntExact(mapDataEntity.getId());
        this.wgs84_x = mapDataEntity.getXCoordinate();
        this.wgs84_y = mapDataEntity.getYCoordinate();
    }
}