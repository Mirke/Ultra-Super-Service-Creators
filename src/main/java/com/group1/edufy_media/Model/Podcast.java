package com.group1.edufy_media.Model;

/**
 * <code>Podcast</code> - Podcast Entity (Extends from Media)
 *
 * @author Mikael Eriksson (mikael.eriksson@edu.edugrade.se)(Added 22/9/23)
 * @version 0.0.1
 */

public class Podcast extends Media {

    // -----------------------------------------------------------------------------------------------------------------
    // Properties
    // -----------------------------------------------------------------------------------------------------------------

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
