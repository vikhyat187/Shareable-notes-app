package com.vikhyat.Speer.dro;

import com.vikhyat.Speer.enums.PermissionLevel;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SharedNotesDRO {
    private Long notesId;
    private String emailId;
    private PermissionLevel permissionLevel;
}
