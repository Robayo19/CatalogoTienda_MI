import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Register {

	private JFrame frame;
	private JTextField txtUsuarioR;
	private JTextField txtNombre;
	/**
	 * @wbp.nonvisual location=114,-41
	 */
	private final JTextField textField_2 = new JTextField();
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JPasswordField txtContrasenaR;
	Controlador c1 = new Controlador();
	Lista lista = new Lista();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField_2.setColumns(10);
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 935, 624);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRegister = new JLabel("REGISTRARSE");
		lblRegister.setForeground(Color.WHITE);
		lblRegister.setBackground(Color.WHITE);
		lblRegister.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 50));
		lblRegister.setBounds(328, 45, 262, 44);
		frame.getContentPane().add(lblRegister);
		
		txtUsuarioR = new JTextField();
		txtUsuarioR.setBounds(432, 293, 304, 31);
		frame.getContentPane().add(txtUsuarioR);
		txtUsuarioR.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Elige tu usuario:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(261, 294, 145, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Elige tu contraseña:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(226, 336, 180, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Escribe tu nombre:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(229, 126, 193, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(432, 125, 303, 31);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Escribe tu número de telefono:");
		lblNewLabel_3.setBackground(Color.CYAN);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(127, 178, 277, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(432, 177, 303, 31);
		frame.getContentPane().add(txtTelefono);
		
		JLabel lblNewLabel_4 = new JLabel("Escribe tu dirección:");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(229, 226, 180, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(432, 226, 303, 31);
		frame.getContentPane().add(txtDireccion);
		
		txtContrasenaR = new JPasswordField();
		txtContrasenaR.setBounds(432, 335, 304, 31);
		frame.getContentPane().add(txtContrasenaR);
		
		JLabel lblNewLabel_5 = new JLabel("¿Ya tiene un usuario creado? ->");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(217, 539, 262, 37);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnInicio = new JButton("INICIA SESIÓN");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.main(null);
				frame.dispose();
			}
		});
		btnInicio.setBounds(489, 542, 130, 37);
		frame.getContentPane().add(btnInicio);
		
		JButton btnRegister = new JButton("Registrarme");
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.guardarRegistro(frame, txtTelefono, txtNombre, txtDireccion, txtUsuarioR, txtContrasenaR, lista.getListaUsuarios());
			}
		});
		btnRegister.setBounds(354, 403, 193, 44);
		frame.getContentPane().add(btnRegister);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("./Imagenes/fondo1.png"));
		lblNewLabel_6.setBounds(0, 0, 121, 590);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("./Imagenes/fondo1.png"));
		lblNewLabel_7.setBounds(746, 0, 175, 576);
		frame.getContentPane().add(lblNewLabel_7);
	}

}
