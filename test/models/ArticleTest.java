package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static play.test.Helpers.*;

public class ArticleTest {

  @Test
  public void ArticleSaveTest01() {
    running(fakeApplication(inMemoryDatabase()), new Runnable() {
      public void run() {
        Article article = new Article("test", "testContent");
        article.save();
        assertEquals("test", article.getTitle());
      }
    });
  }

  @Test
  public void ArticleSaveTest02() {
    running(fakeApplication(inMemoryDatabase()), new Runnable() {
      public void run() {
        Article article = new Article("test", "testContent");
        article.save();
        Article expect = Article.find.where().eq("title","test").findUnique();
        assertEquals("test", expect.getTitle());
      }
    });
  }
}
