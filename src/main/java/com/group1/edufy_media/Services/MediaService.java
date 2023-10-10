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
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class MediaService implements MediaServiceInterface {

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

    /*
    @Override
    public Stream<Media> findMediaPlayedByUser() {
        List<Media> playedMediaList = new ArrayList<>();

        List<Podcast> podcasts = podcastRepository.findAll();
        List<Video> videos = videoRepository.findAll();
        List<Song> songs = songRepository.findAll();

        playedMediaList.addAll(podcasts);
        playedMediaList.addAll(videos);
        playedMediaList.addAll(songs);

        return playedMediaList;
    }

     */

    public List<Song> displaySongsInAlbum(int album_id) {
        return songRepository.findSongsByAlbum_Id(album_id);
    }

    @Override
    public Stream<Media> sortAllMediaByGenre() {
        List<Media> mediaList = findAllMedia();
        return mediaList.stream().sorted(this::genreComparatorById);
    }

    @Override
    public Stream<Media> sortAllMediaByMediaType() {
        List<Media> mediaList = findAllMedia();
        return mediaList.stream().sorted(this::podcastComparatorById);
    }

    @Override
    public Stream<Media> findMediaPlayedByUser() {
        return null;
    }

    public Stream<Media> getMediaTypeById(int media_type_id) {
        List<Media> mediaList = findAllMedia();
        return mediaList.stream().filter(mt -> mt.getMediaType().getId() == media_type_id);
    }

    public Stream<Media> getGenreById(int genre_id) {
        List<Media> mediaList = findAllMedia();
        return mediaList.stream().filter(mt -> mt.getGenre().getId() == genre_id);
    }
//    public Optional<Video> displayGenreById(int video_id){
//        List<Video> videos = videoRepository.findAll();
//        return videoRepository.findById(video_id);
//    }
//
//    public Optional<Song> displaySongById(int song_id){
//        List<Song> songs = songRepository.findAll();
//        return songRepository.findById(song_id);
//    }
//
//    public Optional<Podcast> displayPodcastById(int podcast_id){
//        List<Podcast> podcasts = podcastRepository.findAll();
//        return podcastRepository.findById(podcast_id);
//    }

    private int genreComparatorById(Media o1, Media o2) {
        return Integer.compare(o1.getGenre().getId(), o2.getGenre().getId());
    }

    private int podcastComparatorById(Media o1, Media o2) {
        return Integer.compare(o1.getMediaType().getId(), o2.getMediaType().getId());
    }

}
