package com.group1.edufy_media.Repositories;

import com.group1.edufy_media.Model.Podcast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodcastRepository extends JpaRepository<Podcast,Integer> {
}
