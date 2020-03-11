package Model;

import processing.core.PApplet;

public class VehiculoTres extends Vehiculo {

	public VehiculoTres(PApplet app, int modeloVehiculo, int cantidad, int precio) {

		super(app, modeloVehiculo, cantidad, precio);
		// TODO Auto-generated constructor stub

		this.modeloVehiculo = 3;
		this.cantidad = cantidad;
		// this.velocidad = (String) "420 km/h";
		this.precio = (int) 3400000;
		// this.rendimiento = (String) "3,5 millas";
		this.modelo = app.loadImage("./../data/modeloRoadster.jpg");

	}

}