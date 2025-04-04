java.lang.ClassNotFoundException: Conexion;
import java.sql.Connection;
import java.util.Scanner;

public class Conexion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://25.7.155.29:3306/bdbiblioteca";
        String user = "admin";
        String password = "1234";
        Connection conn = null;
        Scanner teclado=new Scanner(System.in);

        System.out.println("*********************************************************************");
        System.out.println("***/                    BIBLIOTECA MUSKIZ                        /***");
        System.out.println("*********************************************************************\n");
        System.out.println("       1-Obtener conexión                 4-Cerrar conexión");


        int eleccion = teclado.nextInt();

        switch (eleccion) {
            case 1:
                // Conexión a la base de datos
                conn = BaseDeDatos.ConexionBaseDeDatos(url, user, password);
                if (conn == null) {
                    BaseDeDatos.mensa("No se pudo establecer la conexión");
                    return;
                }
                System.out.println("Conexión exitosa a la base de datos.");
                break;
        

            case 4:
                BaseDeDatos.cerrarConexion(conn);
                BaseDeDatos.mensa("Conexión cerrada exitosamente!");
                break;
            default:
                BaseDeDatos.mensa("Elige una de las opciones que se dan.");
                break;
        }
    }
}
