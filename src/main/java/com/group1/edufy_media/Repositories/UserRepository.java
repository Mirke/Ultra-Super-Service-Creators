package com.group1.edufy_media.Repositories;

import com.group1.edufy_media.Model.Song;
import com.group1.edufy_media.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findById(int userId);

}
