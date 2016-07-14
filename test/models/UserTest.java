package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
    }

    @Test
    public void UserAddTest02() throws Exception {
        User actual = new User("mayok", "hoge");
        actual.save();
    }


}