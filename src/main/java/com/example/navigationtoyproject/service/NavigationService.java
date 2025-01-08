package com.example.navigationtoyproject.service;

import com.example.navigationtoyproject.dto.MapDataDto;
import com.example.navigationtoyproject.dto.MapDataListDto;
import com.example.navigationtoyproject.dto.RequestMapDataDto;
import com.example.navigationtoyproject.repository.MapDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NavigationService {
    private final MapDataRepository mapDataRepository;

    public MapDataListDto findMapDataList(RequestMapDataDto requestMapDataDto) {
        List<MapDataDto> dto = mapDataRepository.findMapDataEntitiesByMapVersion(requestMapDataDto.getMapVersion())
                .stream()
                .map(MapDataDto::new)
                .toList();

        return MapDataListDto.builder().mapDataList(dto).build();
    }
}
