package com.vikhyat.Speer.repository;

import com.vikhyat.Speer.enums.PermissionLevel;
import com.vikhyat.Speer.models.Notes;
import com.vikhyat.Speer.models.SharedNotes;
import com.vikhyat.Speer.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SharedNotesRepository extends JpaRepository<SharedNotes, Long> {
    List<SharedNotes> findByUserAndPermissionLevel(Users user, PermissionLevel permissionLevel);

    List<SharedNotes> findByNote(Notes notes);

    SharedNotes findByNoteAndUser(Notes note, Users user);

}
