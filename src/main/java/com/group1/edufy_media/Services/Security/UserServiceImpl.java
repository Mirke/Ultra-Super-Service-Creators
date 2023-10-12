package com.group1.edufy_media.Services.Security;

import com.group1.edufy_media.Model.GenrePreference;
import com.group1.edufy_media.Model.PlayedSong;
import com.group1.edufy_media.Model.Security.Users;
import com.group1.edufy_media.Repositories.GenrePreferenceRepository;
import com.group1.edufy_media.Repositories.PlayedSongRepository;
import com.group1.edufy_media.Repositories.Security.UserRepository;
import com.group1.edufy_media.Repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class UserServiceImpl implements UserService{
  private UserRepository userRepository;
  private GenrePreferenceRepository genrePreferenceRepository;
  private PlayedSongRepository playedSongRepository;
  private SongRepository songRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository, GenrePreferenceRepository genrePreferenceRepository, PlayedSongRepository playedSongRepository, SongRepository songRepository) {
    this.userRepository = userRepository;
    this.genrePreferenceRepository = genrePreferenceRepository;
    this.playedSongRepository = playedSongRepository;
    this.songRepository = songRepository;
  }

  // Not in use since it will be merged with Mikaels similar work.
  @Override
  public Stream<GenrePreference> getUserGenrePreferences(Users user) {
    return genrePreferenceRepository.findGenrePreferencesByUser(user);
  }

  @Override
  public List<PlayedSong> findPlayedSongsByUser(Users user) {
    return playedSongRepository.findPlayedSongsByUser(user);
  }


}
