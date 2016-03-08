package ooseguru.usermgmt.model;

import javax.persistence.*;

/**
 * Created by achyut on 3/8/16.
 */

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int Id;

    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="username")
    private String userName;
    @Column(name="email")
    private String email;

    public int getId(){
        return this.Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
