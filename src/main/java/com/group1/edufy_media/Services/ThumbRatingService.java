package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.*;
import com.group1.edufy_media.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class ThumbRatingService {


    private final ThumbRatingRepository thumbRatingRepository;
    private final SongRepository songRepository;
    private final PodcastRepository podcastRepository;
    private final VideoRepository videoRepository;

    @Autowired
    public ThumbRatingService(ThumbRatingRepository thumbRatingRepository, SongRepository songRepository, PodcastRepository podcastRepository, VideoRepository videoRepository) {
        this.thumbRatingRepository = thumbRatingRepository;
        this.songRepository = songRepository;
        this.podcastRepository = podcastRepository;
        this.videoRepository = videoRepository;
    }

    public void addThumbRatingToMediaItem(Media media) {
        ThumbRating thumbRating = new ThumbRating(0, 0);
        media.setThumbRating(thumbRating);
        thumbRatingRepository.save(thumbRating);
        if (media.getMediaType().toString().equals("Song")) {
            songRepository.save((Song) media);
        } else if (media.getMediaType().toString().equals("Podcast")) {
            podcastRepository.save((Podcast)media);
        } else if (media.getMediaType().toString().equals("Video")) {
            videoRepository.save((Video) media);
        }
    }

    public void giveThumbsUp(int id, String media) {

        if (media.equals("Song")) {
                Song song = songRepository.findById(id);
                assert song != null;
            if (song.getThumbRating() == null) {
                ThumbRating thumbRating = new ThumbRating(0, 0);
                thumbRatingRepository.save(thumbRating);
                song.setThumbRating(thumbRating);
            }
            song.getThumbRating().addOneThumbsUp();
            songRepository.save(song);

        } else if (media.equals("Podcast")) {
            Podcast podcast = podcastRepository.findById(id).orElseThrow();
            if (podcast.getThumbRating() == null) {
                ThumbRating thumbRating = new ThumbRating(0, 0);
                thumbRatingRepository.save(thumbRating);
                podcast.setThumbRating(thumbRating);
            }
            podcast.getThumbRating().addOneThumbsUp();
            podcastRepository.save(podcast);

        } else if (media.equals("Video")) {
            Video video = videoRepository.findById(id).orElseThrow();
            if (video.getThumbRating() == null) {
                ThumbRating thumbRating = new ThumbRating(0, 0);
                thumbRatingRepository.save(thumbRating);
                video.setThumbRating(thumbRating);
            }
            video.getThumbRating().addOneThumbsUp();
            videoRepository.save(video);
        }
    }

    public void giveThumbsDown(int id, String media){

        if (media.equals("Song")) {
            Song song = songRepository.findById(id);
            assert song != null;
            if (song.getThumbRating() == null) {
                ThumbRating thumbRating = new ThumbRating(0, 0);
                thumbRatingRepository.save(thumbRating);
                song.setThumbRating(thumbRating);
            }
            song.getThumbRating().addOneThumbsDown();
            songRepository.save(song);

        } else if (media.equals("Podcast")) {
            Podcast podcast = podcastRepository.findById(id).orElseThrow();
            if (podcast.getThumbRating() == null) {
                ThumbRating thumbRating = new ThumbRating(0, 0);
                thumbRatingRepository.save(thumbRating);
                podcast.setThumbRating(thumbRating);
            }
            podcast.getThumbRating().addOneThumbsDown();
            podcastRepository.save(podcast);

        } else if (media.equals("Video")) {
            Video video = videoRepository.findById(id).orElseThrow();
            if (video.getThumbRating() == null) {
                ThumbRating thumbRating = new ThumbRating(0, 0);
                thumbRatingRepository.save(thumbRating);
                video.setThumbRating(thumbRating);
            }
            video.getThumbRating().addOneThumbsDown();
            videoRepository.save(video);
        }
    }


    public Optional<Song> mostLikedSong() {
        List<Song> s = songRepository.findAll();
        return s.stream().filter(x -> x.getThumbRating() != null).max(Comparator.comparingDouble(o -> o.getThumbRating().getDifferenceBetweenThumbsUpAndDown()));

    }

}
