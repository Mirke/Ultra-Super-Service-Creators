package com.group1.edufy_media.Model;

import jakarta.persistence.*;

/**
 * <code>Video</code> - Video Entity (Extends from Media)
 *
 * @author Mikael Eriksson (mikael.eriksson@edu.edugrade.se)(Added 22/9/23)
 * @version 0.0.1
 */

/**
 * Future changes needed, future gotchas are some things that are transient now might need to be singular or plural.
 */

@Entity
@Table(name = "video")
public class Video extends Media{

    // -----------------------------------------------------------------------------------------------------------------
    // Properties
    // -----------------------------------------------------------------------------------------------------------------

    @ManyToOne(targetEntity = VideoCreator.class)
    @JoinColumn(name = "video_creator_id")
    private ContentContributor videoCreator;

    // -----------------------------------------------------------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------------------------------------------------------

    public Video() {
    }

    public Video(int id, String name, Genre genre, MediaType mediaType, String releaseDate, ContentContributor videoCreator) {
        super(id, name, genre, mediaType, releaseDate);
        this.videoCreator = videoCreator;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Getter & Setters
    // -----------------------------------------------------------------------------------------------------------------

    public ContentContributor getVideoCreator() {
        return videoCreator;
    }

    public void setVideoCreator(ContentContributor videoCreator) {
        this.videoCreator = videoCreator;
    }


    // -----------------------------------------------------------------------------------------------------------------
    // Overwritten Methods
    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Video{" +
                "videoCreator=" + videoCreator +
                '}';
    }
}
