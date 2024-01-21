package com.vikhyat.Speer.dro;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDRO {
    private String name;
    private String email;
    private String password;
    private String createdBy;
    private String updatedBy;
}
