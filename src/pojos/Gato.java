package pojos;

import java.util.Date;

public class Gato extends Mascota {

	private String colorPelo;
	private String pelo;

	public Gato() {
		super();
		this.colorPelo = null;
		this.pelo = null;
	}

	public Gato(String nombre, int edad, Date fecha, String dniDueño, String colorPelo, String pelo) {
		super(nombre, edad, fecha, dniDueño);
		this.colorPelo = colorPelo;
		this.pelo = pelo;

	}

	public Gato(String colorPelo, String pelo) {
		super();
		this.colorPelo = colorPelo;
		this.pelo = pelo;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}

	@Override
	public String toString() {
		return "GATO: "+ super.toString() +" "+ "ColorPelo= " + colorPelo + ", Pelo=" + pelo ;
	}

}
