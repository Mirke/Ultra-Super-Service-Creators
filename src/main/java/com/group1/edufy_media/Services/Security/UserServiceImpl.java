package com.group1.edufy_media.Services.Security;

import com.group1.edufy_media.Exceptions.ResourceNotFoundException;
import com.group1.edufy_media.Model.GenrePreference;
import com.group1.edufy_media.Model.PlayedSong;
import com.group1.edufy_media.Model.Security.Users;
import com.group1.edufy_media.Model.Song;
import com.group1.edufy_media.Repositories.GenrePreferenceRepository;
import com.group1.edufy_media.Repositories.PlayedSongRepository;
import com.group1.edufy_media.Repositories.Security.UserRepository;
import com.group1.edufy_media.Repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

  @Override
  public List<Song> getSongsNotPlayedByUser(String username) {
    Users user = userRepository.findByUsername(username);
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


}
