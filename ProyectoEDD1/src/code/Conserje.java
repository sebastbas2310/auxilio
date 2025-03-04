package code;

import java.io.Serializable;

public class Conserje extends Trabajador implements Serializable  {

	private static final long serialVersionUID = 1L;
	private double reciclajeRecaudado;
	
	
	//--------------------------
	//constructor
	public Conserje( String nombre, String iD,String tipoID, String rol, int horasTrabajadas,
			int festivosTrabajados, int nocturnosTrabajados, int extrasTrabajados, double reciclajeRecaudado) {
		super( nombre, iD,tipoID, rol, horasTrabajadas, festivosTrabajados, nocturnosTrabajados,
				extrasTrabajados);
		this.reciclajeRecaudado = reciclajeRecaudado;
	}
	
	//-----------------------
	//metodo para calcular el salario del concerge 
	@Override
	public double calcularGanancias() {
		double salario;
		salario=((salarioBase)+(getHorasTrabajadas()*10)+(getExtrasTrabajados()*20)+(getNocturnosTrabajados()*30)+(getFestivosTrabajados()*45)+(reciclajeRecaudado*105));
		return (salario);
	}

	
	//=-------------------------
	//getter y setter
	public double getReciclajeRecaudado() {
		return reciclajeRecaudado;
	}

	public void setReciclajeRecaudado(double reciclajeRecaudado) {
		this.reciclajeRecaudado = reciclajeRecaudado;
	}



	
	
	
}