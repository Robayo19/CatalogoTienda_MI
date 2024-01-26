
import java.awt.Frame;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Controlador {

	public void comprobarIngreso(JFrame frame, JTextField txtUsuario, JPasswordField passwordField,
	        ArrayList<Usuario> listaUsuarios) {

	    char[] contrasena = passwordField.getPassword();
	    String contrasenads = new String(contrasena);
	    String e1 = txtUsuario.getText();
	    String e2 = contrasenads;
	    boolean autenticado = false;

	    if (e1.isEmpty()) {
	        JOptionPane.showMessageDialog(frame, "El campo USUARIO está vacío");
	    } else if (e2.isEmpty()) {
	        JOptionPane.showMessageDialog(frame, "El campo CONTRASEÑA está vacío");
	    } else {
	        for (int i = 0; i < listaUsuarios.size(); i++) {
	            if (txtUsuario.getText().equals(listaUsuarios.get(i).getNombre())
	                    && contrasenads.equals(listaUsuarios.get(i).getContrasena())) {
	                autenticado = true;
	                break;
	            }
	        }

	        if (autenticado) {
	            Catalogo catalogo = new Catalogo();
	            catalogo.main(null);
	            frame.dispose();
	        } else {
	            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos", "Error",
	                    JOptionPane.ERROR_MESSAGE);
	        }
	    }
	}

	public void guardarRegistro(JFrame frame, JTextField txtNombre, JTextField txtTelefono, JTextField txtDireccion,
			JTextField txtUsuarioR, JPasswordField txtContrasenaR, ArrayList<Usuario> listaUsuarios) {
		char[] contrasena = txtContrasenaR.getPassword();
		String contrasenads = new String(contrasena);
		String e1 = txtNombre.getText();
		String e2 = txtDireccion.getText();
		String e3 = txtUsuarioR.getText();
		String e4 = contrasenads;
		String e5 = txtTelefono.getText();

		if (e1.isEmpty()) {
			JOptionPane.showMessageDialog(frame, "El campo NOMBRE esta vacio");
		} else if (e5.isEmpty()) {
			JOptionPane.showMessageDialog(frame, "El campo TELEFONO esta vacio");
		} else if (e2.isEmpty()) {
			JOptionPane.showMessageDialog(frame, "El campo DIRECCION esta vacio");
		} else if (e3.isEmpty()) {
			JOptionPane.showMessageDialog(frame, "El campo USUARIO esta vacio");
		} else if (e4.isEmpty()) {
			JOptionPane.showMessageDialog(frame, "El campo CONTRASEÑA esta vacio");
		} else {
			listaUsuarios.add(new Usuario(txtUsuarioR.getText(), contrasenads));
			Login login = new Login();
			login.main(null);
			frame.dispose();
		}
	}
	
	public void sumarCompras(JLabel cantidad1) {
		int c1 = Integer.parseInt(cantidad1.getText());
			c1++;
			cantidad1.setText(Integer.toString(c1));
	}
	
	public void restarCompras(JLabel cantidad1) {
		int c1 = Integer.parseInt(cantidad1.getText());
		if(c1 < 1) {
			c1 = 0;
		} else {
			c1--;
			cantidad1.setText(Integer.toString(c1));
		}
	}

}
