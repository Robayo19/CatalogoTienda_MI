import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Catalogo {

	private JFrame frame;
	Controlador c1 = new Controlador();
	Lista l1 = new Lista();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Catalogo window = new Catalogo();
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
	public Catalogo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 969, 642);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblCatalogo = new JLabel("CATALOGO");
		lblCatalogo.setForeground(Color.WHITE);
		lblCatalogo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 50));
		lblCatalogo.setBounds(334, 38, 210, 42);
		frame.getContentPane().add(lblCatalogo);

		JLabel lblNewLabel_1 = new JLabel("Nike Air Max");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(148, 111, 101, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("80€");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(626, 170, 49, 14);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel cantidad1 = new JLabel("0");
		cantidad1.setForeground(Color.WHITE);
		cantidad1.setBounds(835, 172, 24, 14);
		frame.getContentPane().add(cantidad1);

		JButton btnProducto1menos = new JButton("-");
		btnProducto1menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.restarCompras(cantidad1);
			}
		});
		btnProducto1menos.setBounds(764, 168, 49, 23);
		frame.getContentPane().add(btnProducto1menos);

		JButton btnProducto1mas = new JButton("+");
		btnProducto1mas.setBounds(869, 168, 49, 23);
		frame.getContentPane().add(btnProducto1mas);
		btnProducto1mas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.sumarCompras(cantidad1);
			}
		});

		JTextPane txtpnLaLneaAir = new JTextPane();
		txtpnLaLneaAir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnLaLneaAir.setForeground(Color.BLACK);
		txtpnLaLneaAir.setBackground(Color.LIGHT_GRAY);
		txtpnLaLneaAir.setText(
				"La línea Air Max de Nike es famosa por su icónica unidad de aire visible en la suela, que proporciona una amortiguación excepcional y comodidad. Estas zapatillas son conocidas por su estilo moderno y están disponibles en una variedad de colores y diseños. Son ideales tanto para el rendimiento deportivo como para uso casual.");
		txtpnLaLneaAir.setBounds(148, 136, 411, 79);
		frame.getContentPane().add(txtpnLaLneaAir);

		JLabel lblNewLabel_1_1 = new JLabel("Nike Air Force 1");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(148, 240, 101, 14);
		frame.getContentPane().add(lblNewLabel_1_1);

		JTextPane txtpnLasNikeAir = new JTextPane();
		txtpnLasNikeAir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnLasNikeAir.setBackground(Color.LIGHT_GRAY);
		txtpnLasNikeAir.setText(
				"Las Nike Air Force 1 son zapatillas clásicas que han ganado popularidad en el mundo de la moda. Tienen un diseño elegante y versátil que se adapta a diversas ocasiones. Estas zapatillas suelen estar disponibles en varios colores y materiales, y son conocidas por su durabilidad y comodidad.");
		txtpnLasNikeAir.setBounds(148, 265, 411, 79);
		frame.getContentPane().add(txtpnLasNikeAir);

		JLabel lblNewLabel_3_1 = new JLabel("90€");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(626, 287, 49, 14);
		frame.getContentPane().add(lblNewLabel_3_1);

		JButton menosProducto2 = new JButton("-");
		menosProducto2.setBounds(764, 285, 49, 23);
		frame.getContentPane().add(menosProducto2);

		JLabel cantidad2 = new JLabel("0");
		cantidad2.setForeground(Color.WHITE);
		cantidad2.setBounds(835, 289, 24, 14);
		frame.getContentPane().add(cantidad2);
		
		menosProducto2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.restarCompras(cantidad2);
			}
		});

		JButton btnProducto2mas = new JButton("+");
		btnProducto2mas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.sumarCompras(cantidad2);
			}
		});
		btnProducto2mas.setBounds(869, 285, 49, 23);
		frame.getContentPane().add(btnProducto2mas);

		JLabel lblNewLabel_1_2 = new JLabel("Nike React");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(148, 370, 101, 14);
		frame.getContentPane().add(lblNewLabel_1_2);

		JTextPane txtpnLasZapatillasNike = new JTextPane();
		txtpnLasZapatillasNike.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnLasZapatillasNike.setBackground(Color.LIGHT_GRAY);
		txtpnLasZapatillasNike.setText(
				"Las zapatillas Nike React están equipadas con tecnología de espuma React, que ofrece una amortiguación suave y receptiva. Son conocidas por su ligereza y capacidad para proporcionar una excelente energía de retorno, lo que las convierte en una opción popular tanto para corredores como para personas que buscan comodidad durante todo el día.");
		txtpnLasZapatillasNike.setBounds(148, 395, 411, 79);
		frame.getContentPane().add(txtpnLasZapatillasNike);

		JLabel lblNewLabel_3_1_1 = new JLabel("100€");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setBounds(626, 414, 49, 14);
		frame.getContentPane().add(lblNewLabel_3_1_1);

		JButton menosProducto3 = new JButton("-");
		menosProducto3.setBounds(764, 412, 49, 23);
		frame.getContentPane().add(menosProducto3);

		JLabel cantidad3 = new JLabel("0");
		cantidad3.setForeground(Color.WHITE);
		cantidad3.setBounds(835, 416, 24, 14);
		frame.getContentPane().add(cantidad3);
		
		menosProducto3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.restarCompras(cantidad3);
			}
		});

		JButton masProducto3 = new JButton("+");
		masProducto3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.sumarCompras(cantidad3);
			}
		});
		masProducto3.setBounds(869, 412, 49, 23);
		frame.getContentPane().add(masProducto3);

		JButton btnNewButton_4 = new JButton("Ir al carrito");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(cantidad1.getText());
				int n2 = Integer.parseInt(cantidad2.getText());
				int n3 = Integer.parseInt(cantidad3.getText());
				l1.agregarProducto(n1, 80);
				l1.agregarProducto(n2, 90);
				l1.agregarProducto(n3, 100);
				Comprar c1 = new Comprar();
				c1.main(null);
				frame.dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		btnNewButton_4.setBounds(696, 499, 210, 62);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("X");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_5.setBackground(SystemColor.inactiveCaption);
		btnNewButton_5.setBounds(873, 11, 72, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("./Imagenes/fondo1.png"));
		lblNewLabel.setBounds(0, 0, 138, 605);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(282, 547, 49, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("./Imagenes/fondo1.png"));
		lblNewLabel_5.setBounds(133, 478, 822, 127);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("./Imagenes/fondo1.png"));
		lblNewLabel_6.setBounds(133, 0, 191, 100);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("./Imagenes/fondo1.png"));
		lblNewLabel_7.setBounds(542, 0, 413, 100);
		frame.getContentPane().add(lblNewLabel_7);
	}
}
