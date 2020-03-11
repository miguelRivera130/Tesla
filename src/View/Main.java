package View;

import Model.Logica;
import View.UsuarioView;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	private int pantalla = 0;
	private UsuarioView usuarioView;
	PImage pantallaInicial;

	public static void main(String[] args) {
		PApplet.main("View.Main");
	}

	public void settings() {
		size(400, 700);
	}

	public void setup() {
		pantallaInicial = loadImage("./../data/pantallaInicial.png");

		usuarioView = new UsuarioView(this);

	}

	public void draw() {

		background(0);

		switch (pantalla) {
		case 0:
			image(pantallaInicial, 0, 0,width, height);
			usuarioView.drawScreen();

			if (usuarioView.isValidante() == true) {
				pantalla = 1;
			}
			break;
		case 1:
			background(0);

			break;

		default:
			break;
		}

	}

	public void mousePressed() {

		usuarioView.informacion();
	}
}