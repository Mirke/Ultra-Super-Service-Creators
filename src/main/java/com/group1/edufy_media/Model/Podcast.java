package com.group1.edufy_media.Model;

import jakarta.persistence.*;

/**
 * <code>Podcast</code> - Podcast Entity (Extends from Media)
 *
 * @author Mikael Eriksson (mikael.eriksson@edu.edugrade.se)(Added 22/9/23)
 * @version 0.0.1
 */

/**
 * Future changes needed, future gotchas are some things that are transient now might need to be singular or plural.
 */

@Entity
@Table(name = "podcast")
public class Podcast extends Media {

    // -----------------------------------------------------------------------------------------------------------------
    // Properties
    // -----------------------------------------------------------------------------------------------------------------
    // Transient - This is excluded until we have a database and set relations.
    @ManyToOne(targetEntity = PodcastCreator.class)
    @JoinColumn(name = "podcast_creator_id")
    private ContentContributor podcastCreator;

    // -----------------------------------------------------------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------------------------------------------------------

    public Podcast() {
    }

    public Podcast(int id, String name, Genre genre, MediaType mediaType, String releaseDate, ContentContributor podcastCreator) {
        super(id, name, genre, mediaType, releaseDate);
        this.podcastCreator = podcastCreator;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Getter & Setters
    // -----------------------------------------------------------------------------------------------------------------
    public ContentContributor getPodcastCreator() {
        return podcastCreator;
    }

    public void setPodcastCreator(ContentContributor podcastCreator) {
        this.podcastCreator = podcastCreator;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Overwritten Methods
    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Podcast{" +
                "podcastCreator=" + podcastCreator +
                '}';
    }
}
