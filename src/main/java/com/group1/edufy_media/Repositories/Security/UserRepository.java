package com.group1.edufy_media.Repositories.Security;

import com.group1.edufy_media.Model.Security.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <Users, String> {
  Users findByUsername (String username);
}
