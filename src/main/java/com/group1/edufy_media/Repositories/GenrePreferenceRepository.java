package com.group1.edufy_media.Repositories;

import com.group1.edufy_media.Model.GenrePreference;
import com.group1.edufy_media.Model.Song;
import com.group1.edufy_media.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface GenrePreferenceRepository extends JpaRepository<GenrePreference, Integer> {

    Stream<GenrePreference> findGenrePreferencesByUser(User user);


}
