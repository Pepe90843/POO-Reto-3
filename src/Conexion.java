public class Conexion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/bdnicotek";
        String user = "admin";
        String password = "1234";

        //Llamada a la función para conectar a la base de datos
        ConexionBaseDeDatos.ConexionBaseDeDatos(url, user, password);
    }
}
