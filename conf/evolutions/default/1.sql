# --- First database schema

# --- !Ups

CREATE TABLE article (
    id INTEGER NOT NULL auto_increment,
    title VARCHAR(255),
    text LONGTEXT,
    create_at DATETIME NOT NULL,
    primary key(id)
    );


# --- !Downs

DROP TABLE article;