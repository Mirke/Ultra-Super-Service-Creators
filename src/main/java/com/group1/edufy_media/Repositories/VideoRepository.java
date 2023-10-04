package com.group1.edufy_media.Repositories;

import com.group1.edufy_media.Model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video, Integer> {

    VideoCreator findById (int contentContributorId);

    List<Video> findAllByVideoCreator(VideoCreator videoCreator);

}

