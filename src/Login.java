import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

//PRIMERA VISTA

public class Login {

	private JFrame frame;
	private JTextField txtUsuario;
	private JPasswordField passwordField;
	Lista lista = new Lista();
	Controlador c1 = new Controlador();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Usuario u1 = new Usuario("cliente", "hola12");
		lista.agregarUsuario(u1.getNombre(), u1.getContrasena());
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 965, 633);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInicio = new JLabel("INICIAR SESIÓN");
		lblInicio.setForeground(Color.WHITE);
		lblInicio.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 50));
		lblInicio.setBounds(313, 44, 310, 118);
		frame.getContentPane().add(lblInicio);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(313, 227, 310, 32);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JButton btnInicio = new JButton("ENTRAR");
		btnInicio.setBounds(402, 431, 131, 45);
		frame.getContentPane().add(btnInicio);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBounds(423, 173, 110, 40);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("CONTRASEÑA");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setBounds(402, 309, 124, 23);
		frame.getContentPane().add(lblContrasea);
		
		JLabel lblRegistro = new JLabel("¿No estas registrado? ->");
		lblRegistro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRegistro.setForeground(Color.WHITE);
		lblRegistro.setBounds(273, 530, 204, 45);
		frame.getContentPane().add(lblRegistro);
		
		JButton btnNewButton = new JButton("REGISTRARME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register register = new Register();
				register.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(497, 533, 131, 45);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(313, 348, 310, 32);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("./Imagenes/fondo1.png"));
		lblNewLabel.setBounds(0, 0, 263, 596);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("./Imagenes/fondo1.png"));
		lblNewLabel_1.setBounds(661, 0, 290, 596);
		frame.getContentPane().add(lblNewLabel_1);
		
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.comprobarIngreso(frame, txtUsuario, passwordField, lista.getListaUsuarios());
			}
		});
	}
}
