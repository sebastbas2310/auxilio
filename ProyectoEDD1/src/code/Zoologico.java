package code;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import errores.ENotFound;
import errores.ENull;
import ficheros.CrearFicheros;

import java.util.random.*;



public class Zoologico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String String = null;
	private Trabajador[] trabajador;
	private Animal[] animal;
	private Cliente[] cliente;
	private Habitad[] habitad;
	CrearFicheros ficheros = new CrearFicheros();
	
	
//constructor
	public Zoologico() {
		this.trabajador = new Trabajador[0];
		this.animal = new Animal[0];
		this.cliente = new Cliente[0];
		this.habitad = new Habitad[0];
		
		try {
	    	trabajador= ficheros.leerTrabajador();
			animal = ficheros.leerAnimal();
			cliente = ficheros.leerCliente();
			habitad = ficheros.leerHabitad();
			
			//Faltan las de los empleados, se necesita el codigo actualizado para revisarlo
			
	    } catch(IOException | ClassNotFoundException e) {
	    	System.out.println(e.getMessage());
	    	//inicializacion();
	    }
		
	}
	

	
//metodos 
	

	//-------------------------------------------TRABAJADOR METODOS--------------------------------------------------------------------------\\
	//METODO PARA AGREGAR EL VETERINARIO 
	public void addVeterinario( String nombre, String iD, String tipoID, String rol,int horasTrabajadas,int nocturnosTrabajados) {
		
		Trabajador v = new Veterinario(nombre,iD,tipoID, rol, horasTrabajadas,generarRan(),nocturnosTrabajados,generarRan(), generarRan());
		trabajador = Arrays.copyOf(trabajador, trabajador.length + 1);
		trabajador[trabajador.length -1 ]= v;
	}
	//METODO PARA ANADIR EL CONSERJE 
    public void addConserje( String nombre, String iD, String tipoID, String rol,int horasTrabajadas,int nocturnosTrabajados) {
		
		Trabajador c = new Conserje(nombre,iD,tipoID, rol, horasTrabajadas,generarRan(),nocturnosTrabajados,generarRan(), generarRan());
		trabajador = Arrays.copyOf(trabajador, trabajador.length + 1);
		trabajador[trabajador.length -1 ]= c;
	}
    //METODO PARA ANADIR EL GUIA
    public void addGuia( String nombre, String iD, String tipoID, String rol,int horasTrabajadas,int nocturnosTrabajados) {
		
		Trabajador g = new Guia(nombre,iD,tipoID, rol, horasTrabajadas,generarRan(),nocturnosTrabajados,generarRan(), generarRan());
		trabajador = Arrays.copyOf(trabajador, trabajador.length + 1);
		trabajador[trabajador.length -1 ]= g;
	}
	
    
	//METODO PARA GENERAR UN RANDOM EL CUAL VA A LLENAR LAS HORAS Y DIAS FESTIVOS EN UN RANDOM
	private int generarRan() {
		Random random = new Random();
		return random.nextInt(3) + 1;
    }

	//ESTE METODO ES PARA DEVOLVER EL INDICE DE LA POSICION DONDE ESTA UBICADO EL TRABAJADOR QUE ESTAMOS BUSCANDO 
	public int devolverIndiceTrabajador(String ID, String tipoID) {
        int t = 0;
        while (t < trabajador.length && !trabajador[t].getID().equalsIgnoreCase(ID) && !trabajador[t].getTipoID().equalsIgnoreCase(tipoID)) {
            t++;
        }
        return (t < trabajador.length) ? t : -1;
    }
	
	//ESTE ES EL METODO PARA ACTUALIZAR EL TRABAJADOR 
    public void actualizarTrabajador(String ID,String nombre, String rol, String tipoID,String newID, int horas) throws ENull {
    	Trabajador trabajador = buscarTrabajador(ID,tipoID);
    	    if ( newID==null) {
    		    throw new ENull("Error: Alguna de las casillas esta vacia");
    	    } else {
    	    	if(newID!=null)
    	    		trabajador.setID(newID);
    	    	
    	    trabajador.setNombre(nombre);
    	    trabajador.setRol(rol);
    	    trabajador.setTipoID(tipoID);
    	    
    			   System.out.println("El trabajador con el ID: "+ID+" actualizado con éxito.");
    		  }
    	   }
    //ESTE ES EL METODO PARA ELIMINAR EL TRABAJADOR 
	public void eliminarTrabajador(String ID, String tipoID) {
        int posicionEliminar = devolverIndiceTrabajador(ID, tipoID);
   		if (posicionEliminar != -1) {
   			for (int i = posicionEliminar; i < trabajador.length - 1; i++) {
   				trabajador[i] = trabajador [i + 1];
   			}
   			trabajador = Arrays.copyOf(trabajador, trabajador.length - 1);
   			System.out.println("El trabajador "+trabajador.length+" se elimino exitosamente");
   		}
   }

	//ESTE ES EL METODO QUE USAMOS PARA BUSCAR UN TRABAJADOR 
	public Trabajador buscarTrabajador(String ID, String tipoDoc) {
	    int i = 0;
	    int save = -1;
	    while (i < trabajador.length && trabajador[i] != null) { 
	        if (trabajador[i].getTipoID().equalsIgnoreCase(tipoDoc) && trabajador[i].getID().equalsIgnoreCase(ID)  ) 
	            save =i;
	        i++;
	    }
	   if(save!=-1)     
	    return trabajador[i]; // Retorna el trabajador si encuentra coincidencia
	   else
	    return null; // Retorna null si no se encuentra el trabajador
	}
	//ESTE METODO PERMITE VER CIUAL ES EL TRABAJADR QUE MAS SALARIO GANA EN EL ZOO
    public Trabajador trabajadorConMasGanancias() throws ENull{
    	if(trabajador==null || trabajador.length==0) {
    		throw new ENull("ERROR: La lista de los trabajadores es nula por lo tanto no se puede buscar este trabajador.");
    		}
    	Trabajador masGanancias=trabajador[0];
    	for(int i =1; i<trabajador.length;i++) {
    		if (trabajador[i].getGanancias() < masGanancias.getGanancias()) {
    			masGanancias = trabajador[i];
    			}
    		}
    	return masGanancias;
    	}
  //ESTE METODO PERMITE VER CIUAL ES EL TRABAJADOR QUE MENOS SALARIO GANA EN EL ZOO
    public Trabajador trabajadorConMenosGanancias() throws ENull{
    	if(trabajador==null || trabajador.length==0) {
    		throw new ENull("ERROR: La lista de los trabajadores es nula por lo tanto no se puede buscar este trabajador.");
    		}
    	Trabajador menosGanancias=trabajador[0];
    	for(int i =1; i<trabajador.length;i++) {
    		if (trabajador[i].getGanancias() > menosGanancias.getGanancias()) {
    			menosGanancias = trabajador[i];
    			}
    		}
    	return menosGanancias;
    	}
    //METOD PARA IMPRIMIR EL TRABAJADOR 
    public Trabajador[] imprimirTrabajador(){
    	return trabajador;
    }
	
	//-------------------------------------------CLIENTES METODOS--------------------------------------------------------------------------\\
	//METODO PARA AGREGAR EL CLIENTE
	public void addCliente(String nombre, String iD, String tipoID){
		
		Cliente newCliente = new Cliente(nombre,iD,tipoID);
		cliente=Arrays.copyOf(cliente, cliente.length+1);
		cliente[cliente.length - 1]=newCliente;		
	}
	//ESTE METODO ES PARA DEVOLVER EL INDICE DE LA POSICION DONDE ESTA UBICADO EL CLIENTE QUE ESTAMOS BUSCANDO 
	public int devolverIndiceCliente(String Id, String tipoID) {
        int t = 0;
        while (t < cliente.length && !cliente[t].getId().equalsIgnoreCase(Id) && !cliente[t].getTipoId().equalsIgnoreCase(tipoID)) {
            t++;
        }
        return (t < cliente.length) ? t : -1;
    }
	 //ESTE ES EL METODO PARA ELIMINAR EL CLIENTE
	public void eliminarCliente(String Id, String documento){
		 int posicionEliminar = devolverIndiceCliente(Id,documento);
	   		if (posicionEliminar != -1) {
	   			for (int i = posicionEliminar; i < cliente.length - 1; i++) {
	   				cliente[i] = cliente[i + 1];
	   			}
	   			cliente = Arrays.copyOf(cliente,cliente.length - 1);
	   			System.out.println("El trabajador "+cliente.length+" se elimino exitosamente");
	   		}
	}
	//ESTE ES EL METODO PARA ACTUALIZAR EL CLIENTE 
	public void actualizarCliente(String Id, String nombre, String tipoID,String newID ,String newTipoID)throws ENull{
		if ( Id==null) 
		    throw new ENull("Error: La casilla ID esta vacia");
		Cliente cliente = buscarCliente(Id,tipoID);
	    
	    	cliente.setId(newID);
	    	cliente.setNombre(nombre);
	    	cliente.setTipoId(newTipoID);
			 System.out.println("El Cliente con el ID: "+Id+" actualizado con éxito.");
		  
	   }
	//ESTE ES EL METODO QUE USAMOS PARA BUSCAR UN TRABAJADOR 
	public Cliente buscarCliente(String Id, String tipoID){
		int i=0; 
		int encontrado =-1;
		while (i<cliente.length) {
			if(cliente[i].getId().equals(Id) && cliente[i].getTipoId().equals(tipoID))
				encontrado=i;
				i++;
		}
		return cliente[encontrado];
	}
	//ESTE METODO PERMITE VER CIUAL ES EL CLIERNTE QUE MAS VECES A IDO AL ZOO
	public Cliente clienteConMasVisitas() throws ENull{
		if(cliente==null || cliente.length==0) {
			throw new ENull("ERROR: La lista de los clientes es nula por lo tanto no se puede buscar este cliente.");
			}
		Cliente masVisitas=cliente[0];
		for(int i =1; i<cliente.length;i++) {
			if (cliente[i].getVisitas() > masVisitas.getVisitas()) {
				masVisitas = cliente[i];
				}
			}
		return masVisitas;
		}
	//ESTE ES EL METODO PERMITE VER CUAL ES EL CLIENTE CON MENOS VISTAS AL ZOO
	public Cliente clienteConMenosVisitas() throws ENull{
		if(cliente==null || cliente.length==0) {
			throw new ENull("ERROR: La lista de los clientes es nula por lo tanto no se puede buscar este cliente.");
			}
		Cliente menosVisitas =cliente[0];
		for(int i =1; i<cliente.length;i++) {
			if (cliente[i].getVisitas() < menosVisitas.getVisitas()) {
				menosVisitas = cliente[i];
				}
			}
		return menosVisitas;
		}
	
	public Cliente[] imprimirCliente() {
		return cliente;
	}
	
	//-------------------------------------------ANIMAL METODOS--------------------------------------------------------------------------\\
	public void addAnimal(String nombre, String iD, String tipoAlimento,int cantidadAlimento, Habitad[] habitad, String tipoAnimal,int edad, String estado) {
		Animal newAnimal = new Animal( nombre,iD, tipoAlimento, cantidadAlimento,  habitad,  tipoAnimal,edad, estado);
		animal= Arrays.copyOf(animal, animal.length+1);
		animal[animal.length-1]=newAnimal;
		
	}
	 //ESTE ES EL METODO PARA ELIMINAR EL ANIMAL
	public void eliminarAnimal(String iD){
		int posicionEliminar = devolverIndiceAnimal(iD);
   		if (posicionEliminar != -1) {
   			for (int i = posicionEliminar; i < animal.length - 1; i++) {
   				animal[i] = animal[i + 1];
   			}
   			animal = Arrays.copyOf(animal,animal.length - 1);
   			System.out.println("El animal "+animal.length+" se elimino exitosamente");
   		}
	}
	//ESTE METODO DEUELVE EL INDICE DEL ANIMAL
	public int devolverIndiceAnimal(String Id) {
        int t = 0;
        while (t < animal.length && !animal[t].getID().equalsIgnoreCase(Id)) {
            t++;
        }
        return (t < animal.length) ? t : -1;
    }
	//ETE METODO FUNCIONA PARA ACTUALIZAR EL ANIMAL 
	public void actualizarAnimal(String iD, String nombre, String tipoAlimento, int cantidadAlimento, String tipoAnimal, int edad, String estado) throws ENull{
		Animal animal = buscarAnimal(iD);
		if ( iD==null) {
		    throw new ENull("Error: Alguna de las casillas esta vacia");
	    } else {
	    	animal.setNombre(nombre);;
            animal.setTipoAlimento(tipoAlimento);
            animal.setCantidadAlimento(cantidadAlimento);
            animal.setTipoAnimal(tipoAnimal);
            animal.setEdad(edad);
            animal.setEstado(estado);
			   System.out.println("El animal con el ID: "+iD+" actualizado con éxito.");
		  }
	   }

	//ETSE METOD SIRVE PARA BUSCAR EL ANIMAL 
	public Animal buscarAnimal(String iD){
		int i=0; 
		while (i>animal.length && !animal[i].getID().equals(iD)) 
			i++;
		return animal[i];
	}
	
	//ESTE METODO LO QIUE NOS VA A AYUDAR A BUSCARE L ANIMAL QUE MAS SE VISITA EN EL ZOO
	public Animal obtenerAnimalConMasVisitas() throws ENull{
		if(animal==null || animal.length==0) {
			throw new ENull("ERROR: La lista de los animales es nula por lo tanto no se puede buscar este animal.");
		}
		Animal masVisitado=animal[0];
				
		for(int i =1; i<animal.length;i++) {
			if (animal[i].getVisitas()>masVisitado.getVisitas()) {
				masVisitado = animal[i];
			}			}
		return masVisitado;
		}
			
	//ESTE METODO LO QIUE NOS VA A AYUDAR A BUSCAR  EL ANIMAL QUE MENOS SE VISITA EN EL ZOO
	public Animal obtenerAnimalConMenosVisitas() throws ENull{
		if(animal==null || animal.length==0) {
			throw new ENull("ERROR: La lista de los animales es nula por lo tanto no se puede buscar este animal.");
			}
		Animal menosVisitado=animal[0];
		for(int i =1; i<animal.length;i++) {
			if (animal[i].getVisitas() < menosVisitado.getVisitas()) {
				menosVisitado = animal[i];
				}
			}
		return menosVisitado;
		}
	
	  public Animal[] imprimirAnimal(){
	    	return animal;
	    }
		
	
	//-------------------------------------------HABITAD METODOS--------------------------------------------------------------------------\\
	//ESTE METODO AGREGA EL HABITAD
	public void addHabitad(String ubicacion, String tamano, String tipoHabtad, Animal[] animal,String codigo) {
		
		Habitad newHabitad = new Habitad (ubicacion,tamano,tipoHabtad, animal,codigo); 
		habitad = Arrays.copyOf(habitad, habitad.length + 1);
		habitad[habitad.length -1] = newHabitad;
		
	}
	//ESTE METODO SIRVE PARA ELIMINAR EL HABITAD 
	public void eliminarHabitad(String codigo){
		int posicionEliminar = devolverIndiceUbicacion(codigo);
   		if (posicionEliminar != -1) {
   			for (int i = posicionEliminar; i < habitad.length - 1; i++) {
   				habitad[i] = habitad[i + 1];
   			}
   			habitad = Arrays.copyOf(habitad,habitad.length - 1);
   			System.out.println("El habitad "+habitad.length+" se elimino exitosamente");
   		}
	}
	//ESTE METODO DEVUELVE LA POSICION EN EL ARRAY DE LA UBICACION DEL HABITAD
	public int devolverIndiceUbicacion(String codigo) {
        int t = 0;
        while (t < habitad.length && !habitad[t].getCodigo().equalsIgnoreCase(codigo)) {
            t++;
        }
        return (t < habitad.length) ? t : -1;
    }
	//ESTE METODO SIRVE PARA ACTUALIZAR EL HABITAD DE UN ANIMAL 
	public void actualizarHabitad(String codigo,String ubicacion, String tamano, String tipoHabitad) throws ENull{
		Habitad habitad = buscarHabitad(codigo);
		if ( codigo==null) {
		    throw new ENull("Error: Alguna de las casillas esta vacia");
	    } else {
	    	habitad.setCodigo(codigo);
	    	habitad.setTamano(tamano);
	    	habitad.setTipoHabtad(tipoHabitad);
			   System.out.println("El animal con el ID: "+codigo+" actualizado con éxito.");
		  }
	   }
	
	//ETSE METOD SIRVE PARA BUSCAR EL ANIMAL 
		public Habitad buscarHabitad(String codigo){
			int i=0; 
			while (i>habitad.length && !habitad[i].getCodigo().equals(codigo)) 
				i++;
			return habitad[i];
		}
	
	
		public Habitad[] imprimirHabitad() {
			// TODO Auto-generated method stub
			return habitad;
		}

		
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



	



	


	

}