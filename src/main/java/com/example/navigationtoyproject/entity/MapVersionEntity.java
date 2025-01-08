package com.example.navigationtoyproject.entity;

import com.example.navigationtoyproject.dto.ResponseMapVersionDto;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table
public class MapVersionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String mapVersion;

    @CreationTimestamp // INSERT 시 자동으로 값을 채워줌
    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    public static MapVersionEntity toEntity(ResponseMapVersionDto dto) {
        return MapVersionEntity.builder()
                .mapVersion(dto.getMapVersion())
                .build();
    }
}
