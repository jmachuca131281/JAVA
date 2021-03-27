package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasCliente extends Conexion
{
    public boolean registrar (Clientes c)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO cliente (tipoId, numeroId, nombre, direccion, telefono) VALUES (?,?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getTipoId());
            ps.setInt(2, c.getNumeroId());
            ps.setString(3, c.getNombre());
            ps.setString(4, c.getDireccion());
            ps.setString(5, c.getTelefono());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }   
    }
    
    public boolean modificar (Clientes c)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE cliente SET tipoId = ?, numeroId = ?, nombre = ?, direccion = ?, telefono = ? WHERE id = ? ";
        
        try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, c.getTipoId());
            ps.setInt   (2, c.getNumeroId());
            ps.setString(3, c.getNombre());
            ps.setString(4, c.getDireccion());
            ps.setString(5, c.getTelefono());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean buscar (Clientes c)
    {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT * FROM cliente WHERE numeroId = ? ";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, c.getNumeroId());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                c.setId(Integer.parseInt(rs.getString("id")));
                c.setTipoId(rs.getString("tipoId"));
                c.setNumeroId(Integer.parseInt(rs.getString("numeroId")));
                c.setNombre(rs.getString("nombre"));
                c.setDireccion(rs.getString("direccion"));
                c.setTelefono(rs.getString("telefono"));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        } 
    }
    
    public boolean eliminar (Clientes c)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "DELETE FROM cliente WHERE numeroId = ? ";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, c.getNumeroId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }    
}
