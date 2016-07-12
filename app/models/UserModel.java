package models;


/**
 * Created by nonoca on 7/12/16.
 */

import com.avaje.ebean.Model;
import play.data.validation.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModel extends Model {

    @Id
    public int id;

    public String name;

    public String passwordDigest;
}
