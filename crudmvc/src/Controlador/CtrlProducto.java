/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.frmProducto;
import javax.swing.JOptionPane;
import java.awt.event.*;

/**
 *
 * @author Jmachuca
 */
public class CtrlProducto implements ActionListener {

    private Producto product;
    private ConsultasProducto consult_Prod;
    private frmProducto vista;

    public CtrlProducto(Producto productos, ConsultasProducto consult_Prod, frmProducto vista) {

        this.product = productos;
        this.consult_Prod = consult_Prod;
        this.vista = vista;
        this.vista.btnRegistrar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);

    }

    public void iniciar() {

        vista.setTitle("Productos");
        vista.setLocationRelativeTo(null);
        //vista.txtId.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnRegistrar) {

            product.setCodigo(vista.txtCodigo.getText());
            product.setNombre(vista.txtNombre.getText());
            product.setPrecio(Double.parseDouble(vista.txtPrecio.getText()));
            product.setCantidad(Integer.parseInt(vista.txtCantidad.getText()));

            if (consult_Prod.registrar(product)) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiar();

            } else {

                JOptionPane.showMessageDialog(null, "Error al guardar");
                limpiar();

            }
        }

        if (e.getSource() == vista.btnModificar) {

            product.setId(Integer.parseInt(vista.txtId.getText()));
            product.setCodigo(vista.txtCodigo.getText());
            product.setNombre(vista.txtNombre.getText());
            product.setPrecio(Double.parseDouble(vista.txtPrecio.getText()));
            product.setCantidad(Integer.parseInt(vista.txtCantidad.getText()));

            if (consult_Prod.modificar(product)) {

                JOptionPane.showMessageDialog(null, "Registro modificado");
                limpiar();

            } else {

                JOptionPane.showMessageDialog(null, "Error al modificado");
                limpiar();

            }
        }

        if (e.getSource() == vista.btnEliminar) {

            product.setId(Integer.parseInt(vista.txtId.getText()));

            if (consult_Prod.eliminar(product)) {

                JOptionPane.showMessageDialog(null, "Registro eliminado");
                limpiar();

            } else {

                JOptionPane.showMessageDialog(null, "Error al eliminar");
                limpiar();

            }
        }

        if (e.getSource() == vista.btnBuscar) {
            product.setCodigo(vista.txtCodigo.getText());

            if (consult_Prod.buscar(product)) {

                vista.txtId.setText(String.valueOf(product.getId()));
                vista.txtCodigo.setText(product.getCodigo());
                vista.txtNombre.setText(product.getNombre());
                vista.txtPrecio.setText(String.valueOf(product.getPrecio()));
                vista.txtCantidad.setText(String.valueOf(product.getCantidad()));
            } else {

                JOptionPane.showMessageDialog(null, "No se encontro registro");
                limpiar();

            }
        }

        if (e.getSource() == vista.btnLimpiar) {
            limpiar();
        }
    }

    public void limpiar() {
        vista.txtId.setText(null);
        vista.txtCodigo.setText(null);
        vista.txtNombre.setText(null);
        vista.txtPrecio.setText(null);
        vista.txtCantidad.setText(null);
    }

}
