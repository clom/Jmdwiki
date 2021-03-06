package models;


/**
 * Created by nonoca on 7/12/16.
 */


import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class User extends Model {

    @Id
    public Long id;

    @NotNull
    @Constraints.Required
    public String name;

    @NotNull
    @Constraints.Required
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

    public static final Find<Long, User> find = new Find<Long, User>(){};

    public static User authenticate(String name, String password) {
        return find.where().eq("name", name)
            .eq("password", password).findUnique();
    }

}
