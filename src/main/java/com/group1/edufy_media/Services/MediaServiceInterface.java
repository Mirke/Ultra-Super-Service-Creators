package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.Media;
import com.group1.edufy_media.Model.Song;

import java.util.List;
import java.util.stream.Stream;

public interface MediaServiceInterface
{
    List<Media> findAllMedia();
    List<Song> displaySongsInAlbum(int album_id);
    Stream<Media> sortAllMediaByGenre();
    Stream<Media> sortAllMediaByMediaType();
    Stream<Media> findMediaPlayedByUser();

    }
