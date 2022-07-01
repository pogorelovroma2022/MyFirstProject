package level4.lesson8;

import level4.lesson8.model.City;
import level4.lesson8.model.Person;
import level4.lesson8.reposity.CityRepository;
import level4.lesson8.reposity.PersonRepository;

import java.util.List;

public class HibernateUsage {
    public static void main(String[] args) {
        CityRepository cityRepository = new CityRepository();
        System.out.println(cityRepository.getAll());
//        cityRepository.add(new City("Minsk"));
//        cityRepository.add(new City("Piter"));
//        cityRepository.add(new City("Novopolosk"));
//        cityRepository.add(new City("New York"));

//        City city = cityRepository.get(4);
//        System.out.println(city);

//        cityRepository.update(new City(1, "Los Angeles"));
//        cityRepository.delete(new City(1));
//        List<City> cities = cityRepository.getAll();
//        System.out.println(cities);

//        PersonRepository personRepository = new PersonRepository();
//        personRepository.add(new Person(20, "Ivan", new City(2)));
//        personRepository.add(new Person(25, "Oleg", new City(4)));
//        Person person = personRepository.get(102);
//        System.out.println(person);
//        List<Person> people = personRepository.getAll();
//        System.out.println(people);
//        personRepository.update(new Person(1, 21,"Ivan", new City(1)));
//        List<Person> people = personRepository.getAll();
//        System.out.println(people);
//
//        personRepository.delete(new Person(2));
//
//        people = personRepository.getAll();
//        System.out.println(people);
    }
}
