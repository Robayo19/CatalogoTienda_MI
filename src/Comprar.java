import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Comprar {

	private JFrame frame;
	Controlador c1 = new Controlador();
	Lista l1 = new Lista();
	int total1 = l1.getListaProductos().get(0).getCantidad() * l1.getListaProductos().get(0).getPrecio();
	int total2 = l1.getListaProductos().get(1).getCantidad() * l1.getListaProductos().get(1).getPrecio();
	int total3 = l1.getListaProductos().get(2).getCantidad() * l1.getListaProductos().get(2).getPrecio();
	int totaltotal = total1 + total2 + total3; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comprar window = new Comprar();
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
	
	public Comprar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 959, 626);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCarrito = new JLabel("CARRITO");
		lblCarrito.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 50));
		lblCarrito.setForeground(new Color(255, 255, 255));
		lblCarrito.setBounds(381, 41, 168, 74);
		frame.getContentPane().add(lblCarrito);
		
		JLabel lblResumen_1 = new JLabel("NIKE AIR MAX:");
		lblResumen_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 35));
		lblResumen_1.setForeground(new Color(255, 255, 255));
		lblResumen_1.setBounds(282, 160, 158, 42);
		frame.getContentPane().add(lblResumen_1);
		
		JLabel lblResumenCompra_1 = new JLabel(Integer.toString(l1.getListaProductos().get(0).getCantidad()));
		lblResumenCompra_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 35));
		lblResumenCompra_1.setForeground(new Color(255, 255, 255));
		lblResumenCompra_1.setBounds(548, 160, 98, 42);
		frame.getContentPane().add(lblResumenCompra_1);
		
		JLabel lblTotal = new JLabel("TOTAL (€):");
		lblTotal.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 35));
		lblTotal.setForeground(new Color(255, 255, 255));
		lblTotal.setBounds(282, 370, 122, 42);
		frame.getContentPane().add(lblTotal);
		
		JLabel lblTotalCompra = new JLabel(Integer.toString(totaltotal));
		lblTotalCompra.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 35));
		lblTotalCompra.setForeground(new Color(255, 255, 255));
		lblTotalCompra.setBounds(548, 370, 98, 44);
		frame.getContentPane().add(lblTotalCompra);
		
		JButton btnComprar = new JButton("CONFIRMAR COMPRA");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "Compra realizada con éxito", "Confirmación de compra", JOptionPane.DEFAULT_OPTION);
				System.exit(0);
			}
		});
		btnComprar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		btnComprar.setBounds(362, 463, 214, 62);
		frame.getContentPane().add(btnComprar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("./Imagenes/fondo1.png"));
		lblNewLabel.setBounds(0, 0, 221, 589);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("./Imagenes/fondo1.png"));
		lblNewLabel_1.setBounds(712, 0, 233, 589);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNikeAirForce = new JLabel("NIKE AIR FORCE 1:");
		lblNikeAirForce.setForeground(Color.WHITE);
		lblNikeAirForce.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 35));
		lblNikeAirForce.setBounds(282, 223, 194, 42);
		frame.getContentPane().add(lblNikeAirForce);
		
		JLabel lblResumen_3 = new JLabel("NIKE REACT:");
		lblResumen_3.setForeground(Color.WHITE);
		lblResumen_3.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 35));
		lblResumen_3.setBounds(282, 287, 131, 42);
		frame.getContentPane().add(lblResumen_3);
		
		JLabel lblResumenCompra_2 = new JLabel(Integer.toString(l1.getListaProductos().get(1).getCantidad()));
		lblResumenCompra_2.setForeground(Color.WHITE);
		lblResumenCompra_2.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 35));
		lblResumenCompra_2.setBounds(548, 223, 98, 42);
		frame.getContentPane().add(lblResumenCompra_2);
		
		JLabel lblResumenCompra_3 = new JLabel(Integer.toString(l1.getListaProductos().get(2).getCantidad()));
		lblResumenCompra_3.setForeground(Color.WHITE);
		lblResumenCompra_3.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 35));
		lblResumenCompra_3.setBounds(548, 287, 98, 42);
		frame.getContentPane().add(lblResumenCompra_3);
		
		JLabel lblEuro = new JLabel("€");
		lblEuro.setForeground(Color.WHITE);
		lblEuro.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 35));
		lblEuro.setBounds(648, 368, 98, 44);
		frame.getContentPane().add(lblEuro);
		
	}
}
