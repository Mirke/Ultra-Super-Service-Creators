package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.Media;
import com.group1.edufy_media.Model.Song;
import com.group1.edufy_media.Model.ThumbRating;
import com.group1.edufy_media.Model.Video;
import com.group1.edufy_media.Repositories.MediaRepository;
import com.group1.edufy_media.Repositories.SongRepository;
import com.group1.edufy_media.Repositories.ThumbRatingRepository;
import com.group1.edufy_media.Repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThumbRatingService {


    private final ThumbRatingRepository thumbRatingRepository;
    private final MediaRepository mediaRepository;
    private final VideoRepository videoRepository;
    private final SongRepository songRepository;

    @Autowired
    public ThumbRatingService(ThumbRatingRepository thumbRatingRepository, MediaRepository mediaRepository, VideoRepository videoRepository, SongRepository songRepository) {
        this.thumbRatingRepository = thumbRatingRepository;
        this.mediaRepository = mediaRepository;
        this.videoRepository = videoRepository;
        this.songRepository = songRepository;
    }

    public void addThumbRatingToMediaItem(Song song){
        ThumbRating thumbRating = new ThumbRating(0,0);
        song.setThumbRating(thumbRating);
        thumbRatingRepository.save(thumbRating);
        songRepository.save(song);
    }

    public void giveThumbsUp(int id){
        Song song1 = songRepository.findById(id).orElse(null);
        assert song1 != null;
        if(song1.getThumbRating() == null){
            ThumbRating thumbRating = new ThumbRating(0,0);
            thumbRatingRepository.save(thumbRating);
            song1.setThumbRating(thumbRating);
        }
        song1.getThumbRating().addOneThumbsUp();
        songRepository.save(song1);
    }

    public void giveThumbsDown(int id){
        Song song1 = songRepository.findById(id).orElse(null);
        assert song1 != null;
        if(song1.getThumbRating() == null){
            ThumbRating thumbRating = new ThumbRating(0,0);
            thumbRatingRepository.save(thumbRating);
            song1.setThumbRating(thumbRating);
        }
        song1.getThumbRating().addOneThumbsDown();
        songRepository.save(song1);
    }

}
