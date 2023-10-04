package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.Media;
import com.group1.edufy_media.Model.Podcast;
import com.group1.edufy_media.Model.PodcastCreator;
import com.group1.edufy_media.Repositories.MediaRepository;
import com.group1.edufy_media.Repositories.PodcastRepository;
import com.group1.edufy_media.Repositories.SongRepository;
import com.group1.edufy_media.Repositories.VideoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MediaService implements MediaServiceInterface{

    // Properties:

    // MediaRepository mediaRepository;

    PodcastRepository podcastRepository;
    // SongRepository songRepository;
    // VideoRepository videoRepository;

    // In the media service we also need to have the repositories of the video, song and podcast since we can not search for
    // content contributor id in the media repository.


    // Constructors:

    public MediaService(PodcastRepository podcastRepository) {
        this.podcastRepository = podcastRepository;
    }

    public MediaService() {

    }

    // Methods:
    @Override
    public List<Media> getMediaByContentContributer(int contentContributorId) {

      return null;

    }

    @Override
    public List<Podcast> getPodcastsByContentContributer(int contentContributorId) {

        PodcastCreator podcastCreator = findPodcastCreatorById(contentContributorId);

        return podcastRepository.findAllByPodcastCreator(podcastCreator);

    }


    // Method to find podcast creator:

    public PodcastCreator findPodcastCreatorById(int podcastCreatorId) {

        return podcastRepository.findById(podcastCreatorId);

    }




}
