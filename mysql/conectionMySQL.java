
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectionMySQL {

    public static Connection getConnection() {
    String url = "jdbc:mysql://localhost:3306/test";
    String usuario = "root";
    String contraseña = "";
    Connection conn = null;
    
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(url, usuario, contraseña);

            System.out.println("Conexión exitosa a la base de datos.");

        }   catch (SQLException | ClassNotFoundException e) {
        System.out.println("Error de la conexión: " + e.getMessage());
        }

        return conn;
    }
    public static void main(String[] args) {
        getConnection();
    }
}

    

   