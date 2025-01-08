package com.example.navigationtoyproject.service;

import com.example.navigationtoyproject.dto.MapDataDto;
import com.example.navigationtoyproject.entity.MapDataEntity;
import com.example.navigationtoyproject.repository.MapDataRepository;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final MapDataRepository mapDataRepository;

    @Override
    public void run(String... args) throws Exception {
        // JSON 파일 로드
        Gson gson = new Gson();
        Type listType = new TypeToken<List<MapDataDto>>() {}.getType();
        List<MapDataDto> mockData;

        try (InputStreamReader reader = new InputStreamReader(
                Objects.requireNonNull(getClass().getResourceAsStream("/mock_data.json")), StandardCharsets.UTF_8)) {
            mockData = gson.fromJson(reader, listType);
        }

        // 데이터베이스에 삽입
        for (MapDataDto dto : mockData) {
            MapDataEntity entity = MapDataEntity.toEntity(dto);
            mapDataRepository.save(entity);
        }

        System.out.println("Mock data inserted into H2 database.");
    }
}