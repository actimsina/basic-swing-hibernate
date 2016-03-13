package ooseguru;

import ooseguru.model.User;
import ooseguru.util.HibernateUtil;
import ooseguru.view.UserView;
import org.hibernate.Session;

import java.awt.*;

/**
 * Created by achyut on 3/13/16.
 */
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                UserView uv = new UserView();
                uv.createUserView();
            }
        });
    }
}
