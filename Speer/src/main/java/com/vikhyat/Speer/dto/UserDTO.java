package com.vikhyat.Speer.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.Instant;

@Getter
@Builder
public class UserDTO {
    private String emailId;
    private String userName;
    private Instant createdAt;
    private Instant updatedAt;
    private boolean isDeleted;
    private String createdBy;
    private String updatedBy;
}
