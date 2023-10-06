package com.group1.edufy_media.Repositories;

import com.group1.edufy_media.Model.Media;
import com.group1.edufy_media.Model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video,Integer> {
}
