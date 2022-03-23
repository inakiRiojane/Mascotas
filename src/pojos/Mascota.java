package pojos;

import java.util.Date;

public class Mascota {

	private String nombre;
	private int edad;
	private Date fecha;
	private String dniDueño;

	public Mascota() {
		super();
		nombre = null;
		edad = 0;
		fecha = null;
		dniDueño = null;
	}

	public Mascota(String nombre, int edad, Date fecha, String dniDueño) {
		// this.
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fecha = fecha;
		this.dniDueño = dniDueño;
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

	public String getDniDueño() {
		return dniDueño;
	}

	public void setDniDueño(String dniDueño) {
		this.dniDueño = dniDueño;
	}

	@Override
	public String toString() {
		return " Nombre= " + nombre + ", Edad=" + edad + ", Fecha=" + fecha + ", DniDueño=" + dniDueño + "";
	}

}
