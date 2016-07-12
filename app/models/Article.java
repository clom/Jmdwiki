package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;

@Entity
public class Article extends Model {

  @Id
  private int articleId;
  private int contentId;
  private String title;
  private String content;
  private Timestamp timestamp;

  public Article() {

  }

  public Article(int articleId) {

  }

  public Article(int articleId, int contentId) {

  }

  public String getTitle() {

  }

  public String getContent() {

  }

  public int getArticleId() {

  }

  public void setTitle(String title) {

  }

  public void setContent(String content) {

  }
}
