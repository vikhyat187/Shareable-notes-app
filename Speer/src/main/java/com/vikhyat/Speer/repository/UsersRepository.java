package com.vikhyat.Speer.repository;

import com.vikhyat.Speer.dto.UserDTO;
import com.vikhyat.Speer.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {
    public Optional<Users> findByEmail(String emailId);
}
