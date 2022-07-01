package level4.lesson8.reposity;

import level4.lesson8.SessionCreator;
import level4.lesson8.model.City;
import level4.lesson8.model.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PersonRepository {
    // CRUD
    public void add(Person person) {
        Session session = SessionCreator.getSession();

        Transaction transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();

        session.close();
    }

    public Person get(int id) {
        Session session = SessionCreator.getSession();

        Person foundPerson = session.get(Person.class, id);

        session.close();
        return foundPerson;
    }

    public List<Person> getAll() {
        Session session = SessionCreator.getSession();

        // HQL = Hibernate Query Language
        List<Person> people = session.createQuery("from Person", Person.class)
                .list();

        session.close();
        return people;
    }

    public void update(Person person) {
        Session session = SessionCreator.getSession();

        Transaction transaction = session.beginTransaction();
        session.update(person);
        transaction.commit();

        session.close();
    }

    public void delete(Person person) {
        Session session = SessionCreator.getSession();

        Transaction transaction = session.beginTransaction();
        session.delete(person);
        transaction.commit();

        session.close();
    }
}
