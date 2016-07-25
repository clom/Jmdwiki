# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table article (
  article_id                    integer auto_increment not null,
  title                         varchar(255) not null,
  content                       varchar(255) not null,
  modify_time                   datetime(6) not null,
  constraint pk_article primary key (article_id)
);

create table user (
  id                            bigint auto_increment not null,
  name                          varchar(255) not null,
  password_digest               varchar(255) not null,
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists article;

drop table if exists user;

