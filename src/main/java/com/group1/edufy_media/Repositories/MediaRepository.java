package com.group1.edufy_media.Repositories;

import com.group1.edufy_media.Model.Media;
import com.group1.edufy_media.Model.Podcast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaRepository extends JpaRepository<Media,Integer> {
}
