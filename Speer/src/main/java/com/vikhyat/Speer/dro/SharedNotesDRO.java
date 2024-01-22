package com.vikhyat.Speer.dro;

import com.vikhyat.Speer.enums.PermissionLevel;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ShareNotesDRO {
    private Long notesId;
    private Long userId;
    private PermissionLevel permissionLevel;
}
