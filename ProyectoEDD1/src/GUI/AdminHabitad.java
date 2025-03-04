package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import code.Cliente;
import code.Habitad;
import code.Zoologico;
import errores.exeption2;

import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

public class AdminHabitad extends JFrame {

	Zoologico zoo = new Zoologico();
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField codigoCrear;
	private JTextField sizeCrear;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable tablaHabitad;
	private DefaultTableModel model2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHabitad frame = new AdminHabitad();
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
	public AdminHabitad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1478, 861);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(133, 455, 294, 319);
		contentPane.add(layeredPane);
		
		JLabel lblNewLabel = new JLabel("tamaño m^2\r\n");
		lblNewLabel.setBounds(198, 48, 61, 36);
		layeredPane.add(lblNewLabel);
		
		JComboBox tipoHabitadCrear = new JComboBox();
		tipoHabitadCrear.setModel(new DefaultComboBoxModel(new String[] {"Selva tropical ", "", "Sabana", "", "Desierto ", "Bosque templado ", "", "Montaña ", "", "Pantano/Humedal ", "", "Océano/Marino ", "", "Río/Agua dulce ", "Tundra ártica ", "", "Pradera ", "", "Cueva/Subterráneo ", "", "Isla tropical "}));
		tipoHabitadCrear.setBounds(10, 95, 126, 22);
		layeredPane.add(tipoHabitadCrear);
		
		JLabel lblNewLabel_1 = new JLabel("Crear Trabajador");
		lblNewLabel_1.setBounds(91, 11, 121, 26);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("tipo Habitad\r\n");
		lblNewLabel_3.setBounds(198, 95, 82, 14);
		layeredPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_13 = new JLabel("codigo");
		lblNewLabel_13.setBounds(195, 144, 112, 14);
		layeredPane.add(lblNewLabel_13);
		
		codigoCrear = new JTextField();
		codigoCrear.setColumns(10);
		codigoCrear.setBounds(10, 141, 126, 20);
		layeredPane.add(codigoCrear);
		
		sizeCrear = new JTextField();
		sizeCrear.setColumns(10);
		sizeCrear.setBounds(10, 56, 126, 20);
		layeredPane.add(sizeCrear);
		
		
		
		JComboBox ubicacionCrear = new JComboBox();
		ubicacionCrear.setModel(new DefaultComboBoxModel(new String[] {"norte", "sur", "este", "oeste"}));
		ubicacionCrear.setBounds(10, 182, 126, 22);
		layeredPane.add(ubicacionCrear);
		
		JLabel lblNewLabel_2 = new JLabel("ubicacion\r\n");
		lblNewLabel_2.setBounds(195, 186, 46, 14);
		layeredPane.add(lblNewLabel_2);
		
		JLayeredPane nombreAct = new JLayeredPane();
		nombreAct.setBounds(458, 455, 294, 319);
		contentPane.add(nombreAct);
		
		JLabel lblNewLabel_5 = new JLabel("actualizar Trabajador");
		lblNewLabel_5.setBounds(85, 11, 125, 14);
		nombreAct.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 36, 86, 20);
		nombreAct.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 99, 86, 20);
		nombreAct.add(textField_4);
		
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
		tipoIDAct.setBounds(10, 130, 86, 22);
		nombreAct.add(tipoIDAct);
		
		JComboBox rolAct = new JComboBox();
		rolAct.setBounds(10, 163, 86, 22);
		nombreAct.add(rolAct);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 67, 86, 20);
		nombreAct.add(textField_5);
		
		JLabel lblNewLabel_14 = new JLabel("new id\r\n");
		lblNewLabel_14.setBounds(150, 70, 46, 14);
		nombreAct.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("horas trabajadas\r\n");
		lblNewLabel_15.setBounds(151, 199, 114, 14);
		nombreAct.add(lblNewLabel_15);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(10, 196, 86, 20);
		nombreAct.add(textField_6);
		
		JLabel lblNewLabel_16 = new JLabel("new tipo Id");
		lblNewLabel_16.setBounds(150, 230, 77, 14);
		nombreAct.add(lblNewLabel_16);
		
		JComboBox newTipoIDAct = new JComboBox();
		newTipoIDAct.setBounds(10, 230, 89, 22);
		nombreAct.add(newTipoIDAct);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(195, 285, 89, 23);
		nombreAct.add(btnActualizar);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(786, 455, 294, 319);
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
		tipoIDelete.setBounds(10, 102, 86, 22);
		layeredPane_2.add(tipoIDelete);
		
		JLabel lblNewLabel_12 = new JLabel("tipo ID\r\n");
		lblNewLabel_12.setBounds(195, 106, 46, 14);
		layeredPane_2.add(lblNewLabel_12);
		
		JButton btnEliminarTrabajador = new JButton("Eliminar ");
		btnEliminarTrabajador.setBounds(195, 166, 89, 23);
		layeredPane_2.add(btnEliminarTrabajador);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(133, 455, 294, 319);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(458, 455, 294, 319);
		contentPane.add(separator_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(123, 11, 1095, 415);
		contentPane.add(scrollPane);
		
		tablaHabitad = new JTable();
		model2 = new DefaultTableModel();
		tablaHabitad.setModel(model2);
		
		model2.addColumn("ubicacion");
		model2.addColumn("size");
		model2.addColumn("tipo Habitad");
		model2.addColumn("Animal");
		model2.addColumn("codigo");
	
		
		scrollPane.setViewportView(tablaHabitad);
		
		scrollPane.setViewportView(tablaHabitad);
		tablaHabitad.setModel(model2);
		
		
		JButton botonCrear = new JButton("crear");
		botonCrear.setBounds(195, 285, 89, 23);
		botonCrear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				String size= sizeCrear.getText();
				String codigo = codigoCrear.getText();
				String tipoHabitad = tipoHabitadCrear.getSelectedItem().toString();
				String ubicacion = ubicacionCrear.getSelectedItem().toString();
				if (size.trim().isEmpty() || codigo.trim().isEmpty()){
					exeption2 exeption = new exeption2();
					exeption.setVisible(true);
				}
				else {
					zoo.addHabitad(ubicacion, size, tipoHabitad, null, codigo) ;
					/*try {
						ficheros.escribirEmpleados(empleado);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}*/
					llenarTablaHabitad();
					popupExito Exito = new popupExito();
					Exito.setVisible(true);	
					}
				
					

				
				tablaHabitad.revalidate();
				tablaHabitad.repaint();
			}
		
				
				
	});
		layeredPane.add(botonCrear);
		
		
	}

//metodos



	public void llenarTablaHabitad(){
		
		Habitad[] habitad = zoo.imprimirHabitad();
		
		model2.setRowCount(0);
		
		for(Habitad h: habitad){
			
			Object[] fila=new Object[4];
			
			fila[0]=h.getCodigo();
			fila[1]=h.getTipoHabtad();
			fila[2]=h.getTamano();
			fila[3]=h.getAnimal();
			
			model2.addRow(fila);
		}
		tablaHabitad.revalidate();
		tablaHabitad.repaint();
	}
}
