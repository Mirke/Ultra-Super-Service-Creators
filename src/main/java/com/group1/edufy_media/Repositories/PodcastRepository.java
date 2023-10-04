package com.group1.edufy_media.Repositories;

import com.group1.edufy_media.Model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PodcastRepository extends JpaRepository<Podcast, Integer> {


    PodcastCreator findById (int contentContributorId);

    List<Podcast> findAllByPodcastCreator(PodcastCreator podcastCreator);


}
