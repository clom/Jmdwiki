package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertTrue;
import static play.test.Helpers.*;

/**
 * Created by nonoca on 7/14/16.
 */
public class UserTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void UserAddTest01() {
      running(fakeApplication(), new Runnable() {
        public void run() {
          User actual = new User();
          actual.setName("mayok");
          actual.setPasswordDigest("hoge");
          actual.save();
          assertNotNull(actual.name);
          assertNotNull(actual.passwordDigest);
        }
      });
    }

    @Test
    public void UserAddTest02() throws Exception{
      running(fakeApplication(), new Runnable() {
        public void run() {
          User actual = new User("mayok", "hoge");
          actual.save();
          assertNotNull(actual.name);
          assertNotNull(actual.passwordDigest);
        }
      });
    }

    @Test
    public void UserAddTest03() throws Exception{
      running(fakeApplication(), new Runnable() {
        public void run() {
            try{
                User actual = new User("mayok", null);
                actual.save();
            } catch (NullPointerException e){
                assertTrue(true);
            }
        }
      });
    }

    @Test
    public void UserAddTest04() throws Exception{
      running(fakeApplication(), new Runnable() {
        public void run() {
            try{
                User actual = new User(null, "hoge");
                actual.save();
            } catch (NullPointerException e){
                assertTrue(true);
            }

        }
      });
    }

    @Test
    public void UserAddTest05() throws Exception{
      running(fakeApplication(), new Runnable() {
        public void run() {
            try{
                User actual = new User(null, null);
                actual.save();
            } catch (NullPointerException e){
                assertTrue(true);
            }

        }
      });
    }

    @Test
    public void UserSelectTest01() throws Exception{
      running(fakeApplication(inMemoryDatabase()), new Runnable() {
        public void run() {
            User actual = new User("mayok", "hoge");
            actual.save();
            User expect = User.finder.where().eq("name","mayok").findUnique();
            assertEquals(actual.getName(), expect.getName());
        }
      });
    }

}
