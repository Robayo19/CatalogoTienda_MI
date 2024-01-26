import java.util.ArrayList;

public class Lista {
	
	private static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	private static ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	
	public static void agregarUsuario(String nombre, String contrasena) {
		listaUsuarios.add(new Usuario(nombre, contrasena));
	}
	
	public static void agregarProducto(int cantidad, int precio) {
		listaProductos.add(new Producto(cantidad, precio));
	}

	public static ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public static ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public static void setListaProductos(ArrayList<Producto> listaProductos) {
		Lista.listaProductos = listaProductos;
	}

	public static void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		Lista.listaUsuarios = listaUsuarios;
	}
	
	

}
