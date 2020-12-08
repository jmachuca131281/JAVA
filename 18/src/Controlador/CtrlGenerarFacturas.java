package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import modelo.Clientes;
import modelo.ConsultasCliente;
import modelo.ConsultasGenerarFacturas;
import modelo.ConsultasProducto;
import modelo.GenerarFacturas;
import modelo.Productos;
import vista.Desktop.DGenerarFacturas;

public class CtrlGenerarFacturas extends javax.swing.JFrame implements ActionListener, InternalFrameListener {

    private Productos modP;
    private Clientes modC;
    private GenerarFacturas modGf;
    private ConsultasGenerarFacturas modGfSQL;
    private ConsultasProducto modCpSQL;
    private ConsultasCliente modCcSQL;
    private DGenerarFacturas frm;

    public CtrlGenerarFacturas(Productos modP, Clientes modC, GenerarFacturas modGf, ConsultasGenerarFacturas modGfSQL, ConsultasProducto modCpSQL,ConsultasCliente modCcSQL, DGenerarFacturas frm) {
        this.modP = modP;
        this.modC = modC;
        this.modGf = modGf;
        this.modGfSQL = modGfSQL;
        this.modCpSQL = modCpSQL;
        this.modCcSQL = modCcSQL;
        this.frm = frm;
        this.frm.cb_TipoFactura.addActionListener(this);
        this.frm.cb_Cliente.addActionListener(this);
        this.frm.cb_Producto.addActionListener(this);
        this.frm.btn_GenerarFactura.addActionListener(this);
    }
    
    public void iniciar(){
        frm.setTitle("Facturación");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == frm.btn_GenerarFactura) {
            
            modGf.setTipoFactura(frm.cb_TipoFactura.getToolTipText());
            modGf.setCliente(frm.cb_Cliente.getToolTipText());
            modGf.setProducto(frm.cb_Producto.getToolTipText());
            modGf.setTipoImpuesto(frm.cb_Impuesto.getToolTipText());
            modGf.setPorcentaje(Integer.parseInt(frm.cb_Porcentaje.getToolTipText()));
            
            if (modGfSQL.registrarFacturas(modGf)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
    }

    public void limpiar() {
        frm.cb_TipoFactura.setToolTipText(null);
        frm.cb_Cliente.setToolTipText(null);
        frm.cb_Producto.setToolTipText(null);
        frm.cb_Impuesto.setToolTipText(null);
        frm.cb_Porcentaje.setToolTipText(null);
    }
    
    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
