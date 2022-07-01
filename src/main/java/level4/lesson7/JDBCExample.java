package level4.lesson7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCExample {
    // 1. добавить драйвер.
    // 2. подключиться к бд.
    // 3. создать Statement.
    // 4. Выполнить запрос.
    // 5. Обработать ResultSet.
    // 6. Закрыть соединение.
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/jdbc.properties"));

        // 1
        Class.forName(properties.getProperty("driver-class-name"));

        // 2: url, login, password
        String url = properties.getProperty("url");
        String login = properties.getProperty("login");
        String password = properties.getProperty("password");
        Connection connection = DriverManager.getConnection(url, login, password);

        // 3
        String sql = "select * from city";
        PreparedStatement statement = connection.prepareStatement(sql);

        // 4
        statement.execute();

        // 5
        ResultSet resultSet = statement.getResultSet();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println(id + " " + name);
        }

        // 6
        connection.close();
    }
}
