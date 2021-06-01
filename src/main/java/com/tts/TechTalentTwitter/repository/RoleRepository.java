package com.tts.TechTalentTwitter.repository;

import com.tts.TechTalentTwitter.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}
