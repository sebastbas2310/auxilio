package code;

import java.io.Serializable;

public abstract class Trabajador implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String ID;
	private String tipoID;
	protected final double salarioBase = 1500000;
	private String rol;
	private int horasTrabajadas;
	private int festivosTrabajados;
	private int nocturnosTrabajados;
	protected int extrasTrabajados;
	private double ganancias = 0;
	
	//------------------------
	//constructor de la clase Trabajador 
	
	public Trabajador(String nombre, String ID, String tipoID, String rol,  int horasTrabajadas, int festivosTrabajados, 
			int nocturnosTrabajados, int extrasTrabajados) {
                this.nombre = nombre;
                this.ID = ID;
                this.tipoID = tipoID;
                this.rol = rol;
                this.horasTrabajadas = horasTrabajadas;
                this.festivosTrabajados = festivosTrabajados;
                this.nocturnosTrabajados = nocturnosTrabajados;
                this.extrasTrabajados = extrasTrabajados;
                this.ganancias = calcularGanancias();
}

	
	//-------------------
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
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public int getFestivosTrabajados() {
		return festivosTrabajados;
	}
	public void setFestivosTrabajados(int festivosTrabajados) {
		this.festivosTrabajados = festivosTrabajados;
	}
	public int getNocturnosTrabajados() {
		return nocturnosTrabajados;
	}
	public void setNocturnosTrabajados(int nocturnosTrabajados) {
		this.nocturnosTrabajados = nocturnosTrabajados;
	}
	public int getExtrasTrabajados() {
		return extrasTrabajados;
	}
	public void setExtrasTrabajados(int extrasTrabajados) {
		this.extrasTrabajados = extrasTrabajados;
	}
	public String getTipoID() {
		return tipoID;
	}
	public void setTipoID(String tipoID) {
		this.tipoID = tipoID;
	}
	public double getGanancias() {
		return ganancias;
	}
	public void setGanancias(int ganancias) {
		this.ganancias = ganancias;
	}
	
	public abstract double calcularGanancias();	
}