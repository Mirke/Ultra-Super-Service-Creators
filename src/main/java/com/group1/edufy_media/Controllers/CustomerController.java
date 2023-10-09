package com.group1.edufy_media.Controllers;


import com.group1.edufy_media.Model.Album;
import com.group1.edufy_media.Repositories.PlayedSongRepository;
import com.group1.edufy_media.Services.*;

import com.group1.edufy_media.Model.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/edufy")
public class CustomerController {
    //properties
    @Autowired
    private AlbumService albumService;

    @Autowired
    private GenreService genreService;

    @Autowired
    private PodcastCreatorService podcastCreatorService;

    @Autowired
    private ArtistService artistService;

    @Autowired
    private MediaService mediaService;

    @Autowired
    private UserService userService;

    @Autowired
    private PlayedSongService playedSongService;


    // Constructors:
    public CustomerController() {

    }
    public CustomerController(AlbumService albumService) {
        this.albumService = albumService;
    }

    // Methods:
    @GetMapping("/allalbums")
    public List<Album> getAllAlbums() {
        return albumService.getAllAlbums();
    }

    @GetMapping("/albumsbyartist/{creator_id}")
    List<Album> getAlbumsByArtist(@PathVariable("creator_id") int creatorId) {
        return albumService.getAlbumsByArtist(creatorId);
    }

    @GetMapping("/getsongsinalbum/{album_id}")
    List<Song> displaySongsInAlbum(@PathVariable("album_id") int album_id) {
        return mediaService.displaySongsInAlbum(album_id);
    }

    @GetMapping("/getAllArtists/")
    public List<Artist> getAllArtists(){
        return artistService.getAllArtists();
    }

    @GetMapping("/getAllGenres/")
    public List<Genre> getAllGenres(){
        return genreService.getAllGenres();

    }

    @GetMapping("/getAllPodcastCreators/")
    public List<PodcastCreator> getAllPodcastCreators(){
        return podcastCreatorService.getAllPodcastCreators();
    }

    @GetMapping("/getAllMediaOnServer/")
    public List<Media> getAllMediaOnServer(){
        return mediaService.findAllMedia();
    }

    @GetMapping("/sortMediaByGenreId/")
    public Stream<Media> sortMediaByGenreId(){return mediaService.sortAllMediaByGenre();}

    @GetMapping("/sortMediaByMediaTypeId/")
    public Stream<Media> getAllVideo(){return mediaService.sortAllMediaByMediaType();}

    @GetMapping("/getMediaTypeById/{media_type_id}")
    public Stream<Media> getMediaTypeById(@PathVariable("media_type_id") int media_type_id){
        return mediaService.getMediaTypeById(media_type_id);
    }

    @GetMapping("/getGenreById/{genre_id}")
    public Stream<Media> getGenreById(@PathVariable("genre_id") int genre_id){
        return mediaService.getGenreById(genre_id);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userService.findAll();
    }


    // Endpoint in development:

    @GetMapping("/getUsersGenrePreferences")
    public Stream<GenrePreference> getUsersGenrePreferences(@RequestBody User user){
        return userService.getUserGenrePreferences(user);
    }

    @GetMapping("/getUsersPlayedSongs")
    public Stream<PlayedSong> getUsersPlayedSongs(@RequestBody User user){

        return userService.findPlayedSongsByUser(user);

    }

    @GetMapping("/getAllPlayedSongs")
    public List<PlayedSong> getAllPlayedSongs(){

        return playedSongService.findAll();

    }




//    @GetMapping("/findAllMediaByQuery/")
//    public List<Optional> getAllMediaEntitiesByQuery(){return mediaService.getAllMediaEntitiesByQuery();}

    /*
    @GetMapping("/mediabyspecificcontentcontributer/{id}")
        public List<Media> allMediaByASpecificContentContributer (@PathVariable("id") int contentContributorId) {

        return mediaService.getMediaByCreator(contentContributorId);


//
//    @GetMapping("/mediabyspecificcontentcontributer/{id}")
//        public List<Media> allMediaByASpecificContentContributer (@PathVariable("id") int contentContributorId) {
//
//        return mediaService.getMediaByCreator(contentContributorId);
//
//    }
//
//    @GetMapping("/topmediaforuser/{id}")
//    public List<Media> topthreemediaforauser (@PathVariable("id") int userId) {
//
//        return userService.getTopThreeMedia(userId);
//
//    }
//
//    @GetMapping("recommendedmediaforuser/{id}")
//    public List<Media> getRecommendedMediaForAUser (@PathVariable("id") int userId) {
//
//        // This endpoint will be the most complex one since it will require a lot of logic from the service-class since it should provide a
//        // recommendation of 10 media that has not been played for a user and also should  be suited for the user based on it’s preferred genre.
//
//        return userService.getRecommendedMedia(userId);
//
//    }
//
//    @GetMapping ("allalbumsforacreator/{id}")
//    public List<Album> getAllAlbumsForAContentCreator (@PathVariable("id") int contentCreatorId) {
//
//        return albumService.getAllAlbumsForACreator(contentCreatorId);
//
//    }
//
//
//    @PutMapping ("user/{userId}/playmedia/{mediaId}")
//    public void userPlaysMedia (@PathVariable("userId") int userId, @PathVariable("mediaId") int mediaId) {
//
//        // This endpoint should contain the logic that adds the media to the user array of the media played.
//        // AND also add the number of times that this media has been played.
//
//        userService.addMediaToPlayedList(userId, mediaId);
//
//    }
//
//    @PutMapping ("user/{userId}/likemedia/{mediaId}")
//    public void userLikesMedia (@PathVariable("userId") int userId, @PathVariable("mediaId") int mediaId) {
//
//        // This endpoint should register if the genre of the media is LIKED by the user and
//        // then add this to a “likedGenresArrayList” that later can be checked to provide other media that the user like.
//
//        userService.addMediagenreToLiked(userId, mediaId);
//
//    }
//
//    @PutMapping ("user/{userId}/dislikemedia/{mediaId}")
//    public void userDislikesMedia (@PathVariable("userId") int userId, @PathVariable("mediaId") int mediaId) {
//
//        // This endpoint should register if the genre of the media is DISLIKED by the user and
//        // then add this to a “dislikedGenresArrayList” that later can be checked to provide other media that the user like.
//
//        userService.addMediagenreToDisliked(userId, mediaId);
//
//    }




    @GetMapping("recommendedmediaforuser/{id}")
    public List<Media> getRecommendedMediaForAUser (@PathVariable("id") int userId) {

        // This endpoint will be the most complex one since it will require a lot of logic from the service-class since it should provide a
        // recommendation of 10 media that has not been played for a user and also should  be suited for the user based on it’s preferred genre.

        return userService.getRecommendedMedia(userId);

    }

    @GetMapping ("allalbumsforacreator/{id}")
    public List<Album> getAllAlbumsForAContentCreator (@PathVariable("id") int contentCreatorId) {

        return albumService.getAllAlbumsForACreator(contentCreatorId);

    }


    @PutMapping ("user/{userId}/playmedia/{mediaId}")
    public void userPlaysMedia (@PathVariable("userId") int userId, @PathVariable("mediaId") int mediaId) {

        // This endpoint should contain the logic that adds the media to the user array of the media played.
        // AND also add the number of times that this media has been played.

        userService.addMediaToPlayedList(userId, mediaId);

    }

    @PutMapping ("user/{userId}/likemedia/{mediaId}")
    public void userLikesMedia (@PathVariable("userId") int userId, @PathVariable("mediaId") int mediaId) {

        // This endpoint should register if the genre of the media is LIKED by the user and
        // then add this to a “likedGenresArrayList” that later can be checked to provide other media that the user like.

        userService.addMediagenreToLiked(userId, mediaId);

    }

    @PutMapping ("user/{userId}/dislikemedia/{mediaId}")
    public void userDislikesMedia (@PathVariable("userId") int userId, @PathVariable("mediaId") int mediaId) {

        // This endpoint should register if the genre of the media is DISLIKED by the user and
        // then add this to a “dislikedGenresArrayList” that later can be checked to provide other media that the user like.

        userService.addMediagenreToDisliked(userId, mediaId);

    }*/


}
