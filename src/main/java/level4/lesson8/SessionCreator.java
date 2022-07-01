package level4.lesson8;

import level4.lesson8.model.City;
import level4.lesson8.model.Person;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class SessionCreator {
    private static final SessionFactory SESSION_FACTORY;

    static {
        try {
            Properties properties = new Properties();
            FileReader reader = new FileReader("C:\\Users\\Mi\\IdeaProjects\\MyFirstProject\\src\\main\\resources\\hibernate.properties");
            properties.load(reader);

            SESSION_FACTORY = new Configuration()
                    .addProperties(properties)
                    .addAnnotatedClass(City.class)
                    .addAnnotatedClass(Person.class)
                    .buildSessionFactory();
        } catch (Exception ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return SESSION_FACTORY.openSession();
    }
}
