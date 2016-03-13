package ooseguru;

import ooseguru.model.User;
import ooseguru.util.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by achyut on 3/13/16.
 */
public class Main {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setFirstName("Achyut");
        u1.setLastName("Timsina");

        Session se = HibernateUtil.getSessionFactory().openSession();

        se.beginTransaction();

        se.save(u1);

        se.getTransaction().commit();
        se.close();

        HibernateUtil.getSessionFactory().close();

    }
}
