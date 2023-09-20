package com.group1.edufy_media.Model;

public class Media {
    //properties

    private int id;
    private String name;
    private Creator creator;
    private Genre genre;
    private MediaType mediaType;
    private String releaseDate;
    private Album album;

    //constructors
    public Media() {
    }

    public Media(int id, String name, Creator creator, Genre genre, MediaType mediaType, String releaseDate, Album album) {
        this.id = id;
        this.name = name;
        this.creator = creator;
        this.genre = genre;
        this.mediaType = mediaType;
        this.releaseDate = releaseDate;
        this.album = album;
    }

    //getters & setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Creator getCreator() {
        return creator;
    }
    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public MediaType getMediaType() {
        return mediaType;
    }
    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Album getAlbum() {
        return album;
    }
    public void setAlbum(Album album) {
        this.album = album;
    }

    //toString
    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creator=" + creator +
                ", genre=" + genre +
                ", mediaType=" + mediaType +
                ", releaseDate='" + releaseDate + '\'' +
                ", album=" + album +
                '}';
    }
}
