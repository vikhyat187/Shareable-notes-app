package com.vikhyat.Speer.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.Set;

@Getter
@Builder
public class NotesDTO {
    private String title;

    private String content;

    private Set<String> tags;

    private Long createdBy;

    private Instant createdAt;

    private Instant lastUpdatedAt;

    private Long lastUpdatedBy;
}

