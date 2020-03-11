package Model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Vehiculo {
	protected PImage modelo;
	protected int modeloVehiculo;
	int precio;
	protected PApplet app;
	protected int cantidad;

	public Vehiculo(PApplet app, int modeloVehiculo, int cantidad, int precio) {

		this.precio = precio;
		this.cantidad = cantidad;

	}

}
//PINTAR TEXTO app.text(
