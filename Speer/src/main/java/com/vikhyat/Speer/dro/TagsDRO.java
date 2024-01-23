package com.vikhyat.Speer.dro;

import com.vikhyat.Speer.models.Notes;
import lombok.Builder;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Builder
@Getter
public class TagsDRO {
    private String name;
    private String createdBy;
    private String updatedBy;
    private Set<Notes> notes = new HashSet<>();
}
