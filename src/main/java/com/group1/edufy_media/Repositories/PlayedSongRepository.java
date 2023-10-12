package com.group1.edufy_media.Repositories;

import com.group1.edufy_media.Model.PlayedSong;
import com.group1.edufy_media.Model.Security.Users;
import com.group1.edufy_media.Model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayedSongRepository extends JpaRepository<PlayedSong, Integer> {

    List<PlayedSong> findPlayedSongsByUser(Users user);

    PlayedSong findPlayedSongsBySongAndUser(Song song, Users user);

}
