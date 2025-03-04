package code;

public class Habitad {

	private String tamano;
	private String tipoHabtad;
	private Animal[] animal;
	private String codigo;
	
	
	
	//--------------------
	//constructor

	public Habitad(String ubicacion, String tamano, String tipoHabtad, Animal[] animal, String codigo) {
		super();
		this.tamano = tamano;
		this.tipoHabtad = tipoHabtad;
		this.animal = animal;
		this.codigo= codigo;
	
	}
		
		
		
	//----------------------
	//getter y setter

	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public String getTipoHabtad() {
		return tipoHabtad;
	}
	public void setTipoHabtad(String tipoHabtad) {
		this.tipoHabtad = tipoHabtad;
	}
	public Animal[] getAnimal() {
		return animal;
	}
	public void setAnimal(Animal[] animal) {
		this.animal = animal;
	}
	
	
	
	
}