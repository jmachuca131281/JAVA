/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

/**
 *
 * @author Jmachuca
 */
public class ConsultasProducto extends Conexion {

	PreparedStatement prepareState;
	Connection con = getConexion();

	public ConsultasProducto() {
		this.prepareState = null;
	}

	public boolean registrar(Producto productReg) {

		Connection con = getConexion();
		String sql = "INSERT INTO producto (codigo, nombre, precio, cantidad) VALUES (?,?,?,?)";

		try {
			prepareState = con.prepareStatement(sql);
			prepareState.setString(1, productReg.getCodigo());
			prepareState.setString(2, productReg.getNombre());
			prepareState.setDouble(3, productReg.getPrecio());
			prepareState.setInt(4, productReg.getCantidad());
			prepareState.execute();
			return true;

		} catch (SQLException e) {

			System.err.println(e);
			return false;

		} finally {

			try {
				con.close();

			} catch (SQLException e) {

				System.err.println(e);
			}
		}
	}

	public boolean modificar(Producto pro) {
		
		Connection con = getConexion();
		String sql = "UPDATE producto SET codigo=?, nombre=?, precio=?, cantidad=? WHERE id=?";
		
		try {
			
			prepareState = con.prepareStatement(sql);
			prepareState.setString(1, pro.getCodigo());
			prepareState.setString(2, pro.getNombre());
			prepareState.setDouble(3, pro.getPrecio());
			prepareState.setInt(4, pro.getCantidad());
			prepareState.setInt(5, pro.getId());
			prepareState.execute();
			return true;
			
		} catch (SQLException e) {
			
			System.err.println(e);
			return false;
			
		} finally {
			
			try {
				con.close();
				
			} catch (SQLException e) {
				
				System.err.println(e);
			}
		}
	}

	public boolean eliminar(Producto pro) {
		
		String sql = "DELETE FROM producto WHERE id=?";
		
		try {

			prepareState = con.prepareStatement(sql);
			prepareState.setInt(1, pro.getId());
			prepareState.execute();
			return true;

		} catch (SQLException e) {

			System.err.println(e);
			return false;

		} finally {
			try {

				con.close();

			} catch (SQLException e) {

				System.err.println(e);
			}
		}
	}

	public boolean buscar(Producto pBusqueda) {

		Connection con = getConexion();
		ResultSet resultSet = null;
		String sql = "SELECT * FROM producto WHERE codigo=?";

		try {
			prepareState = con.prepareStatement(sql); //Precompiled a stored statement sql
			prepareState.setString(1, pBusqueda.getCodigo());
			resultSet = prepareState.executeQuery();
			//prepareState.execute();

			if (resultSet.next()) {

				pBusqueda.setId(Integer.parseInt(resultSet.getString("id")));
				pBusqueda.setCodigo(resultSet.getString("codigo"));
				pBusqueda.setNombre(resultSet.getString("nombre"));
				pBusqueda.setPrecio(Double.parseDouble(resultSet.getString("precio")));
				pBusqueda.setCantidad(Integer.parseInt(resultSet.getString("cantidad")));
				return true;
			}
			return false;

		} catch (SQLException e) {

			System.err.println(e);
			return false;

		} finally {

			try {
				con.close();

			} catch (SQLException e) {

				System.err.println(e);
			}
		}
	}
}
