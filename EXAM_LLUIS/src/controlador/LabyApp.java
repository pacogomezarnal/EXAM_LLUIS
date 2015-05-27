package controlador;

import models.ConexionDB;
import vista.VistaPrincipal;

public class LabyApp {

	private static ConexionDB conexion;
	
	public static void main(String[] args) {
		conexion=ConexionDB.getInstance("localhost","thelaby","root","tonphp");
		conexion.connectDB();
		
		ConVistaPrin Controladora= ConVistaPrin.getInstance();
		
		
	}

}
