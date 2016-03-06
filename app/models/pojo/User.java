package models.pojo;

import play.data.validation.Constraints;

/**
 * Created by brabo on 3/2/16.
 */
public class User {
    @Constraints.Required
    private String email;
    @Constraints.Required
    @Constraints.MinLength(6)
    @Constraints.MaxLength(256)
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
