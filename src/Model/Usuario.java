package Model;

public class Usuario {

	private String nombreDeUsuario, correo;
	String contrasena;

	public Usuario(String nombreDeUsuario, String contrasena, String correo) {
		this.nombreDeUsuario = nombreDeUsuario;
		this.contrasena = contrasena;
		this.correo = correo;
	}

	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}

	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}

