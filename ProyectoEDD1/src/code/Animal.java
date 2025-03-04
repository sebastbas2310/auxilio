package code;

public class Animal {
	private String nombre;
	private String ID;
	private String tipoAlimento;
	private int cantidadAlimento;
	private Habitad[] habitad;
	private String tipoAnimal;
	private int edad;
	private String estado;
	private int visitas =0;
	
	//-------------------------------
	//metodo constructor
	public Animal( String nombre, String iD, String tipoAlimento,int cantidadAlimento, Habitad[]/*un habitad tiene varios animales 1 animal no puede tener varios haitads capa 8 <3
	 y usariamos una funcion para obtener el id del habitad en el que se encuetra y poner ese numero */ habitad, String tipoAnimal,
			int edad, String estado) {
		super();
		
		this.nombre = nombre;
		ID = iD;
		this.tipoAlimento = tipoAlimento;
		this.cantidadAlimento=cantidadAlimento;
		this.habitad = habitad;
		this.tipoAnimal = tipoAnimal;
		this.edad = edad;
		this.estado = estado;
		
	}
	public Animal(String iD2) {
		// TODO Auto-generated constructor stub
	}
	//-------------------------
	//metodo para calcular la cantidad de comida consumida por un animal al mes 
	public int cantComConMes() {
		return 0;
	}
	
	//-------------------------
    //metodo para calcular la cantidad de comida consumida por un animal al ano
	public int cantComConAno() {
		return 0;
	}
	
	//-------------------------
    //metodo para calcular la cantidad de comida consumida por todos los animales al mes 
	public int cantComGenM() {
		return 0;
	}
		
	//-------------------------
    //metodo para calcular la cantidad de comida consumida por todos los animales al ano
	public int cantComGenA() {
		return 0;
	}
	
	//------------------------
	//getter y setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getTipoAlimento() {
		return tipoAlimento;
	}
	public void setTipoAlimento(String tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}
	public Habitad[] getHabitad() {
		return habitad;
	}
	public void setHabitad(Habitad[] habitad) {
		this.habitad = habitad;
	}
	public String getTipoAnimal() {
		return tipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getCantidadAlimento() {
		return cantidadAlimento;
	}
	public void setCantidadAlimento(int cantidadAlimento) {
		this.cantidadAlimento = cantidadAlimento;
	}

	public int getVisitas() {
		return visitas;
	}

	public void setVisitas(int visitas) {
		this.visitas = visitas;
	}
	
	

}