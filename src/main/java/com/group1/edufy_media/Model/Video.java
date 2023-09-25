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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Transient - This is excluded until we have a database and set relations.
    @Transient
    @JoinColumn(name = "creator_id")
    private ContentContributor creator;

    // -----------------------------------------------------------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------------------------------------------------------

    public Video() {
    }

    public Video(String name, Genre genre, MediaType mediaType, String releaseDate, ContentContributor contentContributor) {
        super(name, genre, mediaType, releaseDate);
        this.creator = contentContributor;
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

    public ContentContributor getCreator() {
        return creator;
    }

    public void setCreator(ContentContributor creator) {
        this.creator = creator;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Overwritten Methods
    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", creator=" + creator +
                '}';
    }
}
