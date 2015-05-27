package controlador;

import models.ConexionDB;
import vista.VistaPrincipal;

public class LabyApp {

	private static ConexionDB conexion;
	
	public static void main(String[] args) {
		//generamos la la instancia de conexion y ponemos los valores
		conexion=ConexionDB.getInstance("localhost","thelaby","root","tonphp");
		conexion.connectDB();
		
		//llamamos a la instancia de la controladora de la vista principal para generar una vistaprincipal
		ConVistaPrin Controladora= ConVistaPrin.getInstance();
		
		
	}

}
