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
    public String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static final Find<Long, User> finder = new Find<Long, User>(){};

}
