package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import code.Cliente;
import code.Trabajador;
import code.Zoologico;
import errores.ENull;
import errores.exeption2;

import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;

public class AdminUsuario extends JFrame {

	Zoologico zoo = new Zoologico();
	
	private static final long serialVersionUID = 1L;
	private DefaultTableModel model2;
	private JPanel contentPane;
	private JTextField IDCrear;
	private JTextField nombreCrear;
	private JTextField IDAct;
	private JTextField nombreActualizar;
	private JTextField newID;
	private JTextField textField_7;
	private JTable tablaUsuarios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminUsuario frame = new AdminUsuario();
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
	public AdminUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1389, 865);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(85, 455, 294, 319);
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
		
		JLabel lblNewLabel_1 = new JLabel("Crear Trabajador");
		lblNewLabel_1.setBounds(91, 11, 121, 26);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setBounds(195, 97, 46, 14);
		layeredPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo ID");
		lblNewLabel_3.setBounds(188, 152, 46, 14);
		layeredPane.add(lblNewLabel_3);
		
		nombreCrear = new JTextField();
		nombreCrear.setColumns(10);
		nombreCrear.setBounds(10, 56, 126, 20);
		layeredPane.add(nombreCrear);
		
		JLayeredPane nombreAct = new JLayeredPane();
		nombreAct.setBounds(410, 455, 294, 319);
		contentPane.add(nombreAct);
		
		JLabel lblNewLabel_5 = new JLabel("actualizar Usuario");
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
		
		JComboBox tipoIDAct = new JComboBox();
		tipoIDAct.setModel(new DefaultComboBoxModel(new String[] {"CC", "TI", "CE", "Pasaporte"}));
		tipoIDAct.setBounds(10, 130, 86, 22);
		nombreAct.add(tipoIDAct);
		
		newID = new JTextField();
		newID.setColumns(10);
		newID.setBounds(10, 67, 86, 20);
		nombreAct.add(newID);
		
		JLabel lblNewLabel_14 = new JLabel("new id\r\n");
		lblNewLabel_14.setBounds(150, 70, 46, 14);
		nombreAct.add(lblNewLabel_14);
		
		JLabel lblNewLabel_16 = new JLabel("new tipo Id");
		lblNewLabel_16.setBounds(151, 177, 77, 14);
		nombreAct.add(lblNewLabel_16);
		
		JComboBox newTipoIDAct = new JComboBox();
		newTipoIDAct.setModel(new DefaultComboBoxModel(new String[] {"CC", "TI", "CE", "Pasaporte"}));
		newTipoIDAct.setBounds(7, 173, 89, 22);
		nombreAct.add(newTipoIDAct);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(738, 455, 294, 319);
		contentPane.add(layeredPane_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 0, 294, 319);
		layeredPane_2.add(separator_2);
		
		JLabel lblNewLabel_6 = new JLabel("Eliminar Usuario");
		lblNewLabel_6.setBounds(69, 11, 132, 14);
		layeredPane_2.add(lblNewLabel_6);
		
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
		separator.setBounds(85, 455, 294, 319);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(410, 455, 294, 319);
		contentPane.add(separator_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(75, 11, 1095, 415);
		contentPane.add(scrollPane);
		
		tablaUsuarios = new JTable();
		model2 = new DefaultTableModel();
		tablaUsuarios.setModel(model2);
		
		model2.addColumn("nombre");
		model2.addColumn("ID");
		model2.addColumn("TipoID");
		
		scrollPane.setViewportView(tablaUsuarios);
		
		
		JButton botonCrear = new JButton("crear");
		botonCrear.setBounds(195, 285, 89, 23);
		botonCrear.setBounds(195, 285, 89, 23);
		botonCrear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				String nombres= nombreCrear.getText();
				String documento = IDCrear.getText();
				String tipoDoc = tipoIDCrear.getSelectedItem().toString();
				if (nombres.trim().isEmpty() || documento.trim().isEmpty()){
					exeption2 exeption = new exeption2();
					exeption.setVisible(true);
				}
				else {
						zoo.addCliente(nombres, documento, tipoDoc);
					/*try {
						ficheros.escribirEmpleados(empleado);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}*/
					llenarTablaUsuario();
					popupExito Exito = new popupExito();
					Exito.setVisible(true);
				
				tablaUsuarios.revalidate();
				tablaUsuarios.repaint();
			}
		
			}	
				
	});
		layeredPane.add(botonCrear);
		
	
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(195, 285, 89, 23);
		btnActualizar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Zoologico zoo = new Zoologico();
				String nombres= nombreActualizar.getText();
				String documento = IDAct.getText();
				String newDocumento = newID.getText();
				String tipoDoc = tipoIDAct.getSelectedItem().toString();
				String NewTipoDoc= newTipoIDAct.getSelectedItem().toString();
				
				if(nombres.trim().isEmpty()){
					nombres=(zoo.buscarCliente(documento,tipoDoc).getNombre());
				}
				
				
				if(newDocumento.trim().isEmpty()) {
					try {
						zoo.actualizarCliente(documento,nombres,tipoDoc,newDocumento,documento);
					} catch (ENull e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					llenarTablaUsuario();
					popupExito Exito = new popupExito();
					Exito.setVisible(true);	
			}else {
				try {
					zoo.actualizarCliente(documento,nombres,tipoDoc,newDocumento,newDocumento);
				} catch (ENull e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				llenarTablaUsuario();
				popupExito Exito = new popupExito();
				Exito.setVisible(true);	
			}

				
				tablaUsuarios.revalidate();
				tablaUsuarios.repaint();
			}
			
				
	});
		nombreAct.add(btnActualizar);
		
		
		JButton btnEliminar = new JButton("eliminar\r\n");
		btnEliminar.setBounds(195, 285, 89, 23);
		btnEliminar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				String documento = IDCrear.getText();
				String tipoDoc = tipoIDelete.getSelectedItem().toString();

				if(documento.trim().isEmpty()) {
				  	exeption2 exeption = new exeption2();
					exeption.setVisible(true);
				}
				else {
					zoo.eliminarCliente(tipoDoc, documento);
					/*try {
						ficheros.escribirEmpleados(empleado);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}*/
					llenarTablaUsuario();
					popupExito Exito = new popupExito();
					Exito.setVisible(true);	
				}
				
				tablaUsuarios.revalidate();
				tablaUsuarios.repaint();
		
			
			}
		});
		layeredPane_2.add(btnEliminar);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(1104, 768, 89, 23);
		btnAtras.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
					Selecciones sec = new Selecciones();
					sec.setVisible(true);
					dispose();
					
				
			}
		});
			
		contentPane.add(btnAtras);
		
}
	
	//metodos
	
	
	
	public void llenarTablaUsuario(){
		
		Cliente[] usuarios = zoo.imprimirCliente();
		
		model2.setRowCount(0);
		
		for(Cliente u: usuarios){
			
			Object[] fila=new Object[3];
			
			fila[0]=u.getNombre();
			fila[1]=u.getId();
			fila[2]=u.getTipoId();
			
			model2.addRow(fila);
		}
		tablaUsuarios.revalidate();
		tablaUsuarios.repaint();
	}

}
