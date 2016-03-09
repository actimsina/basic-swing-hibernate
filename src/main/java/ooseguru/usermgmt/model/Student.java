package ooseguru.usermgmt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by achyut on 3/9/16.
 */
@Entity
public class Student {
    @Id
    @GeneratedValue
    private int Id;
    private String Name;

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
