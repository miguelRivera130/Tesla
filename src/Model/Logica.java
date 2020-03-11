package Model;

import java.util.ArrayList;
import Model.Usuario;
import Model.Vehiculo;
import Model.VehiculoDos;
import Model.VehiculoTres;
import Model.VehiculoUno;
import processing.core.PApplet;

public class Logica {

	private ArrayList<Vehiculo> listaVehiculo;

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