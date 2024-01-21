package com.vikhyat.Speer.models;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
@MappedSuperclass
public class BaseEntity {
    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "created_by", length = 255)
    private Long createdBy;

    @Column(name = "updated_by", length = 255)
    private Long updatedBy;

    @Column(name = "is_deleted")
    private boolean isDeleted = false;
}