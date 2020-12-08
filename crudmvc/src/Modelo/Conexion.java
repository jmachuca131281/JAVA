/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jmachuca
 */
public class Conexion {

    private String db = "tienda";
    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/" + db;
    private Connection connet = null;

    /**
     *
     * @return
     */
    public Connection getConexion() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            connet = (Connection) DriverManager.getConnection(this.url, this.user, this.password);

        } catch (SQLException e) {

            System.err.println(e);

        } catch (ClassNotFoundException ex) {

            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connet;
    }
}
