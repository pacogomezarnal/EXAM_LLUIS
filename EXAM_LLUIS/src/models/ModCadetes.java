package models;


	import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

	public class ModCadetes {
		//consultas que necesitamos y el numero de equipo que queremos seleccions
		private final static String SELECT_cadete="select * from cadetes where id=";
		private final static String SELECT_cadetes="select * from cadetes where equipo=";
		private final static int SELECT_numEquipo=4;
		//campos que necesitaremos de la bd
		private final String ID = "id";
		private final String NOM = "nombre";
		private final String APE = "apellidos";
		private final String EDAD = "edad";
		private final String NAC = "nacionalidad";
		private final String EQUI = "equipo";
		//generamos 3 variables una donde guardar nuestra conexion otra donde guardar la instruccion que queremos hacer 
		//y la ultima donde guardaremos el resultado de nuestra intruccion.
		private Connection conexion=null;
		private Statement instruccion=null;
		private ResultSet result=null;
		
		
		public ModCadetes() {
			conexion = ConexionDB.getConexion();
		}
		/*metodo donde entrara un integuer que sera el numero de usuario que queremos y saldra un objeto cadete con los 
		 * resultados de nuestra select
		 */
		public Cadete consultacadete(int ident) {;
			Cadete cade=null;
			try {
				this.instruccion=this.conexion.createStatement();
				//haremos nuestra consulta a la intruccion introduciendole nuestra select y lo almacenaremos en la variable resultset
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
		/*metodo donde saldra un array de cadete con los resultados de cada uno de los campos que nos devuelve la consulta
		 */
		public ArrayList<Cadete> consultaEquipos() {
			ArrayList<Cadete> cadetes = new ArrayList<Cadete>();
			try {
				this.instruccion=this.conexion.createStatement();
				this.result= this.instruccion.executeQuery(SELECT_cadetes+SELECT_numEquipo);
				while (result.next()) {
					int id = result.getInt(ID);
					String nom = result.getString(NOM);
					String ape = result.getString(APE);
					int edad = result.getInt(EDAD);
					String nac = result.getString(NAC);
					int equi = result.getInt(EQUI);
					
					Cadete cade = new Cadete(id, nom, ape, edad,nac, equi);
					cadetes.add(cade);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return cadetes;
		}
		
		
	

}
