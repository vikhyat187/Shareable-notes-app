package com.vikhyat.Speer.dto;

import com.vikhyat.Speer.enums.PermissionLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SharedNotesDTO {
    List<SharedNotesObject> sharedNotesObjectList;

    @Builder
    @Data
    private static class SharedNotesObject{
        private NotesDTO notesDTO;
        private UserDTO userDTO;
        private PermissionLevel permissionLevel;
        private Instant createdAt;
        private Instant updatedAt;
        private boolean isDeleted;
    }
}
