package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.Album;
import com.group1.edufy_media.Model.Artist;

import java.util.List;
import java.util.Optional;

public interface AlbumServiceInterface {
    List<Album> getAllAlbums();
    List<Album> getAlbumsByArtist(int creatorId);
}
