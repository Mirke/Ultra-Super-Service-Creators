package com.group1.edufy_media.Model.Security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.group1.edufy_media.Model.GenrePreference;
import com.group1.edufy_media.Model.PlayedSong;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class Users {

  @Id
  @Column(name = "username", length = 50, nullable = false)
  private String username;

  @Column(name = "password", length = 50, nullable = false)
  private String password;

  @Column(name = "enabled", nullable = false)
  private boolean active;

  @OneToMany (mappedBy = "user" ,cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.REMOVE})
  @JsonIgnore
  private List<GenrePreference> genrePreferences;

  @OneToMany (mappedBy = "user" ,cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.REMOVE})
  @JsonIgnore
  private List <PlayedSong> playedSongList;

  public Users() {
  }

  public Users(String username, String password, boolean active, List<GenrePreference> genrePreferences, List<PlayedSong> playedSongList) {
    this.username = username;
    this.password = password;
    this.active = active;
    this.genrePreferences = genrePreferences;
    this.playedSongList = playedSongList;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public List<GenrePreference> getGenrePreferences() {
    return genrePreferences;
  }

  public void setGenrePreferences(List<GenrePreference> genrePreferences) {
    this.genrePreferences = genrePreferences;
  }

  public List<PlayedSong> getPlayedSongList() {
    return playedSongList;
  }

  public void setPlayedSongList(List<PlayedSong> playedSongList) {
    this.playedSongList = playedSongList;
  }
}
