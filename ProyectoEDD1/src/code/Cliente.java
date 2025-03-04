package code;

public class Cliente {

	private String nombre;
	private String Id;
	private String tipoId;
	private int visitas =0;

	//---------------------------
	//metodo constructor
	public Cliente(String nombre, String Id, String tipoId) {
		super();
		this.nombre = nombre;
		this.Id = Id;
		this.tipoId = tipoId;
	}

	//----------------------
	//metodo comprar la entrada 
	public void comprarEntrada() {
		
	}
	//----------------------
	//metodo comprar la entrada 
	public void eliminarEntrada() {
			
	}
	
	
	//----------------------------
	//getter y setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getTipoId() {
		return tipoId;
	}
	public void setTipoId(String tipoId) {
		this.tipoId = tipoId;
	}

	public int getVisitas() {
		return visitas;
	}

	public void setVisitas(int visitas) {
		this.visitas = visitas;
	}
	
	
	
	
}