package com.group1.edufy_media;

import com.group1.edufy_media.Model.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class EdufyMediaApplicationTests {

    //@Autowired
    //private Controller controllerName

    //@Autowired
    //private Service serviceName

    @DisplayName("Album.class is not null")
    @Test
    void albumClassLoaded() {
        assertThat(Album.class).isNotNull();
    }

    @DisplayName("Artist class is not null.")
    @Test
    void artistClassLoaded() {
        assertThat(Artist.class).isNotNull();
    }
    @DisplayName("ContentContributor interface is not null.")
    @Test
    void contentContributorInterfaceLoaded() {
        assertThat(ContentContributor.class).isNotNull();
    }
    @DisplayName("Genre class is not null.")
    @Test
    void genreClassLoaded() {
        assertThat(Genre.class).isNotNull();
    }
    @DisplayName("Media abstract class is not null.")
    @Test
    void mediaAbstractClassLoaded() {
        assertThat(Media.class).isNotNull();
    }
    @DisplayName("MediaType class is not null.")
    @Test
    void mediaTypeClassLoaded() {
        assertThat(MediaType.class).isNotNull();
    }
    @DisplayName("Podcast class is not null.")
    @Test
    void podcastClassLoaded() {
        assertThat(Podcast.class).isNotNull();
    }
    @DisplayName("PodcastCreator class is not null.")
    @Test
    void podcastCreatorClassLoaded() {
        assertThat(PodcastCreator.class).isNotNull();
    }
    @DisplayName("Song class is not null.")
    @Test
    void songClassLoaded() {
        assertThat(Song.class).isNotNull();
    }
    @DisplayName("Video class is not null.")
    @Test
    void videoClassLoaded() {
        assertThat(Video.class).isNotNull();
    }
    @DisplayName("VideoCreator class is not null.")
    @Test
    void videoCreatorClassLoaded() {
        assertThat(VideoCreator.class).isNotNull();
    }
}
