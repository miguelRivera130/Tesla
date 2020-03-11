package Model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Vehiculo {
	protected double posX, posY;
	protected double tamX, tamY;
	protected PImage modelo;
	public boolean movimiento;
	protected int movBar;
	protected int modeloVehiculo;
	protected int rendimiento, velocidad, precio;
	protected PApplet app;

	public Vehiculo(PApplet app, int modeloVehiculo, int rendimiento, int velocidad, int precio) {

		this.precio = precio;
		this.velocidad = velocidad;
		this.rendimiento = rendimiento;
		this.posX = 50;
		this.posY = 100;
		this.tamX = 300;
		this.tamY = 120;
		this.movBar = 1;

	}

	public abstract void pintar();

	public abstract void Movimiento();
}
//PINTAR TEXTO app.text(
