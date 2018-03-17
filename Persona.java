
public class Persona implements Comparable<Persona>  {

	//Atributos 
	
	private String nombre;
	private String apellidos;
	private int dni;
	private int edad;
	
	Domicilio casa;
	
	
	public Persona (String nombre, String apellidos, int dni, int edad, String calles, int codigoPostales, String provincias) {
			
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		
		casa = new Domicilio(calles,codigoPostales,provincias);
	
		
	}

	public String toString() {
		
		String mensaje;

		mensaje = (nombre+","+apellidos+","+dni+","+edad+","+casa.getCalle()+","+casa.getCodigoPostal()+","+ casa.getProvincia()  );
		return mensaje;
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int compareTo(Persona o) {

	
		return (this.nombre).compareTo(o.getNombre());
	}

	
	
	
}
