package ooseguru.usermgmt;

import ooseguru.usermgmt.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by achyut on 3/8/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Gradle");

        User u1 = new User();
        u1.setFirstName("Achyut");
        u1.setLastName("Timsina");
        u1.setUserName("ooseguru");
        u1.setEmail("actimsina@gmail.com");

        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();

        se.save(u1);

        se.getTransaction().commit();
        se.close();
    }
}
