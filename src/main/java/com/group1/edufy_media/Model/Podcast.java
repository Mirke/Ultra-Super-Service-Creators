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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Transient - This is excluded until we have a database and set relations.
    @Transient
    @JoinColumn(name = "podcastCreator_id")
    private ContentContributor podcastCreator;

    // -----------------------------------------------------------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------------------------------------------------------

    public Podcast() {
    }

    public Podcast(String name, Genre genre, MediaType mediaType, String releaseDate, ContentContributor podcastCreator) {
        super(name, genre, mediaType, releaseDate);
        this.podcastCreator = podcastCreator;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Getter & Setters
    // -----------------------------------------------------------------------------------------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
                "id=" + id +
                ", podcastCreator=" + podcastCreator +
                '}';
    }
}
