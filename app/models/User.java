package models;


/**
 * Created by nonoca on 7/12/16.
 */


import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class User extends Model {

    @Id
    public Long id;

    @NotNull
    public String name;

    @NotNull
    public String passwordDigest;

    public User() {
    }

    public User(String name, String passwordDigest) {
        this.name = name;
        this.passwordDigest = passwordDigest;
    }

    public String getName() {
        return name;
    }

    public String getPasswordDigest() {
        return passwordDigest;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasswordDigest(String passwordDigest) {
        this.passwordDigest = passwordDigest;
    }

    public static final Find<Long, User> find = new Find<Long, User>(){};

    public static User authenticate(String name, String password) {
        return find.where().eq("name", name)
            .eq("password", password).findUnique();
    }

}
