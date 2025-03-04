package code;

import java.io.Serializable;

public class Guia extends Trabajador implements Serializable{

	private static final long serialVersionUID = 1L;
	private int touresDados;

	//-----------------------
	//metodo constructor
	public Guia( String nombre, String iD,String tipoID, String rol, int horasTrabajadas,
			int festivosTrabajados, int nocturnosTrabajados, int extrasTrabajados, int touresDados) {
		super( nombre, iD,tipoID, rol, horasTrabajadas, festivosTrabajados, nocturnosTrabajados,
				extrasTrabajados);
		this.touresDados = touresDados;
	}
	//-----------------------
	//metodo para calcular el salario del concerge 
	@Override
	public double calcularGanancias() {
		double salario;
		salario=((getHorasTrabajadas())+(getExtrasTrabajados()*10)+(getNocturnosTrabajados()*0.20)+(getFestivosTrabajados()*0.15)+(touresDados*0.7)*salarioBase);
		return Math.round(salario);
	}
	

	//---------------
	//getter y setter
	public int getTouresDados() {
		return touresDados;
	}

	public void setTouresDados(int touresDados) {
		this.touresDados = touresDados;
	}
	
	
}