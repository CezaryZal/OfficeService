import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DatabaseConnector {

    static Connection getConnection() throws SQLException {
        final String JDB_URL = "jdbc:mysql://localhost:3306/office_service?useSSL=false";
        final String USENAME = "root";
        final String PASSWORD = "SQLSerwer2019";

        return DriverManager.getConnection(JDB_URL, USENAME, PASSWORD);
    }
}
