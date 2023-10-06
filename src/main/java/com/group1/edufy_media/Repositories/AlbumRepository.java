package com.group1.edufy_media.Repositories;

import com.group1.edufy_media.Model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {
    List<Album> findAlbumsByArtistId(int creatorId);
}
