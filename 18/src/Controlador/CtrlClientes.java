package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import modelo.Clientes;
import modelo.ConsultasCliente;
import vista.Desktop.DClientes;

public class CtrlClientes implements ActionListener, InternalFrameListener 
{
    private Clientes mod;
    private ConsultasCliente modC;
    private DClientes frm;
    private Object Ingeter;

    public CtrlClientes(Clientes mod, ConsultasCliente modC, DClientes frm) {
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        this.frm.btnGuardar.addActionListener(this);
        this.frm.btnModificar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);
        this.frm.btnBuscar.addActionListener(this);
    }

    public void iniciar(){
        frm.setTitle("Clientes");
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == frm.btnGuardar)
        {
            mod.setTipoId((String) frm.cb_TipoIdentificacion.getSelectedItem());
            mod.setNumeroId(Integer.parseInt(frm.tf_NumeroIdentificacion.getText()));
            mod.setNombre(frm.tf_Nombre.getText());
            mod.setDireccion(frm.tf_Direccion.getText());
            mod.setTelefono(frm.tf_Telefono.getText());
            
            if (modC.registrar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el registro");
                limpiar();
            }
        }
        
        if (e.getSource() == frm.btnModificar)
        {
            mod.setId(Integer.parseInt(frm.tf_Id.getText()));
            mod.setTipoId(frm.cb_TipoIdentificacion.getToolTipText());
            mod.setNumeroId(Integer.parseInt(frm.tf_NumeroIdentificacion.getText()));
            mod.setNombre(frm.tf_Nombre.getName());
            mod.setDireccion(frm.tf_Direccion.getText());
            mod.setTelefono(frm.tf_Telefono.getText());
            
            if (modC.modificar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar");
                limpiar();
            }
        }
        
        if(e.getSource() == frm.btnBuscar)
        {
            
            mod.setNumeroId(Integer.parseInt(frm.tf_NumeroIdentificacion.getText()));
            
            if (modC.buscar(mod)) {
                frm.cb_TipoIdentificacion.setToolTipText(mod.getTipoId());
                frm.tf_NumeroIdentificacion.setText(String.valueOf(mod.getNumeroId()));
                frm.tf_Nombre.setText(mod.getNombre());
                frm.tf_Direccion.setText(mod.getDireccion());
                frm.tf_Telefono.setText(mod.getTelefono());
                                
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro registro");
            }
            
        }
        
        if(e.getSource() == frm.btnEliminar)
        {
            mod.setId(Integer.parseInt(frm.tf_Id.getText()));
            
            if (modC.eliminar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
                limpiar();
            }
        }
        
        
        if (e.getSource() == frm.btnLimpiar) {
            limpiar();
        }
    }
    
    public void limpiar()
    {
        frm.cb_TipoIdentificacion.setToolTipText(null);
        frm.tf_NumeroIdentificacion.setText(null);
        frm.tf_Nombre.setText(null);
        frm.tf_Direccion.setText(null);
        frm.tf_Telefono.setText(null);
        
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
