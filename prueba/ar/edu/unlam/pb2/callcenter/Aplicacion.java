package ar.edu.unlam.pb2.callcenter;

import java.util.Random;
import java.util.Scanner;

public class Aplicacion {
	static Scanner teclado = new Scanner(System.in);
	
	static Random random = new Random();

	public static void main(String[] args) {
		
		Contacto listaDeOesteCableColor[] = new Contacto[2];
		
		Contacto nuevoContacto = null;
		
		System.out.println("Bienvenido al sistema para la gestión de llamadas de Oeste Cable Color");
		
		int opcion = 0;
		do {
		opcion = seleccionarOpcion();
		switch (opcion) {
		case 1:
        buscarAlCandidato(listaDeOesteCableColor, random);
		break;
		case 2:
		registrarNuevoContacto(listaDeOesteCableColor, nuevoContacto);
		break;
		case 3:
		mostrarListaCompleta(listaDeOesteCableColor);
		default:
		System.out.println("Opción Invalida");
		break;
		}
		} while (opcion != 9);

	}

	private static void mostrarListaCompleta(Contacto[] listaDeOesteCableColor) {
		
		for (int i=0; i>=listaDeOesteCableColor.length; i++) {
			if(listaDeOesteCableColor[i] != null) {
				System.out.println(listaDeOesteCableColor[i].toString());
			}
		}
		
	}

	private static void registrarNuevoContacto(Contacto[] listaDeOesteCableColor, Contacto nuevoContacto) {
		
		boolean seAgrego = false;
		
		System.out.println("Ingrese el nombre");
		String nombre = teclado.next();
		System.out.println("Ingrese el apellido");
		String apellido = teclado.next();
		System.out.println("Ingrese el celular");
		int celular = teclado.nextInt();
		System.out.println("Ingrese el email");
		String email = teclado.next();
		System.out.println("Ingrese la direccion");
		String direccion = teclado.next();
		System.out.println("Ingrese el codigo postal");
		int codigoPostal = teclado.nextInt();
		System.out.println("Ingrese la localidad");
		String localidad = teclado.next();
		
		nuevoContacto = new Contacto(nombre, apellido, celular, email, direccion, codigoPostal, localidad);
		
		for (int i=0; i<=listaDeOesteCableColor.length; i++) {
			if(listaDeOesteCableColor[i] == null) {
				listaDeOesteCableColor[i] = nuevoContacto;
				seAgrego = true;
				break;
			}
		}
		
		if(seAgrego == true) {
			System.out.println("Se agrego el nuevo contacto");
		}else {
			System.out.println("No se pudo agregar el nuevo contacto, intentelo nuevamente");
		}
		
	}

	private static void buscarAlCandidato(Contacto[] listaDeOesteCableColor, Random random) {
		
		int max = 1;
		
		int min = 0;
		
		int valorRandom = random.nextInt((max - min) + 1) + min;

		if(listaDeOesteCableColor[valorRandom] != null && listaDeOesteCableColor[valorRandom].isCliente() == false && listaDeOesteCableColor[valorRandom].isDeseaSerLlamado() == true) {
			System.out.println(listaDeOesteCableColor[valorRandom].toString());
			return;
		} else {
			buscarAlCandidato(listaDeOesteCableColor, random);
		}
		
	}

	private static int seleccionarOpcion() {
		int opcionSeleccionada=0;
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Llamar a un contacto");
		System.out.println("2 - Registrar un contacto nuevo");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		opcionSeleccionada = teclado.nextInt();
		return opcionSeleccionada;
	}

}
