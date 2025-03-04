package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import code.Trabajador;
import code.Zoologico;
import errores.EExistente;
import errores.ENull;
import errores.exeption2;
import ficheros.CrearFicheros;

import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class AdminTrabajador extends JFrame {

	Zoologico zoo = new Zoologico();
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField IDCrear;
	private JTextField horasCrear;
	private JTextField nombreCrear;
	private JTextField IDAct;
	private JTextField nombreActualizar;
	private JTextField newID;
	private JTextField horasAct;
	private JTextField textField_7;
	private JTable tablaTrabajadores;
	private DefaultTableModel model2;
	CrearFicheros ficheros = new CrearFicheros();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminTrabajador frame = new AdminTrabajador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminTrabajador() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1267, 912);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(39, 455, 294, 319);
		contentPane.add(layeredPane);
		
		
		
		IDCrear = new JTextField();
		IDCrear.setColumns(10);
		IDCrear.setBounds(10, 94, 126, 20);
		layeredPane.add(IDCrear);
		
		JLabel lblNewLabel = new JLabel("nombre");
		lblNewLabel.setBounds(198, 48, 36, 36);
		layeredPane.add(lblNewLabel);
		
		JComboBox tipoIDCrear = new JComboBox();
		tipoIDCrear.setModel(new DefaultComboBoxModel(new String[] {"CC", "TI", "CE", "Pasaporte"}));
		tipoIDCrear.setBounds(10, 148, 126, 22);
		layeredPane.add(tipoIDCrear);
		
		JComboBox rolCrear = new JComboBox();
		rolCrear.setModel(new DefaultComboBoxModel(new String[] {"Veterinario", "Conserje", "Guia"}));
		rolCrear.setBounds(10, 203, 126, 22);
		layeredPane.add(rolCrear);
		
		JLabel lblNewLabel_1 = new JLabel("Crear Trabajador");
		lblNewLabel_1.setBounds(91, 11, 121, 26);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setBounds(195, 97, 46, 14);
		layeredPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo ID");
		lblNewLabel_3.setBounds(188, 152, 46, 14);
		layeredPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rol");
		lblNewLabel_4.setBounds(195, 207, 46, 14);
		layeredPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_13 = new JLabel("Horas Trabajadas");
		lblNewLabel_13.setBounds(172, 260, 112, 14);
		layeredPane.add(lblNewLabel_13);
		
		horasCrear = new JTextField();
		horasCrear.setColumns(10);
		horasCrear.setBounds(10, 257, 126, 20);
		layeredPane.add(horasCrear);
		
		nombreCrear = new JTextField();
		nombreCrear.setColumns(10);
		nombreCrear.setBounds(10, 56, 126, 20);
		layeredPane.add(nombreCrear);
		
		JLayeredPane nombreAct = new JLayeredPane();
		nombreAct.setBounds(364, 455, 294, 319);
		contentPane.add(nombreAct);
		
		JLabel lblNewLabel_5 = new JLabel("actualizar Trabajador");
		lblNewLabel_5.setBounds(85, 11, 125, 14);
		nombreAct.add(lblNewLabel_5);
		
		IDAct = new JTextField();
		IDAct.setColumns(10);
		IDAct.setBounds(10, 36, 86, 20);
		nombreAct.add(IDAct);
		
		nombreActualizar = new JTextField();
		nombreActualizar.setColumns(10);
		nombreActualizar.setBounds(10, 99, 86, 20);
		nombreAct.add(nombreActualizar);
		

		
		JLabel lblNewLabel_8 = new JLabel("id");
		lblNewLabel_8.setBounds(151, 36, 46, 14);
		nombreAct.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Nombre");
		lblNewLabel_9.setBounds(151, 102, 46, 14);
		nombreAct.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Tipo ID");
		lblNewLabel_10.setBounds(151, 134, 46, 14);
		nombreAct.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Rol");
		lblNewLabel_11.setBounds(151, 167, 46, 14);
		nombreAct.add(lblNewLabel_11);
		
		JComboBox tipoIDAct = new JComboBox();
		tipoIDAct.setModel(new DefaultComboBoxModel(new String[] {"CC", "TI", "CE", "Pasaporte"}));
		tipoIDAct.setBounds(10, 130, 86, 22);
		nombreAct.add(tipoIDAct);
		
		JComboBox rolAct = new JComboBox();
		rolAct.setModel(new DefaultComboBoxModel(new String[] {"Veterinario", "Conserje", "Guia"}));
		rolAct.setBounds(10, 163, 86, 22);
		nombreAct.add(rolAct);
		
		newID = new JTextField();
		newID.setColumns(10);
		newID.setBounds(10, 67, 86, 20);
		nombreAct.add(newID);
		
		JLabel lblNewLabel_14 = new JLabel("new id\r\n");
		lblNewLabel_14.setBounds(150, 70, 46, 14);
		nombreAct.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("horas trabajadas\r\n");
		lblNewLabel_15.setBounds(151, 199, 114, 14);
		nombreAct.add(lblNewLabel_15);
		
		horasAct = new JTextField();
		horasAct.setColumns(10);
		horasAct.setBounds(10, 196, 86, 20);
		nombreAct.add(horasAct);
		
		JLabel lblNewLabel_16 = new JLabel("new tipo Id");
		lblNewLabel_16.setBounds(150, 230, 77, 14);
		nombreAct.add(lblNewLabel_16);
		
		JComboBox newTipoIDAct = new JComboBox();
		newTipoIDAct.setModel(new DefaultComboBoxModel(new String[] {"CC", "TI", "CE", "Pasaporte"}));
		newTipoIDAct.setBounds(10, 230, 89, 22);
		nombreAct.add(newTipoIDAct);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(692, 455, 294, 319);
		contentPane.add(layeredPane_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 0, 294, 319);
		layeredPane_2.add(separator_2);
		
		JLabel lblNewLabel_6 = new JLabel("Eliminar Trabajador");
		lblNewLabel_6.setBounds(69, 11, 132, 14); 
		layeredPane_2.add(lblNewLabel_6);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(195, 285, 89, 23);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					Selecciones seleccion= new Selecciones();//codigo de accion al presionar el boton de inicio
					seleccion.setVisible(true);
					dispose();
				
				}
				});
		layeredPane_2.add(btnAtras);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(10, 57, 86, 20);
		layeredPane_2.add(textField_7);
		
		JLabel lblNewLabel_7 = new JLabel("Id");
		lblNewLabel_7.setBounds(195, 60, 46, 14);
		layeredPane_2.add(lblNewLabel_7);
		
		JComboBox tipoIDelete = new JComboBox();
		tipoIDelete.setModel(new DefaultComboBoxModel(new String[] {"CC", "TI", "CE", "Pasaporte"}));
		tipoIDelete.setBounds(10, 102, 86, 22);
		layeredPane_2.add(tipoIDelete);
		
		JLabel lblNewLabel_12 = new JLabel("tipo ID\r\n");
		lblNewLabel_12.setBounds(195, 106, 46, 14);
		layeredPane_2.add(lblNewLabel_12);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(39, 455, 294, 319);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(364, 455, 294, 319);
		contentPane.add(separator_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 11, 1095, 415);
		contentPane.add(scrollPane);
		
		tablaTrabajadores = new JTable();
		model2 = new DefaultTableModel();
		tablaTrabajadores.setModel(model2);
		
		model2.addColumn("nombre");
		model2.addColumn("ID");
		model2.addColumn("TipoID");
		model2.addColumn("Salario");	
		model2.addColumn("HorasTrabajadas");
		model2.addColumn("Rol");
		
		scrollPane.setViewportView(tablaTrabajadores);
		
		scrollPane.setViewportView(tablaTrabajadores);
		tablaTrabajadores.setModel(model2);
		
		JButton botonCrear = new JButton("crear");
		botonCrear.setBounds(195, 285, 89, 23);
		botonCrear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				String nombres= nombreCrear.getText();
				String documento = IDCrear.getText();
				String tipoDoc = tipoIDCrear.getSelectedItem().toString();
				String rol = rolCrear.getSelectedItem().toString();
				int HMesCrear = Integer.parseInt(horasCrear.getText());
				Trabajador[] trabajador = zoo.imprimirTrabajador();
				if (nombres.trim().isEmpty() || documento.trim().isEmpty() || HMesCrear==0){
					exeption2 exeption = new exeption2();
					exeption.setVisible(true);
				}
				else if(zoo.buscarTrabajador(documento,tipoDoc) != null)
				{
					EExistente exeption = new EExistente();
					exeption.setVisible(true);
				}
				else {
					if(rol.equals("Veterinario")) {
						zoo.addVeterinario(nombres, documento, tipoDoc, rol, HMesCrear,2) ;
					try {
						ficheros.escribirTrabajador(trabajador);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					llenarTablaEmpleado();
					popupExito Exito = new popupExito();
					Exito.setVisible(true);	
					}
					else if(rol.equals("Conserje")) {
						zoo.addConserje(nombres, documento, tipoDoc, rol, HMesCrear,2);
						try {
							ficheros.escribirTrabajador(trabajador);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						llenarTablaEmpleado();
						popupExito Exito = new popupExito();
						Exito.setVisible(true);	
					
						}	
					else if(rol.equals("Guia")) {
						zoo.addGuia(nombres, documento, tipoDoc, rol, HMesCrear,2);
						try {
							ficheros.escribirTrabajador(trabajador);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						llenarTablaEmpleado();
						popupExito Exito = new popupExito();
						Exito.setVisible(true);	
						}
				
					

				}
				tablaTrabajadores.revalidate();
				tablaTrabajadores.repaint();
			}
		
				
				
	});
		layeredPane.add(botonCrear);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(195, 285, 89, 23);
		btnActualizar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Zoologico zoo = new Zoologico();
				Trabajador t;
				int HMesCrear;
				String nombres= nombreActualizar.getText();
				String documento = IDAct.getText();
				String newDocumento = newID.getText();
				String tipoDoc = tipoIDAct.getSelectedItem().toString();
				String rol = rolAct.getSelectedItem().toString();
				String NewTipoDoc;
				if (horasAct == null || horasAct.getText().trim().isEmpty()) {
					t = zoo.buscarTrabajador(documento,tipoDoc);
					HMesCrear=t.getHorasTrabajadas();
					}
				else
					HMesCrear = Integer.parseInt(horasAct.getText());
				
				if (documento.trim().isEmpty()){
					exeption2 exeption = new exeption2();
					exeption.setVisible(true);
				}
				
				if (newTipoIDAct.getSelectedItem().toString().equalsIgnoreCase(tipoDoc))
					NewTipoDoc = newTipoIDAct.getSelectedItem().toString();
				else
					NewTipoDoc = tipoDoc;

					try {
						zoo.actualizarTrabajador(documento,nombres,rol,tipoDoc,newDocumento, HMesCrear);
					} catch (ENull e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					llenarTablaEmpleado();
					popupExito Exito = new popupExito();
					Exito.setVisible(true);		

				
				tablaTrabajadores.revalidate();
				tablaTrabajadores.repaint();
			}
			
				
	});
		nombreAct.add(btnActualizar);
		
		JButton btnEliminarTrabajador = new JButton("Eliminar ");
		btnEliminarTrabajador.setBounds(195, 166, 89, 23);;
		btnEliminarTrabajador.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				String documento = IDCrear.getText();
				String tipoDoc = tipoIDelete.getSelectedItem().toString();
				if(documento.trim().isEmpty()){
				 	exeption2 exeption = new exeption2();
					exeption.setVisible(true);
				}
				else {
					zoo.eliminarTrabajador(documento, tipoDoc);
					/*try {
						ficheros.escribirEmpleados(empleado);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}*/
					llenarTablaEmpleado();
					popupExito Exito = new popupExito();
					Exito.setVisible(true);	

				}
				
				tablaTrabajadores.revalidate();
				tablaTrabajadores.repaint();
			}
		
				
				
	});
		layeredPane_2.add(btnEliminarTrabajador);
		
		
	}
	
	//metodos
	
	
	
			public void llenarTablaEmpleado(){
				
				Trabajador[] trabajador = zoo.imprimirTrabajador();
				
				model2.setRowCount(0);
				
				for(Trabajador t: trabajador){
					
					Object[] fila=new Object[6];
					
					fila[0]=t.getNombre();
					fila[1]=t.getID();
					fila[2]=t.getTipoID();
					fila[3]=t.getGanancias();
					fila[4]=t.getHorasTrabajadas();
					fila[5]=t.getRol();
					
					
					model2.addRow(fila);
				}
				tablaTrabajadores.revalidate();
				tablaTrabajadores.repaint();
			}
	
}
