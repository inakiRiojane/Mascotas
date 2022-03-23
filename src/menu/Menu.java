package menu;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import pojos.Gato;
import pojos.Mascota;
import pojos.Perro;

public class Menu {

	private static ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
	private Scanner teclado = null;

	public Menu() {

		teclado = new Scanner(System.in);
	}

	public void iniciar() {

		int opcion;
		rellenarArray();
		do {
			mostrarMenu();
			opcion = escogerOpcion();
			ejecutarOpcion(opcion);
		} while (opcion != 0);

		System.out.println("¡¡ADIOS!! ");
	}

	private void rellenarArray() {

		Perro p1 = new Perro("Lur", 2, new Date(), "12345679K", "Pastor alemán", false);
		Perro p2 = new Perro("Beethoven", 3, new Date(), "56478936G", "San bernardo", true);
		Perro p3 = new Perro("Pongo", 4, new Date(), "78965847F", "Dalmata", false);

		Gato g1 = new Gato("Baltzi", 10, new Date(), "12345679K", "L", "Negro");
		Gato g2 = new Gato("Bola", 4, new Date(), "14785469S", "C", "Tricolor (calicó)");
		Gato g3 = new Gato("Garfield", 6, new Date(), "12345679K", "M", "Naranja");

		mascotas.add(p1);
		mascotas.add(p2);
		mascotas.add(p3);
		mascotas.add(g1);
		mascotas.add(g2);
		mascotas.add(g3);

	}

	private int escogerOpcion() {

		int opcion = 0;
		System.out.println("Escoja una opcion: ");
		opcion = leerOperandoInt();
		return opcion;
	}

	private void mostrarMenu() {
		System.out.println("-------------------------------");
		System.out.println(" ");
		System.out.println("1- Añadir Mascota: ");
		System.out.println("2- Mostrar todas las mascotas: ");
		System.out.println("3- Modificar mascota: ");
		System.out.println("4- Eliminar mascota: ");
		System.out.println("5- Listar mascota por DNI del dueño: ");
		System.out.println("6- Eliminar todas las mascotas por DNI del dueño: ");
		System.out.println("0- Salir:                         ");
		System.out.println(" ");
		System.out.println("-------------------------------");
	}

	private void mostrarMenuMascota() {

		System.out.println("--------------------------------------");
		System.out.println("Seleccione la mascota que desea añadir");
		System.out.println("");
		System.out.println("1- Gato   ");
		System.out.println("2- Perro  ");
		System.out.println("--------------------------------------");
	}

	private void ejecutarOpcion(int opcion) {

		switch (opcion) {

		case 1:
			mostrarMenuMascota();
			int opcionMascota = escogerOpcion();
			añadirMascota(opcionMascota);
			break;
		case 2:
			mostrarTodasMascotas();
			break;
		case 3:
			String nombre = pedirNombre();
			modificarMascota(nombre);
			break;
		case 4:
			String nombre1 = pedirNombre();
			eliminarMascota(nombre1);
			break;
		case 5:
			String dni = pedirDni();
			listarMascotaPorDueño(dni);
			break;
		case 6:
			String dni1 = pedirDni();
			eliminarTodasMascotasPorDueño(dni1);
		}
	}

	private void añadirMascota(int mascota) {

		switch (mascota) {

		case 1:
			Gato gato = new Gato();

			System.out.println("Introduzca el nombre");
			gato.setNombre(leerOperandoText());

			System.out.println("Introduzca la edad:");
			gato.setEdad(leerOperandoInt());

			System.out.println("Introduzca la fecha de nacimiento: ");
			Date fecha = insertarFecha();
			gato.setFecha(fecha);

			System.out.println("Introduzca el DNI del dueño: ");
			gato.setDniDueño(leerOperandoText());

			System.out.println("Introduzca el pelo (SOLO PUEDE SER 'C' de Corto, 'M' de Medio, 'L' de Largo): ");
			gato.setPelo(leerOperandoText());

			System.out.println("Introduzca el color del pelo: ");
			gato.setColorPelo(leerOperandoText());

			mascotas.add(gato);
			break;
		case 2:
			Perro perro = new Perro();

			System.out.println("Introduzca el nombre: ");
			perro.setNombre(leerOperandoText());

			System.out.println("Introduzca la edad:");
			perro.setEdad(leerOperandoInt());

			System.out.println("Introduzca la fecha de nacimiento... ");
			Date fecha1 = insertarFecha();
			perro.setFecha(fecha1);

			System.out.println("Introduzca el DNI del dueño: ");
			perro.setDniDueño(leerOperandoText());

			System.out.println("Introduzca si tiene pulgas o no (teclee 1 o 2 ) : ");
			System.out.println("");
			boolean pulgas = leerBoolean();
			perro.setPulgas(pulgas);

			System.out.println("Introduzca la raza: ");
			perro.setRaza(leerOperandoText());

			mascotas.add(perro);
			break;

		}
	}

	private void mostrarTodasMascotas() {

		for (int i = 0; i < mascotas.size(); i++) {
			System.out.println(mascotas.get(i));
			System.out.println("");
		}
	}

	private void listarMascotaPorDueño(String dni) {
		boolean error = false;
		for (int i = 0; i < mascotas.size(); i++) {

			Mascota mascota = mascotas.get(i);
			if (mascota.getDniDueño().equalsIgnoreCase(dni)) {
				error = true;
				System.out.println(mascotas.get(i));
				System.out.println("");
			}
		}
		if (error == false) {

			System.out.println("ERROR, DNI introducido no existe...");
		}
	}

	private void modificarMascota(String nombre) {

		boolean error = false;

		for (int i = 0; i < mascotas.size(); i++) {

			Mascota mascota = mascotas.get(i);

			if (mascota.getNombre().equalsIgnoreCase(nombre)) {
				error = true;
				System.out.println("Introduce el nuevo nombre: ");
				mascota.setNombre(leerOperandoText());

				System.out.println("Introduce la nueva fecha de nacimiento: ");
				Date fecha = insertarFecha();
				mascota.setFecha(fecha);

				System.out.println("Introduce la nueva edad: ");
				mascota.setEdad(leerOperandoInt());

				mascotas.set(i, mascota);
			}
		}

		if (error == false) {

			System.out.println("ERROR, nombre introducido no existe...");
		}

	}

	private void eliminarMascota(String nombre) {

		boolean error = false;

		for (int i = 0; i < mascotas.size(); i++) {

			Mascota mascota = mascotas.get(i);
			if (mascota.getNombre().equalsIgnoreCase(nombre)) {
				error = true;
				mascotas.remove(i);
			}
		}

		if (error == false) {

			System.out.println("ERROR, nombre introducido no existe...");
		}
	}

	private void eliminarTodasMascotasPorDueño(String dni1) {
		boolean error = false;
		for (int i = 0; i < mascotas.size(); i++) {

			Mascota mascota = mascotas.get(i);
			if (mascota.getDniDueño().equalsIgnoreCase(dni1)) {
				error = true;
				mascotas.remove(i);

			}
		}
		if (error == false) {

			System.out.println("ERROR, DNI introducido no existe...");
		}
	}

	private String pedirNombre() {

		System.out.println("Introduzca el nombre de la mascota: ");
		String nombre = leerOperandoText();
		return nombre;
	}

	private String pedirDni() {

		System.out.println("Introduzca el DNI del dueño: ");
		String dni = leerOperandoText();
		return dni;
	}

	private Date insertarFecha() {
		int año = 0;
		int mes = 0;
		int dia = 0;

		System.out.println("año: ");
		año = leerOperandoInt();
		System.out.println("mes: ");
		mes = leerOperandoInt();
		System.out.println("dia: ");
		dia = leerOperandoInt();

		String fechaIntroducida = año + "-" + mes + "-" + dia;

		java.util.Date fecha = java.sql.Date.valueOf(fechaIntroducida);

		return fecha;
	}

	private boolean leerBoolean() {

		boolean ret = false;
		System.out.println(" 1- SI    2- NO ");
		int opcion = escogerOpcion();

		if (opcion == 1) {
			ret = true;
		} else if (opcion == 2) {

			ret = false;
		}
		return ret;
	}

	private String leerOperandoText() {
		String ret = null;
		try {
			ret = teclado.next();
		} catch (Exception e) {
			teclado.nextLine();
		}
		return ret;
	}

	private int leerOperandoInt() {
		int ret = 0;
		try {
			ret = teclado.nextInt();
		} catch (Exception e) {
			teclado.nextInt();
		}
		return ret;
	}

}
