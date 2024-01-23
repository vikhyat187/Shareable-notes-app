package com.vikhyat.Speer.repository;

import com.vikhyat.Speer.models.Tags;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagsRepository extends JpaRepository<Tags, Long> {
    Tags findByName(String name);
}
