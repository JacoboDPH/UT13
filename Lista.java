import java.util.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;



public class Lista {

	public static ArrayList<Persona> personitas = new ArrayList<Persona>();
	
	public Lista () {
		
			
	}
	
	public void cargarLista() {
		
		personitas.add(new Persona("Joselito", "Anchoa", 78230212, 25, "Pachanga", 38200, "Teruel"));
		personitas.add(new Persona("Ana", "Paciencia", 43323400, 30, "Hartura", 38100, "Tenerife"));
		personitas.add(new Persona("Juan", "Gonzalo", 78271823, 30, "Los Dolores de Cabeza", 38109, "Tenerife"));
	}
	
	public void insertar(Persona p) {
	    personitas.add(p);
	}
	
	public void listar() {
		
		for (Persona listado:personitas) {
			
				System.out.println(listado);
							
		}
		
	}
	
	public  void eliminarPosicion(int pos) {
		
		personitas.remove(pos);
		
	}

	public void eliminaDNI (int unDNI) {
	
		
			
	
		ArrayList<Integer> borrado = new ArrayList<>();
		
		for (Persona DNILista: personitas) {
			
			borrado.add(DNILista.getDni());
		}
		
		if (borrado.contains(unDNI)) {
			
			personitas.remove(borrado.indexOf(unDNI));
			
		}
	
		
	}
	
	public void eliminaNombre (String unNombre) {

		ArrayList<String> borrado = new ArrayList<>();

		for (Persona nombresLista : personitas) {
		
			borrado.add(nombresLista.getNombre());
		}

		
		if (borrado.contains(unNombre)) {

			personitas.remove(borrado.indexOf(unNombre));
			
			System.out.println(unNombre+ " ha sido eliminado con exito");

			
		}else {
			System.out.println(unNombre + " no existe en la lista");
		}
		
	}


	public  void buscarDNI (int unDNI) {
		
		ArrayList<Integer> busqueda = new ArrayList<>();

		for (Persona nombresLista : personitas) {
		
			busqueda.add(nombresLista.getDni());
						
			
		}
		
		if (busqueda.contains(unDNI)) {
			
			System.out.print("\n********************Encontrado******************** \n");
			System.out.println("\n"+personitas.get(busqueda.indexOf(unDNI)).toString());
			
							
		}
		else {
			
			System.out.println("\n DNI no encontrado");
			
		}

		
	}
	public boolean compruebaDNI (int unDNI) {
		
		boolean existe = false;
		ArrayList<Integer> busqueda = new ArrayList<>();

		for (Persona nombresLista : personitas) 
		
			busqueda.add(nombresLista.getDni());
							
				
		if (busqueda.contains(unDNI)) 
				
			existe = true;
		
		return existe;
	}
	
 public void buscarNombre (String unNombre) {
		
		ArrayList<String> busqueda = new ArrayList<>();

		for (Persona nombresLista : personitas) {
		
			busqueda.add(nombresLista.getNombre());
						
			if (nombresLista.getNombre().equals(unNombre)) {
				
				System.out.println(nombresLista);
			
			}
			
		}
		
		if (!busqueda.contains(unNombre)) {
			
		
			System.out.println("\n Nombre no encontrado");
			
		}

		
	}
	
	public void contar() {
		
		
		System.out.println("La lista tiene " + personitas.size()+" personas");
		
	}

	public void guardarCSV() {
		
		try {
			
			BufferedWriter escritura = new BufferedWriter(new FileWriter("contactos.csv"));
			
			for (Persona listado:personitas) {
				
				System.out.println(listado);
				escritura.write(listado+"\n");
							
		}
			escritura.close(); }
		
		catch (Exception e) {
				System.out.print("Ha habído un error");
			}
		
		
	}
	
	public void cargarCSV () {
		
		    String csvFichero = "contactos.csv";
	        BufferedReader br = null;
	        String line = "";
	        String cvsSplitBy = ",";
	        
	        try {
				
	        	br = new BufferedReader(new FileReader(csvFichero));
	      
	        	while ((line =br.readLine()) != null) {
	        		
	        		//crea un array de String donde introducira un campo todo aquello que esté separado por una , durante una línea

	        		String[] contactazos = line.split(cvsSplitBy);
	        		
	       
	       		personitas.add(new Persona(
						        				contactazos[0],
						        				contactazos[1],
						        				convierte(contactazos[2]),
						        				convierte(contactazos[3]),
						        				contactazos[4],
						        				convierte(contactazos[5]),
						        				contactazos[6]));

	       	
	       	
	    
	        		
	        	}
	        	
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Ha habído algún problema");
			}
	        
	    	System.out.println("Se ha cargado la lista con éxito del fichero " +csvFichero);
		
	}
	
	// Método útil 
	
	public int convierte(String unString) {
		
		return Integer.parseInt(unString);
	}
	
	public  void ordenaNombre ()
	{
	
		Collections.sort(personitas);
		
		
	}
	
}
