package Database_access;

import java.sql.*;
import javax.swing.JOptionPane;

public class FacadeBD {

    String url, usuario, password;
    Connection conexion = null;
    Statement instruccion;
    ResultSet tabla;

    public FacadeBD() {
        url="jdbc:postgresql://localhost:5432/LOSY";
        usuario = "David";
        password = "1629083";
    }

    public Connection conectar() {
        try {

            Class.forName("org.postgresql.Driver");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar el driver.");
        }

        try {
            conexion = DriverManager.getConnection(url, usuario, password);
            return conexion;
        } catch (Exception e) {
            return null;
        }
    }

    public Connection getConnetion() {
        if (conexion == null) {
            return this.conectar();
        } else {
            return conexion;
        }

    }

    public void closeConection(Connection c) {
        try {
            if (conexion != null) {
                c.close();
            }
        } catch (Exception e) {

        }
    }
}