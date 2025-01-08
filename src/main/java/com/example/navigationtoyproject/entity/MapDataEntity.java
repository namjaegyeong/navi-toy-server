package com.example.navigationtoyproject.entity;

import com.example.navigationtoyproject.dto.MapDataDto;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table
public class MapDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double xCoordinate;

    @Column(nullable = false)
    private Double yCoordinate;

    @Column(nullable = false)
    private String mapVersion;

    public static MapDataEntity toEntity(MapDataDto dto) {
        return MapDataEntity.builder()
                .xCoordinate(dto.getWgs84_x())
                .yCoordinate(dto.getWgs84_y())
                .mapVersion("1.0.2")
                .build();
    }
}
