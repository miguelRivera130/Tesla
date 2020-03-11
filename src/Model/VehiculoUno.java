package Model;

import processing.core.PApplet;

public class VehiculoUno extends Vehiculo {

	public VehiculoUno(PApplet app, int modeloVehiculo, String rendimiento, String velocidad, String precio) {
		super(app, modeloVehiculo, rendimiento, velocidad, precio);
		// TODO Auto-generated constructor stub

		this.velocidad = (String) "225 km/h";
		this.precio = (String) "1'500.000 USD";
		this.rendimiento = (String) "3,0 millas";
		this.modelo = app.loadImage("./../data/modelo3.jpg");

	}

	@Override
	public void pintar() {
		// TODO Auto-generated method stub

		app.image(this.modelo, (float) this.posX, (float) this.posY, (float) this.tamX, (float) this.tamY / 3);
		app.fill(0, 0, 0);
		app.rect((float) this.posX, (float) this.posY, (float) this.tamX, (float) this.tamY);

	}

}