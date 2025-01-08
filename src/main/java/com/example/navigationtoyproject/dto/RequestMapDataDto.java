package com.example.navigationtoyproject.dto;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RequestMapDataDto {
    private String mapVersion;
}
