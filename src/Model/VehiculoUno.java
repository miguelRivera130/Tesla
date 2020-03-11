package Model;

import processing.core.PApplet;

public class VehiculoUno extends Vehiculo {

	public VehiculoUno(PApplet app, int modeloVehiculo, int cantidad, int precio) {

		super(app, modeloVehiculo, cantidad, precio);
		// TODO Auto-generated constructor stub

		this.modeloVehiculo = 1;
		this.cantidad = cantidad;
		// this.velocidad = (String) "225 km/h";
		this.precio = (int) 1500000;
		// this.rendimiento = (String) "3,0 millas";
		this.modelo = app.loadImage("./../data/modelo3.jpg");

	}

}