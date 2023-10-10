package com.group1.edufy_media.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "songUser")
public class User {

    // Properties:

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_name")
    private String username;

    @OneToMany (mappedBy = "user" ,cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.REMOVE})
    @JsonIgnore
    private List <GenrePreference> genrePreferences;

    @OneToMany (mappedBy = "user" ,cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.REMOVE})
    @JsonIgnore
    private List <PlayedSong> playedSongList;

    // Constructors:

    public User() {
    }

    public User(int id, String username, List<GenrePreference> genrePreferences, List<PlayedSong> playedSongList) {
        this.id = id;
        this.username = username;
        this.genrePreferences = genrePreferences;
        this.playedSongList = playedSongList;
    }

    // Methods:


    // Getters and Setters:


    public List<PlayedSong> getPlayedSongList() {
        return playedSongList;
    }

    public void setPlayedSongList(List<PlayedSong> playedSongList) {
        this.playedSongList = playedSongList;
    }

    public List<GenrePreference> getGenrePreferences() {
        return genrePreferences;
    }

    public void setGenrePreferences(List<GenrePreference> genrePreferences) {
        this.genrePreferences = genrePreferences;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
