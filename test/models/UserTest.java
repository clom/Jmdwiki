package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
    public void UserAddTest01() throws Exception {
        User actual = new User();
        actual.setName("mayok");
        actual.setPasswordDigest("hoge");
        actual.save();
        assertNotNull(actual.name);
        assertNotNull(actual.passwordDigest);
    }

    @Test
    public void UserAddTest02(){
        User actual = new User("mayok", "hoge");
        actual.save();
        assertNotNull(actual.name);
        assertNotNull(actual.passwordDigest);
    }

    @Test
    public void UserAddTest03(){
        User actual = new User("mayok", null);
        actual.save();
        assertNotNull(actual.name);
        assertNotNull(actual.passwordDigest);
    }

    @Test
    public void UserAddTest04(){
        User actual = new User(null, "hoge");
        actual.save();
        assertNotNull(actual.name);
        assertNotNull(actual.passwordDigest);
    }

    @Test
    public void UserAddTest05(){
        User actual = new User(null, null);
        actual.save();
        assertNotNull(actual.name);
        assertNotNull(actual.passwordDigest);
    }

    @Test
    public void UserSelectTest01(){
        User actual = new User("mayok", "hoge");
        actual.save();
        User expect = User.finder.where().eq("user", "mayok").findUnique();
        assertEquals(actual.getName(), expect.getName());
    }


}