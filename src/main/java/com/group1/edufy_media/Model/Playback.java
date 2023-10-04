package com.group1.edufy_media.Model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Playback {

    // Properties:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "playback_id", nullable = false)
    private int playbackId;

    @Column(name = "number_of_times_played")
    private int plays;

    @Column(name = "media_is_liked")
    private boolean isMediaLiked;


    // Constructors:


    public Playback(int playbackId, int plays, boolean isMediaLiked) {
        this.playbackId = playbackId;
        this.plays = plays;
        this.isMediaLiked = isMediaLiked;
    }

    public Playback() {

    }


    // Methods:


    public boolean getMediaLiked() {
        return isMediaLiked;
    }

    public void setMediaLiked(boolean mediaLiked) {
        isMediaLiked = mediaLiked;
    }

    public int getPlaybackId() {
        return playbackId;
    }

    public void setPlaybackId(int playbackId) {
        this.playbackId = playbackId;
    }

    public int getPlays() {
        return plays;
    }

    public void setPlays(int plays) {
        this.plays = plays;
    }
}

