package Model;

import processing.core.PApplet;

public class VehiculoTres extends Vehiculo {

	public VehiculoTres(PApplet app, int modeloVehiculo, String rendimiento, String velocidad, String precio) {
		super(app, modeloVehiculo, rendimiento, velocidad, precio);
		// TODO Auto-generated constructor stub

		this.velocidad = (String) "420 km/h";
		this.precio = (String) "3'400.000 USD";
		this.rendimiento = (String) "3,5 millas";
		this.modelo = app.loadImage("./../data/modeloRoadster.jpg");

	}

	@Override
	public void pintar() {

		app.image(this.modelo, (float) this.posX, (float) this.posY, (float) this.tamX, (float) this.posY + 100);
		app.fill(0, 0, 0);
		app.rect((float) this.posX, (float) this.posY, (float) this.tamX, (float) this.tamY);

	}
}