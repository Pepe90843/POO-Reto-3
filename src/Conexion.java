public class Conexion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/bdbiblioteca";
        String user = "admin";
        String password = "1234";

        ConexionBaseDeDatos.ConexionBaseDeDatos(url, user, password);
    }
}
