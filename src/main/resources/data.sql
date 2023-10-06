INSERT INTO artist (artist_name) VALUES
                                     ('Johnny Bode'),
                                     ('Grisha'),
                                     ('Maharajas'),
                                     ('NWA'),
                                     ('Darkthrone');

INSERT INTO album (album_name, creator_id) VALUES
                ('Yoyoyoyo', 1),
                ('Yoyoyoyo - the sequel', 1),
                ('Yoyoyoyo - tredje gången gillt', 1),
                ('Shit hits hard (when you´re out of luck)', 2),
                ('Dansa i freon', 3),
                ('A Blaze in the Northern Sky', 4),
                ('Damn, it feels good to be a gangsta', 5);

INSERT INTO genre (genre_name) VALUES
                ('TRVE Black Metal'),
                ('Art-rock'),
                ('Psych'),
                ('Gaaangsta'),
                ('60´s Garage');

INSERT INTO podcast_creator (podcast_creator_name) VALUES
                ('Mikael Peterson'),
                ('Varg Vikernes'),
                ('Marcus Friberg'),
                ('Tomas Wigell'),
                ('Elvis "The King" Presley');

INSERT INTO media_type (media_type_name) VALUES
                ('Song'),
                ('Podcast'),
                ('Video');

INSERT INTO podcast (media_name, release_date, genre_id, media_type_id, podcast_creator_id) VALUES
                ('Ibland så är det inte så jävla enkelt', '1981-01-03', 1, 2, 1 ),
                ('Who let the dogs out?', '1981-01-07', 2, 2, 2 ),
                ('It´s not you, it´s me', '1981-01-13', 3, 2, 3 ),
                ('No soup for you!', '1981-01-19', 4, 2, 4 ),
                ('Falling down - en studie i sammanbrott', '1978-03-29', 5, 2, 5 );

INSERT INTO song (media_name, release_date, genre_id, media_type_id, album_id, artist_id) VALUES
                ('Sunday Morning Coming Down', '1968-03-01', 1, 1, 1, 1),
                ('Amish Paradise', '1992-03-01', 2, 1, 4, 2),
                ('Mr. Pharmacist', '1964-03-01', 3, 1, 5, 3),
                ('Put The Clock Back On The Wall', '1966-03-01', 4, 1, 5, 3),
                ('Who Killed Marilyn?', '1978-03-01', 5, 1, 5, 3);

INSERT INTO video_creator (video_creator_name) VALUES
                ('Andreas Jonsson'),
                ('Glen Danzig'),
                ('Skådisarna i Silicon Valley'),
                ('Ted Bundy'),
                ('Jeffrey Dahmer');

INSERT INTO video (media_name, release_date, genre_id, media_type_id, video_creator_id) VALUES
                ('Murder was the case', '1995-01-02', 1, 3, 1),
                ('Autobahn', '1980-01-02', 2, 3, 2),
                ('Der Model', '1980-03-02', 3, 3, 3),
                ('Das Boot', '1989-03-02', 4, 3, 4),
                ('Ich habe Frühstuck gegessen', '1918-03-02', 5, 3, 5);