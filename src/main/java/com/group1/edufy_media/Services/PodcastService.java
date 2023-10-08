package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.Podcast;
import com.group1.edufy_media.Repositories.PodcastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PodcastService implements PodcastServiceInterface {

    @Autowired
    private PodcastRepository podcastRepository;

    @Override
    public List<Podcast> getAllPodcasts() {
        return podcastRepository.findAll();
    }
}