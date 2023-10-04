package com.group1.edufy_media.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "playback_video")
public class PlaybackVideo extends Playback{

    // Properties, as defined in the abstract class and also:

    @ManyToOne(targetEntity = Song.class)
    @JoinColumn(name = "id")
    private Video video;

}