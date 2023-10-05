package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.PodcastCreator;
import com.group1.edufy_media.Repositories.PodcastCreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PodcastCreatorService implements PodcastCreatorServiceInterface {

    @Autowired
    PodcastCreatorRepository podcastCreatorRepository;

    @Override
    public List<PodcastCreator> getAllPodcastCreators() { return podcastCreatorRepository.findAll(); }
}