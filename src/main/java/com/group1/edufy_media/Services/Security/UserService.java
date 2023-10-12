package com.group1.edufy_media.Services.Security;

import com.group1.edufy_media.Model.GenrePreference;
import com.group1.edufy_media.Model.PlayedSong;
import com.group1.edufy_media.Model.Security.Users;
import com.group1.edufy_media.Model.Song;

import java.util.List;
import java.util.stream.Stream;

public interface UserService {
  Stream<GenrePreference> getUserGenrePreferences (Users user);
  List<PlayedSong> findPlayedSongsByUser (Users user);
  List <Song> getSongsNotPlayedByUser (String username);
  void userPlaySong(int songId, String username);
  List <Users> getAllUsers();
}
