package com.example.navigationtoyproject.controller;

import com.example.navigationtoyproject.dto.MapDataListDto;
import com.example.navigationtoyproject.dto.RequestMapDataDto;
import com.example.navigationtoyproject.service.NavigationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NavigationController {
    private final NavigationService navigationService;

    @PostMapping("/map-data")
    public MapDataListDto findMapDataList(@RequestBody RequestMapDataDto requestMapDataDto) {
        return navigationService.findMapDataList(requestMapDataDto);
    }
}