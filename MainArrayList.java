
import java.util.*;

import org.omg.CORBA.PRIVATE_MEMBER;

public class MainArrayList {

	static Scanner teclado = new Scanner(System.in);

	static Byte opcion;
	
	static Lista listaUtilizada = new Lista();
	
	private static int DNI;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ejecutaMenu();


	}

	// Métodos útiles

	public static void imprime(String mensaje) {

		System.out.println(mensaje);

	}

	public static void iniciaMenu() {


		imprime("\n1 - Carga una lista");
		imprime("2 - Listar");
		imprime("3 - Inserta una persona al final de la lista");
		imprime("4 - Elimina a una persona por DNI");
		imprime("5 - Cuenta el numero de personas en la lista");
		imprime("6 - Busca por DNI");
		imprime("7 - Busca por nombre");
		imprime("8 - Ordena alfabéticamente por nombre");
		imprime("9 - Guarda la lista en un CSV");
		imprime("\nElige una opción");

	}

	public static void ejecutaMenu() {

		do {

			iniciaMenu();

			opcion = teclado.nextByte();

			switch (opcion) {
		
			case 1:

			//Lista.cargarLista();
				
			listaUtilizada.cargarCSV();

				break;

			case 2:

				listaUtilizada.listar();

				break;

			case 3:

				insertaPersona();

				break;

			case 4:

				imprime("Número de DNI de la persona que quiere eliminar:");
				listaUtilizada.eliminaDNI(teclado.nextInt());
			
				break;

			case 5:

				listaUtilizada.contar();


				break;
				
			case 6:
				
				imprime("Introduce el DNI a buscar");
				listaUtilizada.buscarDNI(teclado.nextInt());
				
				break;
				
			case 7:
				
				imprime("Introduce el nombre a buscar :");
				listaUtilizada.buscarNombre(teclado.next());
			
				break;

			case 8:
				
				listaUtilizada.ordenaNombre();
				
				break;
				
				case 9:
					
					listaUtilizada.guardarCSV();
					break;
					
			default:
				break;
			}



		} while (opcion!=0);


	}

	public static void insertaPersona() {

		imprime("Nombre :");
		String nombre = teclado.next();

		imprime("Apellidos :");
		String apellidos = teclado.next();

		imprime("Edad:");
		int edad = teclado.nextInt();
		
		insertarDNI();

		imprime("Calle :");
		String calle = teclado.next();

		imprime("Código Postal");
		int cp = teclado.nextInt();

		imprime("Provincia :");
		String pronvincia = teclado.next();

		listaUtilizada.insertar(new Persona(nombre, apellidos, DNI, edad, calle, cp, pronvincia));
		
		ejecutaMenu();
	}

	public static void insertarDNI () {
		
		imprime("DNI:");
		DNI = teclado.nextInt();	
		
		if (listaUtilizada.compruebaDNI(DNI)) {
			
			imprime("Ese número ya existe, elija otro");
			imprime("\n");
			insertarDNI();
		}
		
	
		
	}
	
}

