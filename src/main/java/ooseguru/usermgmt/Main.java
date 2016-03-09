package ooseguru.usermgmt;

import ooseguru.usermgmt.model.Student;
import ooseguru.usermgmt.model.User;
import ooseguru.usermgmt.view.StudentView;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by achyut on 3/8/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Gradle");

        StudentView sv = new StudentView();
        sv.createStudentView();

//        SessionFactory sf = new Configuration().configure().buildSessionFactory();
//        Session se = sf.openSession();
//        se.beginTransaction();
//
//        se.save(u1);
//        se.save(s1);
//        se.getTransaction().commit();
//        se.close();
    }
}
