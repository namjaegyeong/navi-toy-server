package com.example.navigationtoyproject.dto;

import com.example.navigationtoyproject.entity.MapVersionEntity;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ResponseMapVersionDto {
    private String mapVersion;

    @Builder
    public ResponseMapVersionDto(MapVersionEntity mapVersionEntity) {
        this.mapVersion = mapVersionEntity.getMapVersion();
    }
}