package com.group1.edufy_media.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "playback_podcast")
public class PlaybackPodcast extends Playback{

    // Properties, as defined in the abstract class and also:

    @ManyToOne(targetEntity = Podcast.class)
    @JoinColumn(name = "id")
    private Podcast podcast;

    // Constructors:

    public PlaybackPodcast(int playbackId, int plays, boolean isMediaLiked, Podcast podcast) {
        super(playbackId, plays, isMediaLiked);
        this.podcast = podcast;
    }


    public PlaybackPodcast() {

    }

    // Getters and setters:

    public Podcast getPodcast() {
        return podcast;
    }

    public void setPodcast(Podcast podcast) {
        this.podcast = podcast;
    }

}
