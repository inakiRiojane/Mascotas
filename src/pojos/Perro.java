package pojos;

import java.util.Date;

public class Perro extends Mascota {

	private String raza;
	private boolean pulgas;

	public Perro() {
		super();
		this.raza = null;
		this.pulgas = false;
	}

	public Perro(String nombre, int edad, Date fecha, String dniDueño, String raza, boolean pulgas) {
		super(nombre, edad, fecha, dniDueño);
		this.pulgas = pulgas;
		this.raza = raza;
	}



	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}

	@Override
	public String toString() {
		return "PERRO: " + super.toString() + " Raza= " + raza + ", Pulgas=" + pulgas;
	}

}
