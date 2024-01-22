package com.vikhyat.Speer.utility;

import com.vikhyat.Speer.dto.NotesDTO;
import com.vikhyat.Speer.dto.TagsDTO;
import com.vikhyat.Speer.dto.UserDTO;
import com.vikhyat.Speer.models.Notes;
import com.vikhyat.Speer.models.Tags;
import com.vikhyat.Speer.models.Users;

public class BusinessObjectsUtils {
    public static NotesDTO convertToNotesDTO(Notes notes){
        return NotesDTO.builder()
                .title(notes.getTitle())
                .content(notes.getContent())
                .createdBy(notes.getCreatedBy())
                .createdAt(notes.getCreatedAt())
                .lastUpdatedAt(notes.getUpdatedAt())
                .lastUpdatedBy(notes.getUpdatedBy())
                .build();

    }

    public static UserDTO convertToUsersDTO(Users users){
        return UserDTO.builder()
                .userName(users.getUserName())
                .emailId(users.getEmail())
                .createdBy(users.getCreatedBy())
                .updatedBy(users.getUpdatedBy())
                .createdAt(users.getCreatedAt())
                .updatedAt(users.getUpdatedAt())
                .isDeleted(users.isDeleted())
                .build();
    }

    public static TagsDTO convertToTagsDTO(Tags tags){
        return TagsDTO.builder()
                .tagName(tags.getName())
                .createdBy(tags.getCreatedBy())
                .updatedAt(tags.getUpdatedAt())
                .updatedBy(tags.getUpdatedBy())
                .createdAt(tags.getCreatedAt())
                .build();
    }
}
