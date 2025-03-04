package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import code.Cliente;
import code.Trabajador;
import code.Zoologico;
import errores.ENull;
import errores.exeption2;
import ficheros.CrearFicheros;

import javax.swing.JLayeredPane;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;

public class AdminCliente {
	
	Zoologico zoo = new Zoologico();
	private JFrame frame;
	private DefaultTableModel model2;
	private JLayeredPane layeredPane_1;
	private JLayeredPane layeredPane_2;
	private JTextField IDCrear;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JComboBox tipoIDCrear;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField IDActializar;
	private JTextField nombreActualizar;
	private JButton btnAtras;
	private JTextField IDEliminar;
	private JButton btnActualizar;
	private JButton btnEliminarCliente;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JComboBox tipoIDActualizar;
	private JComboBox tipoIDEliminar;
	private JLabel lblNewLabel_12;
	private JScrollPane scrollPane;
	private JTable tablaCliente;
	private JTextField nombreCrear;
	private JTextField newID;
	private JLabel lblNewLabel_4;
	CrearFicheros ficheros = new CrearFicheros();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminCliente window = new AdminCliente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	/**
	 * Create the application.
	 */
	public AdminCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1142, 838);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(20, 455, 294, 319);
		frame.getContentPane().add(layeredPane);
		//crear Trabajador
		JButton botonCrear = new JButton("crear");
		botonCrear.setBounds(195, 285, 89, 23);
	botonCrear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				String nombres= nombreCrear.getText();
				String documento = IDCrear.getText();
				String tipoDoc = tipoIDCrear.getSelectedItem().toString();
				Cliente[] Cliente = zoo.imprimirCliente();
				if (nombres == null || documento == null){
					exeption2 exeption = new exeption2();
					exeption.setVisible(true);
				}
				else {
						zoo.addCliente(nombres, documento, tipoDoc) ;
						try {
							ficheros.escribirCliente(Cliente);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						llenarTablaCliente();
						popupExito Exito = new popupExito();
						Exito.setVisible(true);	
				}
				tablaCliente.revalidate();
				tablaCliente.repaint();
			}
		
				
				
	});
		layeredPane.add(botonCrear);
		
		
		IDCrear = new JTextField();
		IDCrear.setBounds(10, 94, 126, 20);
		layeredPane.add(IDCrear);
		IDCrear.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("nombre");
		lblNewLabel.setBounds(198, 48, 36, 36);
		layeredPane.add(lblNewLabel);
		
		tipoIDCrear = new JComboBox();
		tipoIDCrear.setModel(new DefaultComboBoxModel(new String[] {"CC", "TI", "CE", "Pasaporte"}));
		tipoIDCrear.setBounds(10, 148, 126, 22);
		layeredPane.add(tipoIDCrear);
		
		lblNewLabel_1 = new JLabel("Crear Cliente");
		lblNewLabel_1.setBounds(91, 11, 121, 26);
		layeredPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setBounds(195, 97, 46, 14);
		layeredPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Tipo ID");
		lblNewLabel_3.setBounds(188, 152, 46, 14);
		layeredPane.add(lblNewLabel_3);
		
		nombreCrear = new JTextField();
		nombreCrear.setBounds(10, 56, 126, 20);
		layeredPane.add(nombreCrear);
		nombreCrear.setColumns(10);
		
		layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(345, 455, 294, 319);
		frame.getContentPane().add(layeredPane_1);
		
		lblNewLabel_5 = new JLabel("actualizar Cliente\r\n");
		lblNewLabel_5.setBounds(85, 11, 125, 14);
		layeredPane_1.add(lblNewLabel_5);
		
		IDActializar = new JTextField();
		IDActializar.setBounds(10, 59, 86, 20);
		layeredPane_1.add(IDActializar);
		IDActializar.setColumns(10);
		
		nombreActualizar = new JTextField();
		nombreActualizar.setBounds(10, 99, 86, 20);
		layeredPane_1.add(nombreActualizar);
		nombreActualizar.setColumns(10);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(195, 285, 89, 23);
		btnActualizar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				String nombres= nombreCrear.getText();
				String documento = IDCrear.getText();
				String tipoDoc = tipoIDCrear.getSelectedItem().toString();
				String newDoc;
				String newTipoDoc; 
				if(newID.getText() != null)
					newDoc = newID.getText();
				else
					newDoc = documento;
				
				if(newTipoIDActualizar() != null)
					newTipoDoc = newTipoIDActualizar().getText();
				else
					newTipoDoc = tipoDoc;
					try {
						zoo.actualizarCliente(documento, nombres, tipoDoc, newDoc, newTipoDoc);
					} catch (ENull e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					llenarTablaCliente();
				
				tablaCliente.revalidate();
				tablaCliente.repaint();
			}
		
				
				
	});
		layeredPane_1.add(btnActualizar);
		
		lblNewLabel_8 = new JLabel("id");
		lblNewLabel_8.setBounds(151, 62, 46, 14);
		layeredPane_1.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Nombre");
		lblNewLabel_9.setBounds(151, 102, 46, 14);
		layeredPane_1.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Tipo ID");
		lblNewLabel_10.setBounds(151, 142, 46, 14);
		layeredPane_1.add(lblNewLabel_10);
		
		tipoIDActualizar = new JComboBox();
		tipoIDActualizar.setModel(new DefaultComboBoxModel(new String[] {"CC", "TI", "CE", "Pasaporte"}));
		tipoIDActualizar.setBounds(10, 138, 86, 22);
		layeredPane_1.add(tipoIDActualizar);
		
		newID = new JTextField();
		newID.setBounds(10, 182, 86, 20);
		layeredPane_1.add(newID);
		newID.setColumns(10);
		
		lblNewLabel_4 = new JLabel("new ID\r\n");
		lblNewLabel_4.setBounds(151, 185, 46, 14);
		layeredPane_1.add(lblNewLabel_4);
		
		JComboBox newTipoIDActualizar = new JComboBox();
		newTipoIDActualizar.setModel(new DefaultComboBoxModel(new String[] {"CC", "TI", "CE", "Pasaporte"}));
		newTipoIDActualizar.setBounds(10, 225, 86, 22);
		layeredPane_1.add(newTipoIDActualizar);
		
		JLabel lblNewLabel_11 = new JLabel("New tipo ID");
		lblNewLabel_11.setBounds(151, 229, 78, 14);
		layeredPane_1.add(lblNewLabel_11);
		
		layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(673, 455, 294, 319);
		frame.getContentPane().add(layeredPane_2);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(0, 0, 294, 319);
		layeredPane_2.add(separator_2);
		
		lblNewLabel_6 = new JLabel("Eliminar Cliente");
		lblNewLabel_6.setBounds(69, 11, 132, 14);
		layeredPane_2.add(lblNewLabel_6);
		
		IDEliminar = new JTextField();
		IDEliminar.setBounds(10, 57, 86, 20);
		layeredPane_2.add(IDEliminar);
		IDEliminar.setColumns(10);
		
		btnEliminarCliente = new JButton("Eliminar ");
		btnEliminarCliente.setBounds(195, 166, 89, 23);
		btnEliminarCliente.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				String documento = IDEliminar.getText();
				String tipoDoc = tipoIDEliminar.getSelectedItem().toString();
				if (documento.equals("")){
					exeption2 exeption = new exeption2();
					exeption.setVisible(true);
				}
				else {
					zoo.eliminarCliente(documento,tipoDoc);
					/*try {
						ficheros.escribirEmpleados(empleado);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}*/
					llenarTablaCliente();
					popupExito Exito = new popupExito();
					Exito.setVisible(true);	
				}
				
				tablaCliente.revalidate();
				tablaCliente.repaint();
			}
		
				
				
	});
		layeredPane_2.add(btnEliminarCliente);
		
		lblNewLabel_7 = new JLabel("Id");
		lblNewLabel_7.setBounds(195, 60, 46, 14);
		layeredPane_2.add(lblNewLabel_7);
		
		tipoIDEliminar = new JComboBox();
		tipoIDEliminar.setModel(new DefaultComboBoxModel(new String[] {"C.C", "T.I", "C.E", "Pasaporte"}));
		tipoIDEliminar.setBounds(10, 102, 86, 22);
		layeredPane_2.add(tipoIDEliminar);
		
		lblNewLabel_12 = new JLabel("tipoID");
		lblNewLabel_12.setBounds(195, 106, 46, 14);
		layeredPane_2.add(lblNewLabel_12);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 455, 294, 319);
		frame.getContentPane().add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(345, 455, 294, 319);
		frame.getContentPane().add(separator_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 1095, 415);
		frame.getContentPane().add(scrollPane);
		
		tablaCliente = new JTable();
		
		model2 = new DefaultTableModel();
		tablaCliente.setModel(model2);
		
		model2.addColumn("nombre");
		model2.addColumn("ID");
		model2.addColumn("tipoID");
		
		
		scrollPane.setViewportView(tablaCliente);
		
		scrollPane.setViewportView(tablaCliente);
		tablaCliente.setModel(model2);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(1016, 776, 89, 23);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					Selecciones seleccion= new Selecciones();//codigo de accion al presionar el boton de inicio
					seleccion.setVisible(true);
					dispose();
				
				}
				});
		frame.getContentPane().add(btnAtras);
		}
		//metodos
	
	
	
		protected JTextComponent newTipoIDActualizar() {
		// TODO Auto-generated method stub
		return null;
	}



		public void llenarTablaCliente(){
			
			Cliente[] cliente = zoo.imprimirCliente();
			
			model2.setRowCount(0);
			
			for(Cliente c: cliente){
				
				Object[] fila=new Object[3];
				
				fila[0]=c.getNombre();
				fila[1]=c.getId();
				fila[2]=c.getTipoId();
				
				
				
				model2.addRow(fila);
			}
			tablaCliente.revalidate();
			tablaCliente.repaint();
		}
}
