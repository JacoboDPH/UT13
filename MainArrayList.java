import java.nio.channels.InterruptedByTimeoutException;
import java.util.*;

public class MainArrayList {

	static Scanner teclado = new Scanner(System.in);

	static Byte opcion;

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
		imprime("4 - Elimina a una persona");
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
				
			Lista.cargarCSV();

				break;

			case 2:

				Lista.listar();

				break;

			case 3:

				insertaPersona();

				break;

			case 4:

				imprime("Nombre de la persona que quiere eliminar:");
				Lista.eliminaNombre(teclado.next());
			

				break;

			case 5:

				Lista.contar();


				break;
				
			case 6:
				
				imprime("Introduce el DNI a buscar");
				Lista.buscarDNI(teclado.nextInt());
				
				break;
				
			case 7:
				
				imprime("Introduce el nombre a buscar :");
				Lista.buscarNombre(teclado.next());
			
				break;

			case 8:
				
				Lista.ordenaNombre();
				
				break;
				
				case 9:
					
					Lista.guardarCSV();
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

		imprime("DNI:");
		int DNI = teclado.nextInt();

		imprime("Calle :");
		String calle = teclado.next();

		imprime("Código Postal");
		int cp = teclado.nextInt();

		imprime("Provincia :");
		String pronvincia = teclado.next();

		Lista.insertar(new Persona(nombre, apellidos, DNI, edad, calle, cp, pronvincia));
		
		ejecutaMenu();
	}

	
}

