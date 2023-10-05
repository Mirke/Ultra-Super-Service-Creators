package com.group1.edufy_media.Repositories;

import com.group1.edufy_media.Model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre,Integer> {

}
