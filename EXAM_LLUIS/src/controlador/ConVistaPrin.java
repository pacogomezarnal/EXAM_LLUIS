package controlador;

import java.awt.CardLayout;

import vista.PerfilUser;
import vista.VistaPrincipal;

public class ConVistaPrin {
	private static ConVistaPrin instance=null;
	private VistaPrincipal vista;
	
	private ConVistaPrin() {
		 vista=new  VistaPrincipal();
		 vista.setVisible(true);
	}
	
	public static ConVistaPrin getInstance(){
		if(instance==null){
			instance=new ConVistaPrin();
		}
	return instance;
	}
	
	public void CambiaVistaPerfEqui(){
		CardLayout c=(CardLayout) vista.getContentPane().getLayout();
 		c.show(vista.getContentPane(), vista.getPanelEquipo().getName());
	}
	
	public void CambiaVistaPerfUser(){
		CardLayout c=(CardLayout) vista.getContentPane().getLayout();
 		c.show(vista.getContentPane(), vista.getPanelPerfil().getName());
	}
	
	public void CambiaVistaComprobacion(){
		CardLayout c=(CardLayout) vista.getContentPane().getLayout();
 		c.show(vista.getContentPane(), vista.getPanelComprobacion().getName());
	}
}
