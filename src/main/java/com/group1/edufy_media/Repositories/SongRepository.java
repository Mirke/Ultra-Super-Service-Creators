package com.group1.edufy_media.Repositories;

import com.group1.edufy_media.Model.Media;
import com.group1.edufy_media.Model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song,Integer> {
    List<Song> findSongsByAlbum_Id(int albumId);
    Song findById(int songId);
}
