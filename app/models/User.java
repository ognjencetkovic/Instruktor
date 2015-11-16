package models;

import com.avaje.ebean.Model;
import javax.persistence.*;
import play.data.validation.Constraints;

import java.util.Calendar;

/**
 * Created by ognje on 16-Nov-15.
 */
@Entity
public class User extends Model {

    @Id
    private long id;
    @Constraints.Email
    @Column (unique = true)
    @Constraints.Required
    private String email;
    @Constraints.Pattern ("[a-zA-Z]+")
    private String firstName;
    @Constraints.Pattern ("[a-zA-Z]+")
    private String lastName;
    @Constraints.MinLength (8)
    @Constraints.MaxLength (25)
    @Constraints.Required
    private String password;
    private Calendar accountCreated;
    private boolean admin = false;
    private String token;
    private boolean validated = false;


}
