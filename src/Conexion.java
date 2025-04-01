import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion{
    public static void main(String[] args) {
        String url = "jdbc:mysql://192.168.56.1:3306/bdbiblioteca";
        String user = "admin";
        String password = "1234";
        Connection conn=null;
        System.out.println("*****************************************************************************************");
        System.out.println("***                             BIBLIOTECA MUSKIZ                                    ****");
        System.out.println("*****************************************************************************************");
        try {
            // Conexión a la base de datos
            conn = BaseDeDatos.ConexionBaseDeDatos(url, user, password);
            if (conn==null) {
                BaseDeDatos.mensa("No se pudo establecer la conexión");
                return;
            }
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        BaseDeDatos.cerrarConexion(conn);
    }
}
