package code;

import java.io.Serializable;

public class Veterinario extends Trabajador implements Serializable{

	private static final long serialVersionUID = 1L;
	private int animalesAtendidos;
	private double ganancias =0;

	
	
	//------------------------
	//metodo constructor
	
	public Veterinario(String nombre, String iD,String tipoID, String rol, int horasTrabajadas, int festivosTrabajados, 
            int nocturnosTrabajados, int extrasTrabajados,int animalesAtendidos) {

          super(nombre, iD, tipoID, rol, horasTrabajadas,festivosTrabajados, nocturnosTrabajados, extrasTrabajados);
          this.ganancias=calcularGanancias();
          this.animalesAtendidos=animalesAtendidos;
          }
	
	//----------------------
	//metodo para calcular el salario del veterinarios 
	@Override
	public double calcularGanancias() {
		double salario;
		salario=((getHorasTrabajadas())+(getExtrasTrabajados()*0.10)+(getNocturnosTrabajados()*0.20)+(getFestivosTrabajados()*0.15)+(animalesAtendidos*0.7)*salarioBase)/24;
		return Math.round(salario);
	}

	//------------
	//getter y setter
	public int getAnimalesAtendidos() {
		return animalesAtendidos;
	}

	public void setAnimalesAtendidos(int animalesAtendidos) {
		this.animalesAtendidos = animalesAtendidos;
	}


	
	
}