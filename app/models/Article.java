package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.*;
import com.avaje.ebean.annotation.UpdatedTimestamp;

import java.util.Date;

@Entity
public class Article extends Model {

  @Id
  @Column(name="article_id")
  private Integer articleId;
  @NotNull
  @Column(name="title")
  private String title;
  @NotNull
  @Column(name="content",columnDefinition = "TEXT")
  private String content;
  @UpdatedTimestamp
  @Column(name="modify_time")
  private Date modifyTime;

  public Article() {
  }

  public Article(String title, String content) {
	this.title = title;
	this.content = content;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }

  public Integer getArticleId() {
    return articleId;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public static final Find<Integer,Article> find = new Find<Integer,Article>(){};


}
