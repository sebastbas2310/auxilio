package code;

import java.util.Date;

public class Entrada {

	private Date horaEntrada;
	private Date horaSalida;
	private String tipoEntrada;
	protected final double precioEntrada = 20000;
	
	//constructor
	public Entrada(Date horaEntrada, Date horaSalida, String tipoEntrada) {
		super();
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
		this.tipoEntrada = tipoEntrada;
	}

	//setters y getters
	public Date getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(Date horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public Date getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}
	
	
	//metodos
	
	public String generarCodigo() {
		
		return null;
	}
	
	
	
}
