package ooseguru.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by achyut on 3/10/16.
 */
public class HibernateUtil{

    private static SessionFactory sf = configureSessionFactory();
    private static ServiceRegistry serviceRegistry;

    private static SessionFactory configureSessionFactory() {
        try {
            Configuration config = new Configuration();
            config.configure();
            serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(config.getProperties()).build();
            sf = config.buildSessionFactory();
            return  sf;
        } catch (Throwable ex){
            System.err.println("Session factory creation failed." +ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory(){
        return sf;
    }
    public static void shutdown(){
        getSessionFactory().close();
    }
}

