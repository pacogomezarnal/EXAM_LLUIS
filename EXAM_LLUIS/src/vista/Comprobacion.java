package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Comprobacion extends JPanel {
	private JTextField cajaId;
	private JTextField caja1Ape;
	private JTextField cajaMensaje;

	/**
	 * Create the panel.
	 */
	public Comprobacion() {
		setLayout(null);
		setName("comprobacion");
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(10, 32, 46, 14);
		add(lblId);
		
		cajaId = new JTextField();
		cajaId.setBounds(10, 57, 70, 20);
		add(cajaId);
		cajaId.setColumns(10);
		
		JLabel lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(113, 32, 75, 14);
		add(lblerApellido);
		
		caja1Ape = new JTextField();
		caja1Ape.setBounds(113, 57, 86, 20);
		add(caja1Ape);
		caja1Ape.setColumns(10);
		
		JButton btnComprobar = new JButton("COMPROBAR");
		btnComprobar.setBounds(10, 115, 430, 23);
		add(btnComprobar);
		
		cajaMensaje = new JTextField();
		cajaMensaje.setEditable(false);
		cajaMensaje.setBounds(10, 163, 430, 20);
		add(cajaMensaje);
		cajaMensaje.setColumns(10);
		
		JButton btnAtras = new JButton("<< Atr\u00E1s");
		btnAtras.setBounds(10, 266, 111, 23);
		add(btnAtras);

	}

}