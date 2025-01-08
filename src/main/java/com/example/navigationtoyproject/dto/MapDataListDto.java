package com.example.navigationtoyproject.dto;

import lombok.*;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MapDataListDto {
    private List<MapDataDto> mapDataList;
}
