package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.Media;
import com.group1.edufy_media.Model.Podcast;
import com.group1.edufy_media.Model.Song;
import com.group1.edufy_media.Model.Video;
import com.group1.edufy_media.Repositories.MediaRepository;
import com.group1.edufy_media.Repositories.PodcastRepository;
import com.group1.edufy_media.Repositories.SongRepository;
import com.group1.edufy_media.Repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MediaService implements MediaServiceInterface{

    @Autowired
    private VideoRepository videoRepository;

    @Autowired
    private SongRepository songRepository;

    @Autowired
    private PodcastRepository podcastRepository;

    @Override
    public List<Media> findAllMedia() {
        List<Media> mediaList = new ArrayList<>();
        List<Podcast> podcasts = podcastRepository.findAll();
        List<Video> videos = videoRepository.findAll();
        List<Song> songs = songRepository.findAll();
        mediaList.addAll(podcasts);
        mediaList.addAll(videos);
        mediaList.addAll(songs);
        System.out.println(mediaList);
        return mediaList;
    }
}
