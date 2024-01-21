package com.vikhyat.Speer.dro;

import com.vikhyat.Speer.models.Tags;
import lombok.Builder;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Builder
@Getter
public class NotesDRO {
    private String title;
    private String content;
    private String createdBy;
    private String updatedBy;
    private Set<Tags> tags = new HashSet<>();
}
