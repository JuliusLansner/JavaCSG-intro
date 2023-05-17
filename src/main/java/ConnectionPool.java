
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {
    private Connection connection;
    private static String USER;
    private static String PASSWORD;
    private static String URL;


    public ConnectionPool(String user, String password, String url) {
        USER = user;
        PASSWORD = password;
        URL = url;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO: Make own throwable exception and let it bubble upwards
            e.printStackTrace();
            System.out.println("Fejl ved instantiering af Driver klasse");
        }
    }

    public Connection connect(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException throwables) {
            // TODO: Make own throwable exception and let it bubble upwards
            throwables.printStackTrace();
            System.out.println("Fejl under etablering af forbindelse til database");
        }
        return connection;
    }
}
