package com.group1.edufy_media.Model;

import jakarta.persistence.*;

import java.io.Serializable;

/**
 * <code>Song</code> - Song Entity (Extends from Media)
 *
 * @author Mikael Eriksson (mikael.eriksson@edu.edugrade.se)(Added 22/9/23)
 * @version 0.0.1
 */

/**
 * Future changes needed, future gotchas are some things that are transient now might need to be singular or plural.
 */

@Entity
@Table(name = "song")
public class Song extends Media implements Serializable {

    // -----------------------------------------------------------------------------------------------------------------
    // Properties
    // -----------------------------------------------------------------------------------------------------------------

    // Transient - This is excluded until we have a database and set relations.
    @ManyToOne(targetEntity = Artist.class)
    @JoinColumn(name = "artist_id")
    private ContentContributor artist;

    // Relation needs to be inspected in the future.
    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;


    // -----------------------------------------------------------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------------------------------------------------------

    public Song() {
    }

    public Song(int id, String name, Genre genre, MediaType mediaType, String releaseDate, ContentContributor artist, Album album) {
        super(id, name, genre, mediaType, releaseDate);
        this.artist = artist;
        this.album = album;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Getter & Setters
    // -----------------------------------------------------------------------------------------------------------------

    public ContentContributor getArtist() {
        return artist;
    }

    public void setArtist(ContentContributor artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }


    // -----------------------------------------------------------------------------------------------------------------
    // Overwritten Methods
    // -----------------------------------------------------------------------------------------------------------------


    @Override
    public String toString() {
        return "Song{" +
                "artist=" + artist +
                ", album=" + album +
                '}';
    }
}
