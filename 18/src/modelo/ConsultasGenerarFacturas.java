package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConsultasGenerarFacturas extends Conexion{

    public boolean registrarFacturas (GenerarFacturas modGf)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO facturas_generadas (tipoFactura, cliente, producto, tipoImpuesto, "
                + "porcentaje) VALUES (?,?,?,?,?)";
        
        JOptionPane.showMessageDialog(null, "Estoy en consultas");

        try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, modGf.getTipoFactura());
            ps.setString(2, modGf.getCliente());
            ps.setString(3, modGf.getProducto());
            ps.setString(4, modGf.getTipoImpuesto());
            ps.setInt   (5, modGf.getPorcentaje());
            
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "catch");
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Finally");
                System.err.println(e);
            }
        }   
        
    }   
}
