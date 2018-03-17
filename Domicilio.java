
public class Domicilio {

	//atributos
	
	private String calle;
	private int codigoPostal;
	private String provincia;
	
	public Domicilio (String calle, int codigoPostal, String provincia) {
		
		this.calle = calle;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
		
	}
	
	public String toString() {
		

		return (" ,residiendo en calle "+calle+" de la provincia "+provincia);
	
		
	}
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	
}
