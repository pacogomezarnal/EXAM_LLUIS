package controlador;

import java.awt.CardLayout;

import vista.PerfilUser;
import vista.VistaPrincipal;
//clase que se encarga de controlar el frame principal
public class ConVistaPrin {
	//instancia para saber si ya se ha creado
	private static ConVistaPrin instance=null;
	//donde guardamos el nombre de la Vista principal para poder acceder a ella y cambiar el cardLayout
	private VistaPrincipal vista;
	
	//contructor donde se crea la vista
	private ConVistaPrin() {
		 vista=new  VistaPrincipal();
		 vista.setVisible(true);
	}
	
	//generamos la instancia, si nunca a entrado generame la vista
	public static ConVistaPrin getInstance(){
		if(instance==null){
			instance=new ConVistaPrin();
		}
	return instance;
	}
	
	//metodos para cambiar el cardLayout
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
