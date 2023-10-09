package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.GenrePreference;
import com.group1.edufy_media.Model.PlayedSong;
import com.group1.edufy_media.Model.User;
import com.group1.edufy_media.Repositories.GenrePreferenceRepository;
import com.group1.edufy_media.Repositories.PlayedSongRepository;
import com.group1.edufy_media.Repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Transactional
@Service
public class UserService implements UserServiceInterface{

    @Autowired
    UserRepository userRepository;

    @Autowired
    GenrePreferenceRepository genrePreferenceRepository;

    @Autowired
    PlayedSongRepository playedSongRepository;

    @Override
    public Stream<GenrePreference> getUserGenrePreferences(User user) {

        Stream<GenrePreference> preferencesByUser = genrePreferenceRepository.findGenrePreferencesByUser(user);

        return preferencesByUser;

    }

    @Override
    public Stream<PlayedSong> findPlayedSongsByUser(User user) {

        Stream<PlayedSong> playedSongsByUser = playedSongRepository.findPlayedSongsByUser(user);

        return playedSongsByUser;

    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }


}
