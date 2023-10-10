package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.PlayedSong;
import com.group1.edufy_media.Repositories.PlayedSongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayedSongService implements PlayedSongServiceInterface{

    // Properties:

    @Autowired
    private final PlayedSongRepository playedSongRepository;

    // Constructor:

    public PlayedSongService(PlayedSongRepository playedSongRepository) {
        this.playedSongRepository = playedSongRepository;
    }

    // Method:

    public List<PlayedSong> findAll() {
        return playedSongRepository.findAll();
    }

}
