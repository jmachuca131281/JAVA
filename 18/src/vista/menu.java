package vista;

import Controlador.CtrlClientes;
import Controlador.CtrlGenerarFacturas;
import modelo.ConsultasProducto;
import Controlador.CtrlProducto;
import modelo.Clientes;
import modelo.ConsultasCliente;
import modelo.ConsultasGenerarFacturas;
import modelo.GenerarFacturas;
import modelo.Productos;
import modelo.Usuarios;
import vista.Desktop.DClientes;
import vista.Desktop.DatosFiscales;
import vista.Desktop.DFacturasGeneradas;
import vista.Desktop.DGenerarFacturas;
import vista.Desktop.DProductos;

public class menu extends javax.swing.JFrame {

    Usuarios mod;
    public menu() {
        initComponents();
        setLocationRelativeTo(this);
    }

    menu(Usuarios mod) {
        initComponents();
        setLocationRelativeTo(null);
        this.mod = mod;

        if (mod.getId_Tipo() == 1) {
            menuInicio.setVisible(true);
            menuCatalogo.setVisible(true);
            menuFacturacion.setVisible(true);
            menuConfiguracion.setVisible(true);
            menuAyuda.setVisible(true);            
        } else {
            menuCatalogo.setVisible(false);
            menuConfiguracion.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        mb_menu = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        subMenuExit = new javax.swing.JMenuItem();
        menuCatalogo = new javax.swing.JMenu();
        subMenuProductos = new javax.swing.JMenuItem();
        subMenuClientes = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        menuFacturacion = new javax.swing.JMenu();
        subMenuGenerarFactura = new javax.swing.JMenuItem();
        subMenuFacturasGeneradas = new javax.swing.JMenuItem();
        menuConfiguracion = new javax.swing.JMenu();
        subMenuDatosFiscales = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Escritorio de facturación electrónica");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );

        menuInicio.setText("Inicio");

        jMenuItem12.setText("Estadísticas");
        menuInicio.add(jMenuItem12);

        jMenuItem16.setText("Información de la cuenta");
        menuInicio.add(jMenuItem16);

        jMenuItem17.setText("Reportes de venta");
        menuInicio.add(jMenuItem17);

        subMenuExit.setText("Salir");
        subMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuExitActionPerformed(evt);
            }
        });
        menuInicio.add(subMenuExit);

        mb_menu.add(menuInicio);

        menuCatalogo.setText("Catálogo");

        subMenuProductos.setText("Productos");
        subMenuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuProductosActionPerformed(evt);
            }
        });
        menuCatalogo.add(subMenuProductos);

        subMenuClientes.setText("Clientes");
        subMenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuClientesActionPerformed(evt);
            }
        });
        menuCatalogo.add(subMenuClientes);

        jMenuItem13.setText("Reportes");
        menuCatalogo.add(jMenuItem13);

        jMenuItem15.setText("Establecimientos");
        menuCatalogo.add(jMenuItem15);

        jMenuItem14.setText("Unidad ");
        menuCatalogo.add(jMenuItem14);

        mb_menu.add(menuCatalogo);

        menuFacturacion.setText("Facturación");

        subMenuGenerarFactura.setText("Generar factura");
        subMenuGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuGenerarFacturaActionPerformed(evt);
            }
        });
        menuFacturacion.add(subMenuGenerarFactura);

        subMenuFacturasGeneradas.setText("Facturas Generadas");
        subMenuFacturasGeneradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuFacturasGeneradasActionPerformed(evt);
            }
        });
        menuFacturacion.add(subMenuFacturasGeneradas);

        mb_menu.add(menuFacturacion);

        menuConfiguracion.setText("Configuración");

        subMenuDatosFiscales.setText("Datos Fiscales");
        subMenuDatosFiscales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuDatosFiscalesActionPerformed(evt);
            }
        });
        menuConfiguracion.add(subMenuDatosFiscales);

        jMenuItem8.setText("Personalización");
        menuConfiguracion.add(jMenuItem8);

        jMenuItem9.setText("Lenguaje");
        menuConfiguracion.add(jMenuItem9);

        jMenuItem10.setText("Gestor de contraseñas");
        menuConfiguracion.add(jMenuItem10);

        jMenuItem11.setText("Administrador de usuarios");
        menuConfiguracion.add(jMenuItem11);

        mb_menu.add(menuConfiguracion);

        menuAyuda.setText("Ayuda");

        jMenuItem4.setText("Manual");
        menuAyuda.add(jMenuItem4);

        jMenuItem5.setText("Atajos por teclado");
        menuAyuda.add(jMenuItem5);

        jMenuItem6.setText("Acerca de...");
        menuAyuda.add(jMenuItem6);

        mb_menu.add(menuAyuda);

        setJMenuBar(mb_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuProductosActionPerformed
        
        Productos mod = new Productos();
        ConsultasProducto modC = new ConsultasProducto();
        DProductos frm = new DProductos();      
        CtrlProducto ctrl = new CtrlProducto(mod, modC, frm);        
        escritorio.add(frm);
        frm.show();
        
    }//GEN-LAST:event_subMenuProductosActionPerformed

    private void subMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuClientesActionPerformed

        Clientes mod = new Clientes();
        ConsultasCliente modC = new ConsultasCliente();
        DClientes frm = new DClientes();      
        CtrlClientes ctrl = new CtrlClientes(mod, modC, frm);
        escritorio.add(frm);
        frm.show();
    }//GEN-LAST:event_subMenuClientesActionPerformed

    private void subMenuGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuGenerarFacturaActionPerformed
        
        Productos modP = new Productos();
        Clientes modC = new Clientes();
        GenerarFacturas modGf = new GenerarFacturas();
        ConsultasGenerarFacturas modGfSQL = new ConsultasGenerarFacturas();
        ConsultasProducto modCpSQL = new ConsultasProducto();
        ConsultasCliente modCcSQL = new ConsultasCliente();
        DGenerarFacturas frmGf = new DGenerarFacturas();
        CtrlGenerarFacturas ctrlGf = new CtrlGenerarFacturas(modP, modC, modGf, modGfSQL, modCpSQL, modCcSQL, frmGf);
        escritorio.add(frmGf);
        frmGf.show();
        
    }//GEN-LAST:event_subMenuGenerarFacturaActionPerformed

    private void subMenuFacturasGeneradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuFacturasGeneradasActionPerformed

        DFacturasGeneradas vfg = new DFacturasGeneradas();
        escritorio.add(vfg);
        vfg.show();
        
    }//GEN-LAST:event_subMenuFacturasGeneradasActionPerformed

    private void subMenuDatosFiscalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuDatosFiscalesActionPerformed

        DatosFiscales vdf = new DatosFiscales();
        escritorio.add(vdf);
        vdf.show();
        
        
    }//GEN-LAST:event_subMenuDatosFiscalesActionPerformed

    private void subMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuExitActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_subMenuExitActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar mb_menu;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuCatalogo;
    private javax.swing.JMenu menuConfiguracion;
    private javax.swing.JMenu menuFacturacion;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenuItem subMenuClientes;
    private javax.swing.JMenuItem subMenuDatosFiscales;
    private javax.swing.JMenuItem subMenuExit;
    private javax.swing.JMenuItem subMenuFacturasGeneradas;
    private javax.swing.JMenuItem subMenuGenerarFactura;
    private javax.swing.JMenuItem subMenuProductos;
    // End of variables declaration//GEN-END:variables
}
