package pojos;

import java.util.Date;

public class Mascota {

	private String nombre;
	private int edad;
	private Date fecha;
	private String dniDue�o;

	public Mascota() {
		super();
		nombre = null;
		edad = 0;
		fecha = null;
		dniDue�o = null;
	}

	public Mascota(String nombre, int edad, Date fecha, String dniDue�o) {
		// this.
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fecha = fecha;
		this.dniDue�o = dniDue�o;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDniDue�o() {
		return dniDue�o;
	}

	public void setDniDue�o(String dniDue�o) {
		this.dniDue�o = dniDue�o;
	}

	@Override
	public String toString() {
		return " Nombre= " + nombre + ", Edad=" + edad + ", Fecha=" + fecha + ", DniDue�o=" + dniDue�o + "";
	}

}
