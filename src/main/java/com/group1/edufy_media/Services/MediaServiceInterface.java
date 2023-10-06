package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.Media;
import com.group1.edufy_media.Model.Podcast;
import com.group1.edufy_media.Model.Song;

import java.util.List;
import java.util.Optional;

public interface MediaServiceInterface
{
    List<Media> findAllMedia();
    List<Song> displaySongsInAlbum(int album_id);
}
