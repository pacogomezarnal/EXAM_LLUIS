package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class PerfilEquipo extends JPanel {
	private JTextField cajaNom;
	private JTextField cajaId;
	private JTextField caja1Ape;
	private JTextField caja2Ape;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public PerfilEquipo() {
		setLayout(null);
		setName("equipo");
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(131, 11, 46, 14);
		add(lblNombre);
		
		cajaNom = new JTextField();
		cajaNom.setEditable(false);
		cajaNom.setColumns(10);
		cajaNom.setBounds(131, 27, 149, 20);
		add(cajaNom);
		
		JLabel lblid = new JLabel("Id");
		lblid.setBounds(341, 11, 46, 14);
		add(lblid);
		
		cajaId = new JTextField();
		cajaId.setEditable(false);
		cajaId.setColumns(10);
		cajaId.setBounds(341, 27, 64, 20);
		add(cajaId);
		
		JLabel lbl1Apellido = new JLabel("1er Apellido");
		lbl1Apellido.setBounds(131, 58, 81, 14);
		add(lbl1Apellido);
		
		caja1Ape = new JTextField();
		caja1Ape.setEditable(false);
		caja1Ape.setColumns(10);
		caja1Ape.setBounds(131, 83, 149, 20);
		add(caja1Ape);
		
		JLabel lbl2Apellido = new JLabel("2er Apellido");
		lbl2Apellido.setBounds(131, 114, 81, 14);
		add(lbl2Apellido);
		
		caja2Ape = new JTextField();
		caja2Ape.setEditable(false);
		caja2Ape.setColumns(10);
		caja2Ape.setBounds(131, 139, 149, 20);
		add(caja2Ape);
		
		JLabel lblNaci = new JLabel("Nacionalidad");
		lblNaci.setBounds(131, 172, 96, 14);
		add(lblNaci);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(131, 197, 149, 20);
		add(textField_4);
		
		JButton btnSig = new JButton("Siguiente >>");
		btnSig.setBounds(283, 266, 122, 23);
		add(btnSig);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 27, 111, 20);
		add(comboBox);
		
		JLabel lblEquipo = new JLabel("Equipo");
		lblEquipo.setBounds(10, 11, 46, 14);
		add(lblEquipo);
		
		JButton btnAtras = new JButton("<< Atr\u00E1s");
		btnAtras.setBounds(10, 266, 111, 23);
		add(btnAtras);

	}
}
