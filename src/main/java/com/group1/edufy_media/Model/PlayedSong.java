package com.group1.edufy_media.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "played_song")
public class PlayedSong {

    // Properties:

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "media_id")
    private Song song;

    @Column(name = "userHasPlayedSong")
    private boolean userHasPlayedSong;

    // Constructor:


    public PlayedSong() {
    }

    public PlayedSong(int id, User user, Song song, boolean userHasPlayedSong) {
        this.id = id;
        this.user = user;
        this.song = song;
        this.userHasPlayedSong = userHasPlayedSong;
    }

    // GETTERS AND SETTERS:


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public boolean isUserHasPlayedSong() {
        return userHasPlayedSong;
    }

    public void setUserHasPlayedSong(boolean userHasPlayedSong) {
        this.userHasPlayedSong = userHasPlayedSong;
    }
}