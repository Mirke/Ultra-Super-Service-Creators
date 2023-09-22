package com.group1.edufy_media.Model;

/**
 * <code>Video</code> - Video Entity (Extends from Media)
 *
 * @author Mikael Eriksson (mikael.eriksson@edu.edugrade.se)(Added 22/9/23)
 * @version 0.0.1
 */

public class Video extends Media{

    // -----------------------------------------------------------------------------------------------------------------
    // Properties
    // -----------------------------------------------------------------------------------------------------------------

    private ContentContributor contentContributor;

    // -----------------------------------------------------------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------------------------------------------------------

    public Video() {
    }

    public Video(String name, Genre genre, MediaType mediaType, String releaseDate, ContentContributor contentContributor) {
        super(name, genre, mediaType, releaseDate);
        this.contentContributor = contentContributor;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Getter & Setters
    // -----------------------------------------------------------------------------------------------------------------


    public ContentContributor getContentContributor() {
        return contentContributor;
    }

    public void setContentContributor(ContentContributor contentContributor) {
        this.contentContributor = contentContributor;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Overwritten Methods
    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Video{" +
                "contentContributor=" + contentContributor +
                '}';
    }
}
