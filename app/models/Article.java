package models;

import javax.persistence.Entity;
import javax.persistence.Id;
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
    return title;
  }

  public String getContent() {
    return content;
  }

  public int getArticleId() {
    return articleId;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
