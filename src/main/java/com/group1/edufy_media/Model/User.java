package com.group1.edufy_media.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class User {

    // Properties:

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    private int personId;

    @Column(name = "username")
    private String username;

    @OneToMany
    @Column(name = "liked_genres_list")
    private List<Genre> likedGenresList;

    @OneToMany
    @Column(name = "diliked_genres_list")
    private List<Genre> disLikedGenresList;

    /*
    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinColumn(name = "playback_id")
    private List<Playbacks> playedMedia;

     */

    // Constructors:

    public User(int personId, String username, List<Genre> likedGenresList, List<Genre> disLikedGenresList, List<Playback> playedMedia) {
        this.personId = personId;
        this.username = username;
        this.likedGenresList = likedGenresList;
        this.disLikedGenresList = disLikedGenresList;
        //this.playedMedia = playedMedia;
    }

    public User() {

    }

    // Methods:


    // Getters and setters:

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Genre> getLikedGenresList() {
        return likedGenresList;
    }

    public void setLikedGenresList(List<Genre> likedGenresList) {
        this.likedGenresList = likedGenresList;
    }

    public List<Genre> getDisLikedGenresList() {
        return disLikedGenresList;
    }

    public void setDisLikedGenresList(List<Genre> disLikedGenresList) {
        this.disLikedGenresList = disLikedGenresList;
    }

    /*
    public List<Playback> getPlayedMedia() {
        return playedMedia;
    }

    public void setPlayedMedia(List<Playback> playedMedia) {
        this.playedMedia = playedMedia;
    }

     */

}
