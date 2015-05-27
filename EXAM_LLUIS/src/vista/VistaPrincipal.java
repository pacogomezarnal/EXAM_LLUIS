package vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class VistaPrincipal extends JFrame {

	private PerfilUser perfil;
	private PerfilEquipo equipo;
	private Comprobacion comprobacion;

	/**
	 * Create the frame.
	 */
	public VistaPrincipal() {
		setFont(new Font("Andalus", Font.PLAIN, 12));
		setTitle("THE LABY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 410);
		perfil= new PerfilUser();
		equipo= new PerfilEquipo();
		comprobacion= new Comprobacion();
		
		getContentPane().setLayout(new CardLayout(0, 0));
		
		getContentPane().add(perfil, "perfil");
		getContentPane().add(equipo, "equipo");
		getContentPane().add(comprobacion, "comprobacion");
	}
	
	public PerfilUser getPanelPerfil() {
		return perfil;
	}
	
	public PerfilEquipo getPanelEquipo() {
		return equipo;
	}
	
	public Comprobacion getPanelComprobacion() {
		return comprobacion;
	}
}
