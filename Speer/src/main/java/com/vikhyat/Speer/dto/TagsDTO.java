package com.vikhyat.Speer.dto;

import com.vikhyat.Speer.models.Notes;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.Instant;
import java.util.Set;


@Getter
@Builder
public class TagsDTO {
    private String tagName;

    private Long createdBy;

    private Instant createdAt;

    private Long updatedBy;

    private Instant updatedAt;

    private Set<Notes> notesSet;
}