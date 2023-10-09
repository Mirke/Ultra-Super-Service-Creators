package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.Song;
import com.group1.edufy_media.Model.ThumbRating;
import com.group1.edufy_media.Repositories.MediaRepository;
import com.group1.edufy_media.Repositories.SongRepository;
import com.group1.edufy_media.Repositories.ThumbRatingRepository;
import com.group1.edufy_media.Repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class ThumbRatingService {


    private final ThumbRatingRepository thumbRatingRepository;
    private final SongRepository songRepository;


    @Autowired
    public ThumbRatingService(ThumbRatingRepository thumbRatingRepository, SongRepository songRepository) {
        this.thumbRatingRepository = thumbRatingRepository;
        this.songRepository = songRepository;
    }



    public void addThumbRatingToMediaItem(Song song) {
        ThumbRating thumbRating = new ThumbRating(0, 0);
        song.setThumbRating(thumbRating);
        thumbRatingRepository.save(thumbRating);
        songRepository.save(song);
    }

    public void giveThumbsUp(int id) {
        Song song1 = songRepository.findById(id).orElse(null);
        assert song1 != null;
        if (song1.getThumbRating() == null) {
            ThumbRating thumbRating = new ThumbRating(0, 0);
            thumbRatingRepository.save(thumbRating);
            song1.setThumbRating(thumbRating);
        }
        song1.getThumbRating().addOneThumbsUp();
        songRepository.save(song1);
    }

    public void giveThumbsDown(int id) {
        Song song1 = songRepository.findById(id).orElse(null);
        assert song1 != null;
        if (song1.getThumbRating() == null) {
            ThumbRating thumbRating = new ThumbRating(0, 0);
            thumbRatingRepository.save(thumbRating);
            song1.setThumbRating(thumbRating);
        }
        song1.getThumbRating().addOneThumbsDown();
        songRepository.save(song1);
    }


    public Optional<Song> mostLikedSong() {
        List<Song> s = songRepository.findAll();
        return s.stream()
                .filter(x -> x.getThumbRating() != null)
                .max(Comparator.comparingDouble(o -> o.getThumbRating().getDifferenceBetweenThumbsUpAndDown()));

    }

}
