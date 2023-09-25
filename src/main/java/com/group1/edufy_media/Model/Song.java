package com.group1.edufy_media.Model;

/**
 * <code>Song</code> - Song Entity (Extends from Media)
 *
 * @author Mikael Eriksson (mikael.eriksson@edu.edugrade.se)(Added 22/9/23)
 * @version 0.0.1
 */

public class Song extends Media{

    // -----------------------------------------------------------------------------------------------------------------
    // Properties
    // -----------------------------------------------------------------------------------------------------------------

    private ContentContributor artist;
    private Album album;


    // -----------------------------------------------------------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------------------------------------------------------

    public Song() {
    }

    public Song(ContentContributor artist, Album album) {
        this.artist = artist;
        this.album = album;
    }

    public Song(String name, Genre genre, MediaType mediaType, String releaseDate, ContentContributor artist, Album album) {
        super(name, genre, mediaType, releaseDate);
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
