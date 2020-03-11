package Model;

import processing.core.PApplet;

public class VehiculoDos extends Vehiculo {

	public VehiculoDos(PApplet app, int modeloVehiculo, int cantidad, int precio) {

		super(app, modeloVehiculo, cantidad, precio);
		// TODO Auto-generated constructor stub

		this.modeloVehiculo = 2;
		this.cantidad = cantidad;
		// this.velocidad = (String) "250 km/h";
		this.precio = (int) 2200000;
		// this.rendimiento = (String) "3,5 millas";
		this.modelo = app.loadImage("./../data/modeloX.jpg");

	}

}