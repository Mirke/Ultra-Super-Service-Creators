INSERT INTO album (album_name)
VALUES ('Yoyoyoyo');

INSERT INTO album (album_name)
VALUES ('Yoyoyoyo - the sequel');

INSERT INTO album (album_name)
VALUES ('Shit hits hard (when you´re out of luck)');

INSERT INTO album (album_name)
VALUES ('Dansa i freon');

INSERT INTO album (album_name)
VALUES ('A Blaze in the Northern Sky');

INSERT INTO artist (artist_id, artist_name)
values ( 1, 'Johnny Bode');

INSERT INTO artist (artist_id, artist_name)
values ( 2, 'Grisha');

INSERT INTO artist (artist_id, artist_name)
values ( 3, 'Maharajas');

INSERT INTO artist (artist_id, artist_name)
values ( 4, 'NWA');

INSERT INTO artist (artist_id, artist_name)
values ( 5, 'Darkthrone');

INSERT INTO genre (id, genre_name)
values ( 1, 'TRVE Black Metal');

INSERT INTO genre (id, genre_name)
values ( 2, 'Art-rock');

INSERT INTO genre (id, genre_name)
values ( 3, 'Psych');

INSERT INTO genre (id, genre_name)
values ( 4, 'Gaaangsta');

INSERT INTO genre (id, genre_name)
values ( 5, '60´s Garage');

INSERT INTO podcast_creator (podcast_creator_id, podcast_creator_name)
VALUES (1, 'Mikael Peterson');

INSERT INTO podcast_creator (podcast_creator_id, podcast_creator_name)
VALUES (2, 'Varg Vikernes');

INSERT INTO podcast_creator (podcast_creator_id, podcast_creator_name)
VALUES (3, 'Marcus Friberg');

INSERT INTO podcast_creator (podcast_creator_id, podcast_creator_name)
VALUES (4, 'Tomas Wigell');

INSERT INTO podcast_creator (podcast_creator_id, podcast_creator_name)
VALUES (5, 'Elvis "The King" Presley');

INSERT INTO media_type (id, media_type_name)
values (1, 'CD');

INSERT INTO media_type (id, media_type_name)
values (2, 'Stenkaka');

INSERT INTO media_type (id, media_type_name)
values (3, 'Kasettband');

INSERT INTO media_type (id, media_type_name)
values (4, 'Rullband');

INSERT INTO media_type (id, media_type_name)
values (5, 'MP3');

INSERT INTO podcast (id, media_name, release_date, genre_id, media_type_id, podcast_creator_id)
values ( 1, 'Ibland så är det inte så jävla enkelt', 1981-01-03, 1, 1, 1 );

INSERT INTO podcast (id, media_name, release_date, genre_id, media_type_id, podcast_creator_id)
values ( 2, 'Who let the dogs out?', 1981-01-07, 2, 2, 2 );

INSERT INTO podcast (id, media_name, release_date, genre_id, media_type_id, podcast_creator_id)
values ( 3, 'It´s not you, it´s me', 1981-01-13, 3, 3, 3 );

INSERT INTO podcast (id, media_name, release_date, genre_id, media_type_id, podcast_creator_id)
values ( 4, 'No soup for you!', 1981-01-19, 4, 4, 4 );

INSERT INTO podcast (id, media_name, release_date, genre_id, media_type_id, podcast_creator_id)
values ( 5, 'Falling down - en studie i sammanbrott', 1978-03-29, 5, 5, 5 );

INSERT INTO song (id, media_name, release_date, genre_id, media_type_id, album_id, artist_id)
values ( 1, 'Sunday Morning Coming Down', 1968-03-01, 1, 1, 1, 1);

INSERT INTO song (id, media_name, release_date, genre_id, media_type_id, album_id, artist_id)
values ( 2, 'Amish Paradise', 1992-03-01, 2, 2, 2, 2);

INSERT INTO song (id, media_name, release_date, genre_id, media_type_id, album_id, artist_id)
values ( 3, 'Mr. Pharmacist', 1964-03-01, 3, 3, 3, 3);

INSERT INTO song (id, media_name, release_date, genre_id, media_type_id, album_id, artist_id)
values ( 4, 'Put The Clock Back On The Wall', 1966-03-01, 4, 4, 4, 4);

INSERT INTO song (id, media_name, release_date, genre_id, media_type_id, album_id, artist_id)
values ( 5, 'Who Killed Marilyn?', 1978-03-01, 5, 5, 5, 5);

INSERT INTO video_creator (video_creator_id, video_creator_name)
VALUES ( 1, 'Andreas Jonsson');

INSERT INTO video_creator (video_creator_id, video_creator_name)
VALUES ( 2, 'Glen Danzig');

INSERT INTO video_creator (video_creator_id, video_creator_name)
VALUES ( 3, 'Skådisarna i Silicon Valley');

INSERT INTO video_creator (video_creator_id, video_creator_name)
VALUES ( 4, 'Ted Bundy');

INSERT INTO video_creator (video_creator_id, video_creator_name)
VALUES ( 5, 'Jeffrey Dahmer');

INSERT INTO video (id, media_name, release_date, genre_id, media_type_id, video_creator_id)
VALUES ( 1, 'Murder was the case', 1995-01-02, 1, 1, 1 );

INSERT INTO video (id, media_name, release_date, genre_id, media_type_id, video_creator_id)
VALUES ( 2, 'Autobahn', 1980-01-02, 2, 2, 2 );

INSERT INTO video (id, media_name, release_date, genre_id, media_type_id, video_creator_id)
VALUES ( 3, 'Der Model', 1980-03-02, 3, 3, 3 );

INSERT INTO video (id, media_name, release_date, genre_id, media_type_id, video_creator_id)
VALUES ( 4, 'Das Boot', 1989-03-02, 4, 4, 4);

INSERT INTO video (id, media_name, release_date, genre_id, media_type_id, video_creator_id)
VALUES ( 5, 'Ich habe Frühstuck gegessen', 1918-03-02, 5, 5, 5);