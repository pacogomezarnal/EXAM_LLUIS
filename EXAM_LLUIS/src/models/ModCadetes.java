package models;


	import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

	public class ModCadetes {
		
		private final static String SELECT_cadete="select * from cadetes where id=";
		
		private final String ID = "id";
		private final String NOM = "nombre";
		private final String APE = "apellidos";
		private final String EDAD = "edad";
		private final String NAC = "nacionalidad";
		private final String EQUI = "equipo";
		
		private static ModCadetes instance = new ModCadetes();
		
		private Connection conexion=null;
		private Statement instruccion=null;
		private ResultSet result=null;
		
		public ModCadetes() {
			conexion = ConexionDB.getConexion();
		}
		
		public Cadete consultacadete(int ident) {;
			Cadete cade=null;
			try {
				this.instruccion=this.conexion.createStatement();
				//aremos nuestra consulta a la intruccion introduciendole nuestra select y lo almacenaremos en la variable resultset
				this.result= this.instruccion.executeQuery(SELECT_cadete+ident);
				while (result.next()) {
					int id = result.getInt(ID);
					String nom = result.getString(NOM);
					String ape = result.getString(APE);
					int edad = result.getInt(EDAD);
					String nac = result.getString(NAC);
					int equi = result.getInt(EQUI);
					
					cade = new Cadete(id, nom, ape, edad,nac, equi);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return cade;
		}
		
		
	

}
