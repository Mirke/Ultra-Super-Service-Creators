package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.GenrePreference;
import com.group1.edufy_media.Model.PlayedSong;
import com.group1.edufy_media.Model.Song;
import com.group1.edufy_media.Model.User;
import com.group1.edufy_media.Repositories.GenrePreferenceRepository;
import com.group1.edufy_media.Repositories.PlayedSongRepository;
import com.group1.edufy_media.Repositories.SongRepository;
import com.group1.edufy_media.Repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static com.fasterxml.jackson.databind.type.LogicalType.Collection;

@Transactional
@Service
public class UserService implements UserServiceInterface{

    @Autowired
    UserRepository userRepository;

    @Autowired
    GenrePreferenceRepository genrePreferenceRepository;

    @Autowired
    PlayedSongRepository playedSongRepository;
    @Autowired
    private SongRepository songRepository;


    // Not in use since it will be merged with Mikaels similar work.
    @Override
    public Stream<GenrePreference> getUserGenrePreferences(User user) {

        Stream<GenrePreference> preferencesByUser = genrePreferenceRepository.findGenrePreferencesByUser(user);

        return preferencesByUser;

    }

    @Override
    public List<PlayedSong> findPlayedSongsByUser(User user) {

        List<PlayedSong> playedSongsByUser = playedSongRepository.findPlayedSongsByUser(user);

        return playedSongsByUser;

    }

    @Override
    public List<Song> getSongsNotPlayedByUser(int userId) {

        User user = userRepository.findById(userId);

        // A users played Songs:
        List<PlayedSong> playedSongsByUser = user.getPlayedSongList();

        // Song-object List of what the user has listened to.
        List<Song> playedSongsByUserList = new ArrayList<>();

        // Fill the list with the Song objects from the first list.
        for(PlayedSong playedSong : playedSongsByUser) {
            playedSongsByUserList.add(playedSong.getSong());
        }

        // Create a list of all the songs in the repo:

        List<Song> allSongs = songRepository.findAll();

        // Strip down the allSongs list from all the songs that the user has played to leave songs never played:

        allSongs.removeAll(playedSongsByUserList);

        return allSongs;

    }


    public void userPlaySong(int songId, int userId) {

        Song song = songRepository.findById(songId);
        User user = userRepository.findById(userId);

        PlayedSong playedSong1 = playedSongRepository.findPlayedSongsBySongAndUser(song, user);

        if (playedSong1 == null) {

            PlayedSong playedSong = new PlayedSong();
            playedSong.setSong(song);
            playedSong.setUser(user);
            playedSong.setUserHasPlayedSong(true);

            playedSongRepository.save(playedSong);
        }
    }


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }



}
