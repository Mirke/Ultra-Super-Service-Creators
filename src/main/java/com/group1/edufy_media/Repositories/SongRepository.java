package com.group1.edufy_media.Repositories;

import com.group1.edufy_media.Model.Artist;
import com.group1.edufy_media.Model.Media;
import com.group1.edufy_media.Model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Integer> {

    Artist findById (int contentContributorId);

    List<Song> findAllByArtist(Artist artist);

}
