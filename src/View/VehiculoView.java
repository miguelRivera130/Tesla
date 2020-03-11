package View;

import Model.Logica;
import processing.core.PApplet;
import processing.core.PImage;
import controlP5.ControlP5;
import controlP5.Textfield;

public class VehiculoView {

	private ControlP5 cp5;
	private PImage modeloUno, modeloDos, modeloTres;
	private String rendimiento, velocidad, correo;
	private int precio;
	private PApplet app;
	private Logica logica;
	private int seleccion;
	private int posX, posY;
	private int tamX, tamY;

	public VehiculoView(PApplet app) {
		this.posX = 50;
		this.posY = 100;
		this.tamX = app.width - 50;
		this.tamY = app.height / 4;
		cp5 = new ControlP5(app);
		this.modeloUno = app.loadImage("./../data/modelo3.jpg");
		this.modeloDos = app.loadImage("./../data/modeloX.jpg");
		this.modeloTres = app.loadImage("./../data/modeloRoadster.jpg");
	}

	public void cardScreen() {
		drawCards();
	}

	private void drawCards() {

		// primer modelo de coche
		app.image(this.modeloUno, this.posX, this.posY + 25, this.tamX, this.tamY);
		app.fill(0);
		app.rect(this.posX, this.posY, this.tamX, this.tamY);

		// segundo modelo de coche
		app.image(this.modeloDos, this.posX, this.posY + 75, this.tamX, this.tamY);
		app.fill(0);
		app.rect(this.posX, this.posY + 150, this.tamX, this.tamY);

		// tercer modelo de coche
		app.image(this.modeloTres, this.posX, this.posY + 125, this.tamX, this.tamY);
		app.fill(0);
		app.rect(this.posX, this.posY + 300, this.tamX, this.tamY);

	}

	public void selectores() {
		
		// selector de primer modelo de coche
		
		if (app.mouseX > posX && app.mouseY > this.posY + 25 && app.mouseX < (this.posX + this.tamX)
				&& app.mouseY < (this.posY + this.tamY)) {
		}
	}
}
