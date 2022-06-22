package level4.lesson7;

import level4.lesson7.model.City;
import level4.lesson7.reposity.CityRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class RepositoryUsage {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        CityRepository repository = new CityRepository();
        List<City> cities = repository.getAll();
        System.out.println("Получил все города из базы данных: " + cities);
    }
}
