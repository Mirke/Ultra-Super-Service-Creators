package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.GenrePreference;
import com.group1.edufy_media.Model.PlayedSong;
import com.group1.edufy_media.Model.User;

import java.util.List;
import java.util.stream.Stream;

public interface UserServiceInterface {

    Stream<GenrePreference> getUserGenrePreferences(User user);

    Stream<PlayedSong> findPlayedSongsByUser(User user);

    List<User> findAll();

}
