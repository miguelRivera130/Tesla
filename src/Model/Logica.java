package Model;

import java.util.ArrayList;
import Model.Usuario;


public class Logica {

	private ArrayList<Usuario> listaUsuarios;

	public Logica() {

		listaUsuarios = new ArrayList<Usuario>();
	}

	public void registrarUsuario(String nombreDeUsuario, String correo, String contrasena) {
		listaUsuarios.add(new Usuario(nombreDeUsuario, contrasena, correo));

		for (Usuario usuario : listaUsuarios) {
			System.out.println(usuario.getNombreDeUsuario());
			System.out.println(usuario.getContrasena());
			System.out.println(usuario.getCorreo());
			System.out.println("====================");
		}
	}

}