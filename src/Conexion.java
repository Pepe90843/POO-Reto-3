java.lang.ClassNotFoundException: Conexion;
import java.sql.Connection;

public class Conexion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://25.7.155.29:3306/bdbiblioteca";
        String user = "admin";
        String password = "1234";
        Connection conn = null;

        System.out.println("*********************************************************************");
        System.out.println("***/                    BIBLIOTECA MUSKIZ                        /***");
        System.out.println("*********************************************************************\n");

        // Conexión a la base de datos
        conn = BaseDeDatos.ConexionBaseDeDatos(url, user, password);
        if (conn == null) {
            BaseDeDatos.mensa("No se pudo establecer la conexión");
            return;
        }
        System.out.println("Conexión exitosa a la base de datos.");

        BaseDeDatos.cerrarConexion(conn);
    }
}
