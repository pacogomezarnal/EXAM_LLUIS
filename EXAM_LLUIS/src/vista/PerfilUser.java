package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

import controlador.ConVistaPrin;
import models.Cadete;
import models.ModCadetes;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerfilUser extends JPanel {
	private JTextField cajaNombre;
	private JTextField cajaId;
	private JTextField cajaApellidos;
	private JTextField cajaNacionalidad;
	private JTextField cajaEdad;
	
	private Cadete cadet;
	private ModCadetes modCad;

	public PerfilUser() {
		setLayout(null);
		setName("perfil");
		
		modCad=new ModCadetes();
		
		cadet=modCad.consultacadete(11);
		
		JLabel lblFoto = new JLabel("");
		lblFoto.setIcon(new ImageIcon(PerfilUser.class.getResource("/image/perfil.png")));
		lblFoto.setBounds(10, 11, 96, 96);
		add(lblFoto);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(131, 11, 46, 14);
		add(lblNombre);
		
		cajaNombre = new JTextField();
		cajaNombre.setEditable(false);
		cajaNombre.setBounds(131, 27, 149, 20);
		add(cajaNombre);
		cajaNombre.setColumns(10);
		cajaNombre.setText(cadet.getNombre());
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(341, 11, 46, 14);
		add(lblId);
		
		cajaId = new JTextField();
		cajaId.setEditable(false);
		cajaId.setColumns(10);
		cajaId.setBounds(341, 27, 64, 20);
		add(cajaId);
		cajaId.setText(cadet.getId()+"");
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(131, 58, 64, 14);
		add(lblApellidos);
		
		cajaApellidos = new JTextField();
		cajaApellidos.setEditable(false);
		cajaApellidos.setBounds(131, 83, 149, 20);
		add(cajaApellidos);
		cajaApellidos.setColumns(10);
		cajaApellidos.setText(cadet.getApellidos());
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(131, 114, 46, 14);
		add(lblEdad);
		
		cajaEdad = new JTextField();
		cajaEdad.setEditable(false);
		cajaEdad.setColumns(10);
		cajaEdad.setBounds(131, 139, 149, 20);
		add(cajaEdad);
		cajaEdad.setText(cadet.getEdad()+"");
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(131, 170, 96, 14);
		add(lblNacionalidad);
		
		cajaNacionalidad = new JTextField();
		cajaNacionalidad.setEditable(false);
		cajaNacionalidad.setColumns(10);
		cajaNacionalidad.setBounds(131, 197, 149, 20);
		add(cajaNacionalidad);
		cajaNacionalidad.setText(cadet.getNacionalidad());
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConVistaPrin controladora=ConVistaPrin.getInstance();
				controladora.CambiaVistaPerfEqui();
			}
		});
		btnSiguiente.setBounds(283, 266, 122, 23);
		add(btnSiguiente);

	}
}
