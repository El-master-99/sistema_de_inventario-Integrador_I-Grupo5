package aplicativo_colegio_claretiano;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Luis Daniel
 */
public class Conexion {
    private static final String URL =
            "jdbc:sqlserver://localhost:1433;"
          + "databaseName=inventario_claretiano;"
          + "encrypt=true;"
          + "trustServerCertificate=true;";

    private static final String USER = "sa";
    private static final String PASSWORD = "Capricornio";

    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
