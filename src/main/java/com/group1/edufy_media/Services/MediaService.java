package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.Media;
import com.group1.edufy_media.Model.Podcast;
import com.group1.edufy_media.Model.Song;
import com.group1.edufy_media.Model.Video;
import com.group1.edufy_media.Repositories.PodcastRepository;
import com.group1.edufy_media.Repositories.SongRepository;
import com.group1.edufy_media.Repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

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
        return mediaList;
    }

    public List<Song> displaySongsInAlbum(int album_id) {
        return songRepository.findSongsByAlbum_Id(album_id);
    }

    @Override
    public Stream<Media> sortAllMediaByGenre() {
        List<Media> mediaList = findAllMedia();
        return mediaList.stream().sorted(this::genreComparator);
    }

    @Override
    public Stream<Media> sortAllMediaByMediaType() {
        List<Media> mediaList = findAllMedia();
        return mediaList.stream().sorted(this::podcastComparator);
    }

    private int genreComparator(Media o1, Media o2){
        return Integer.compare(o1.getGenre().getId(), o2.getGenre().getId());
    }

    private int podcastComparator(Media o1, Media o2){
        return Integer.compare(o1.getMediaType().getId(), o2.getMediaType().getId());
    }

}
