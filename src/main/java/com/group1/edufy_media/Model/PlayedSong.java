package com.group1.edufy_media.Model;

import com.group1.edufy_media.Model.Security.Users;
import jakarta.persistence.*;

@Entity
@Table(name = "played_song")
public class PlayedSong {

    // Properties:

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinColumn(name = "username")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "media_id")
    private Song song;

    @Column(name = "userHasPlayedSong")
    private boolean userHasPlayedSong;

    // Constructor:


    public PlayedSong() {
    }

    public PlayedSong(int id, Users user, Song song, boolean userHasPlayedSong) {
        this.id = id;
        this.user = user;
        this.song = song;
        this.userHasPlayedSong = userHasPlayedSong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
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