/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmvc;

import Controlador.CtrlProducto;
import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.frmProducto;

/**
 *
 * @author Jmachuca
 */
public class crudmvc {

	public static void main(String[] args) {

		Producto product = new Producto();
		ConsultasProducto consult_Prod = new ConsultasProducto();
		frmProducto vista = new frmProducto();
		CtrlProducto ctrl = new CtrlProducto(product, consult_Prod, vista);
		ctrl.iniciar();
		vista.setVisible(true);
	}

}
