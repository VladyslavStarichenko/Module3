CREATE TABLE Subscriptions(
                              subscription_id integer PRIMARY KEY,
                              user_id integer,
                              follower_id integer,
                              subscriber_id integer,
                              FOREIGN KEY (user_id) REFERENCES Users (user_id)
);

CREATE TABLE Users(
                      user_id integer PRIMARY KEY,
                      full_name character varying(255) NOT NULL,
                      login character varying(255),
                      email character varying(255),
                      age integer,
                      isAuthor boolean,
                      isModerator boolean
);
CREATE TABLE Post(
                     post_id integer PRIMARY KEY,
                     title character varying(100),
                     content_ character varying(1000),
                     user_author_id integer,
                     user_moderator_id integer,
                     rating integer,
                     status character varying (100),
                     FOREIGN KEY (user_author_id) REFERENCES Users (user_id)
);
