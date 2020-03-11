package View;

import controlP5.ControlP5;
import controlP5.Textfield;
import Model.Logica;
import processing.core.PApplet;

public class UsuarioView {
	private String nombreDeUsusario, contrasena, confirmarContrasena, correo;
	private PApplet app;
	private ControlP5 cp5;
	private String[] inputs;
	private Logica logica;
	private boolean validante = false;

	public UsuarioView(PApplet app) {

		logica = new Logica();
		this.app = app;
		cp5 = new ControlP5(app);
		inputs = new String[4];

		// inputs[] = {"Nombre de usuario","Contrasena","ConfirmarContrasena","Correo"};
		inputs[0] = "Nombre de usuario";
		inputs[1] = "Contrasena (solo numerica)";
		inputs[2] = "Confirmar contrasesna (solo numerica)";
		inputs[3] = "Correo";

		for (int i = 0; i < inputs.length; i++) {
			cp5.addTextfield(inputs[i]).setPosition((app.width / 2) - 100, 380 + (i * 60)).setSize(200, 30)
					.setAutoClear(true);
		}
	}

	public void drawScreen() {

		drawButton();

	}

	private void drawInput() {

	}

	private void drawButton() {
		app.fill(48, 78, 150);
		app.rect((app.width / 2) - 40, (app.height) - 70, 80, 30);
	}

	public void informacion() {
		
		if (app.mouseX > ((app.width / 2) - 40) && app.mouseY > ((app.height) - 70)
				&& app.mouseX < ((app.width / 2) + 40) && app.mouseY < ((app.height) - 40)) {
			nombreDeUsusario = cp5.get(Textfield.class, "Nombre de usuario").getText();
			contrasena = cp5.get(Textfield.class, "Contrasena (solo numerica)").getText();
			confirmarContrasena = cp5.get(Textfield.class, "Confirmar contrasesna (solo numerica)").getText();
			correo = cp5.get(Textfield.class, "Correo").getText();
			// Esto valida que un string sea igual a otro
			if (contrasena.equals(confirmarContrasena) && contrasena != null) {
				System.out.println("este si entra.");
				logica.registrarUsuario(nombreDeUsusario, contrasena, correo);
				validante = true;
				cp5.remove("Nombre de usuario");
				cp5.remove("Contrasena (solo numerica)");
				cp5.remove("Confirmar contrasesna (solo numerica)");
				cp5.remove("Correo");
			}
		}
	}

	public boolean isValidante() {
		return validante;
	}

}