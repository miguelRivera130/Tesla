package View;

import Model.Logica;
import View.UsuarioView;
import View.VehiculoView;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	private int pantalla = 0;
	private UsuarioView usuarioView;
	private VehiculoView vehiculoView;
	PImage pantallaInicial, fondo, modeloUno;

	public static void main(String[] args) {
		PApplet.main("View.Main");
	}

	public void settings() {
		size(400, 700);
	}

	public void setup() {
		pantallaInicial = loadImage("./../data/pantallaInicial.png");
		fondo = loadImage("./../data/fondo.png");

		usuarioView = new UsuarioView(this);
		vehiculoView = new VehiculoView(this);

	}

	public void draw() {

		background(0);

		switch (pantalla) {
		case 0:
			image(pantallaInicial, 0, 0, width, height);
			usuarioView.drawScreen();

			if (usuarioView.isValidante() == true) {
				pantalla = 1;

			}
			break;
		case 1:
			image(fondo, 0, 0, width, height);
			vehiculoView.cardScreen();
			break;

		default:
			break;
		}

	}

	public void mousePressed() {

		usuarioView.informacion();
	}
}