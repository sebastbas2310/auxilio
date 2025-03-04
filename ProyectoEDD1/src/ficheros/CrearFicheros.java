package ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import code.Animal;
import code.Cliente;
import code.Conserje;
import code.Guia;
import code.Habitad;
import code.Trabajador;
import code.Veterinario;

public class CrearFicheros {
	private String ficheroHabitad;
	private String ficheroTrabajador;
	private String ficheroCliente;
	private String ficheroAnimal;
	

	public CrearFicheros() {
		String dir = System.getProperty("user.dir");
		ficheroHabitad = dir + File.separator + "Ficheros" + File.separator + "ficheroHabitad";
		ficheroTrabajador = dir + File.separator + "Ficheros" + File.separator + "ficheroTrabajador";
		ficheroCliente = dir + File.separator + "Ficheros" + File.separator + "ficheroCliente";
		ficheroAnimal = dir + File.separator + "Ficheros" + File.separator + "ficheroAnimal";
		
		File habitadDir = new File(ficheroHabitad);
		if (!habitadDir.exists())
			habitadDir.mkdirs();
		
		File trabajadorDir = new File(ficheroTrabajador);
		if (!trabajadorDir.exists())
			trabajadorDir.mkdirs();
		
		File clienteDir = new File(ficheroCliente);
		if (!clienteDir.exists())
			clienteDir.mkdirs();
		
		File animalDir = new File(ficheroAnimal);
		if (!animalDir.exists())
			animalDir.mkdirs();
		
		
	}
	public void escribirHabitad(Habitad[] habitad) throws IOException {
		for (int i = 0; i < habitad.length; i++) {
			FileOutputStream f = new FileOutputStream(ficheroHabitad + File.separator + habitad[i].getCodigo() + ".habitad");
			ObjectOutputStream o = new ObjectOutputStream(f);

			o.writeObject(habitad[i]);
			o.close();
			f.close();
		}
	}

	public Habitad[] leerHabitad() throws IOException, ClassNotFoundException {
		File f = new File(ficheroHabitad);
		File[] list = f.listFiles();
		Habitad[] habitad;
		try {
			habitad = new Habitad[list.length];
			for (int i = 0; i < list.length; i++) {
				FileInputStream in = new FileInputStream(list[i]);
				ObjectInputStream o = new ObjectInputStream(in);
				habitad[i] = (Habitad) o.readObject();
				o.close();
				in.close();
			}
		} catch (NullPointerException e) {
			habitad = new Habitad[0];
		}
		return habitad;
	}

	public void escribirCliente(Cliente[] cliente) throws IOException {
		for (int i = 0; i < cliente.length; i++) {
			FileOutputStream f = new FileOutputStream(ficheroCliente + File.separator + cliente[i].getNombre() + ".cliente");
			ObjectOutputStream o = new ObjectOutputStream(f);

			o.writeObject(cliente[i]);
			o.close();
			f.close();
		}
	}
	
	public Cliente[] leerCliente() throws IOException, ClassNotFoundException {
		File f = new File(ficheroCliente);
		File[] list = f.listFiles();
		Cliente[] cliente;
		try {
			cliente = new Cliente[list.length];
			for (int i = 0; i < list.length; i++) {
				FileInputStream in = new FileInputStream(list[i]);
				ObjectInputStream o = new ObjectInputStream(in);
				cliente[i] = (Cliente) o.readObject();
				o.close();
				in.close();
			}
		} catch (NullPointerException e) {
			cliente = new Cliente[0];
		}
		return cliente;
	}
	
	public void escribirAnimal(Animal[] animal) throws IOException {
		for (int i = 0; i < animal.length; i++) {
			FileOutputStream f = new FileOutputStream(ficheroAnimal + File.separator + animal[i].getID() + ".animal");
			ObjectOutputStream o = new ObjectOutputStream(f);

			o.writeObject(animal[i]);
			o.close();
			f.close();
		}
	}
	
	public Animal[] leerAnimal() throws IOException, ClassNotFoundException {
		File f = new File(ficheroAnimal);
		File[] list = f.listFiles();
		Animal[] animales;
		try {
			animales = new Animal[list.length];
			for (int i = 0; i < list.length; i++) {
				FileInputStream in = new FileInputStream(list[i]);
				ObjectInputStream o = new ObjectInputStream(in);
				animales[i] = (Animal) o.readObject();
				o.close();
				in.close();
			}
		} catch (NullPointerException e) {
			animales= new Animal[0];
		}
		return animales;
	}
	
	public void escribirTrabajador(Trabajador[] trabajador) throws IOException {
		for (int i = 0; i < trabajador.length; i++) {
			FileOutputStream f;
			if(trabajador[i] instanceof Veterinario) {
				f = new FileOutputStream(
				ficheroTrabajador + File.separator + ((Veterinario)trabajador[i]).getNombre().replace(" ", "_") + ".veterinario");
				ObjectOutputStream o = new ObjectOutputStream(f);
				o.writeObject(trabajador[i]);
				o.close();
				f.close();
			}else if(trabajador[i] instanceof Guia) {
				f = new FileOutputStream(
						ficheroTrabajador + File.separator + ((Guia)trabajador[i]).getNombre().replace(" ", "_") + ".cajero");
				ObjectOutputStream o = new ObjectOutputStream(f);

				o.writeObject(trabajador[i]);
				o.close();
				f.close();
			} else if(trabajador[i] instanceof Conserje) {
				f = new FileOutputStream(
						ficheroTrabajador + File.separator + ((Conserje)trabajador[i]).getNombre().replace(" ", "_") + ".limpieza");
				ObjectOutputStream o = new ObjectOutputStream(f);

				o.writeObject(trabajador[i]);
				o.close();
				f.close();
			}
			
		}
	}
	
	public Trabajador[] leerTrabajador() throws IOException, ClassNotFoundException {
	    File f = new File(ficheroTrabajador);
	    File[] list = f.listFiles();
	    Trabajador[] trabajador;

	    try {
	        trabajador = new Trabajador[list.length];
	        for (int i = 0; i < list.length; i++) {
	            FileInputStream in = new FileInputStream(list[i]);
	            ObjectInputStream o = new ObjectInputStream(in);

	            Object obj = o.readObject(); // Primero lee el objeto

	            if (obj instanceof Veterinario) {
	                trabajador[i] = (Veterinario) obj;
	            } else if (obj instanceof Guia) {
	                trabajador[i] = (Guia) obj;
	            } else if (obj instanceof Conserje) {
	                trabajador[i] = (Conserje) obj;
	            }

	            o.close();
	            in.close();
	        }
	    } catch (NullPointerException e) {
	        trabajador = new Trabajador[0];
	    }

	    return trabajador;
	}
	public void eliminarHabitadFichero(String codigo) {
        File file = new File(ficheroHabitad + File.separator + "Habitad" + codigo + ".habitad");
        if (file.exists()) 
            file.delete();
        }
    
	public void eliminarClienteFichero(String Id) {
        File file = new File(ficheroCliente + File.separator + "Id" +  ".Id");
        if (file.exists()) {
            file.delete();
        }
    }
	
	public void eliminarAnimalFichero(String iD) {
        File file = new File(ficheroAnimal + File.separator + "id" + ".iD");
        if (file.exists()) {
            file.delete();
        }
    }
	public void eliminarTrabajadorFichero(String iD) {
        File file = new File(ficheroTrabajador + File.separator + "id" + ".iD");
        if (file.exists()) {
            file.delete();
        }
    }
	public void actualizarHabitad(Habitad habitad) throws IOException {
	    if (habitad == null) {
	        throw new IllegalArgumentException("El hábitad no puede ser nulo.");
	    }
	    File file = new File(ficheroHabitad + File.separator + habitad.getCodigo() + ".habitad");
	    try (FileOutputStream f = new FileOutputStream(file);
	         ObjectOutputStream o = new ObjectOutputStream(f)) {
	        o.writeObject(habitad);
	    }
	}

	public void actualizarCliente(Cliente cliente) throws IOException {
	    if (cliente == null) {
	        throw new IllegalArgumentException("El cliente no puede ser nulo.");
	    }
	    File file = new File(ficheroCliente + File.separator + cliente.getNombre() + ".cliente");

	    try (FileOutputStream f = new FileOutputStream(file);
	         ObjectOutputStream o = new ObjectOutputStream(f)) {
	        o.writeObject(cliente);
	    }
	}

	public void actualizarAnimal(Animal animal) throws IOException {
	    if (animal == null) {
	        throw new IllegalArgumentException("El animal no puede ser nulo.");
	    }
	    File file = new File(ficheroAnimal + File.separator + animal.getID() + ".animal");
	    try (FileOutputStream f = new FileOutputStream(file);
	         ObjectOutputStream o = new ObjectOutputStream(f)) {
	        o.writeObject(animal);
	    }
	}

	public void actualizarTrabajador(Trabajador trabajador) throws IOException {
	    if (trabajador == null) {
	        throw new IllegalArgumentException("El trabajador no puede ser nulo.");
	    }
	    String extension = obtenerExtension(trabajador);
	    if (extension.isEmpty()) return;
	    File file =new File( ficheroTrabajador + File.separator + trabajador.getNombre() + extension) ;
	    try (FileOutputStream f = new FileOutputStream(file);
	         ObjectOutputStream o = new ObjectOutputStream(f)) {
	        o.writeObject(trabajador);
	        
	    }
	}
	private String obtenerExtension(Trabajador trabajador) {
	    if (trabajador instanceof Veterinario) {
	        return ".bartender";
	    } else if (trabajador instanceof Guia) {
	        return ".cajero";
	    } else if (trabajador instanceof Conserje) {
	        return ".limpieza";
	    }
	    return "";
	}
	
}