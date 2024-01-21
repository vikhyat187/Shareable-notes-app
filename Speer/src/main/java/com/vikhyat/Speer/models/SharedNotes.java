package com.vikhyat.Speer.models;

import com.vikhyat.Speer.enums.PermissionLevel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shared_notes")
public class SharedNotes extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @JoinColumn(name = "note_id", referencedColumnName = "id")
    @ManyToOne(targetEntity = Notes.class, cascade = CascadeType.ALL)
    private Notes note;

    @ManyToOne(targetEntity = Users.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users user;

    @Column(name = "permission_level")
    @Enumerated(value = EnumType.STRING)
    private PermissionLevel permissionLevel;
}
