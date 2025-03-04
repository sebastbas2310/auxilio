	package GUI;
	
	import java.awt.EventQueue;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.table.DefaultTableModel;
	
	import code.Animal;
	import code.Zoologico;
	import errores.exeption2;
	
	import javax.swing.JScrollPane;
	import javax.swing.JSeparator;
	import javax.swing.JLayeredPane;
	import javax.swing.JButton;
	import javax.swing.JTextField;
	import javax.swing.JLabel;
	import javax.swing.JComboBox;
	import javax.swing.JTable;
	import javax.swing.DefaultComboBoxModel;
	
	public class AdminAnimal extends JFrame {
	
		Zoologico zoo = new Zoologico();
		
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private DefaultTableModel model2;
		private JTextField IDCrear;
		private JTextField cantAlimentoCrear;
		private JTextField nombreCrear;
		private JTextField tipoAnimalCrear;
		private JTextField edadCrear;
		private JTextField textField_5;
		private JTextField textField_6;
		private JTextField textField_7;
		private JTable tablaAnimales;
	
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						AdminAnimal frame = new AdminAnimal();
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
		public AdminAnimal() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1199, 861);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 24, 1163, 406);
			contentPane.add(scrollPane);
			
			tablaAnimales = new JTable();
			
			model2 = new DefaultTableModel();
			tablaAnimales.setModel(model2);
			
			model2.addColumn("nombre");
			model2.addColumn("ID");
			model2.addColumn("edad");
			model2.addColumn("Tipo Animal");
			model2.addColumn("Tipo Alimento");
			model2.addColumn("Cantidad alimento");
			model2.addColumn("Habitad");
			model2.addColumn("estado");
			
			scrollPane.setViewportView(tablaAnimales);
			
			scrollPane.setViewportView(tablaAnimales);
			tablaAnimales.setModel(model2);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(10, 454, 294, 2);
			contentPane.add(separator);
			
			JLayeredPane layeredPane = new JLayeredPane();
			layeredPane.setBounds(10, 467, 294, 319);
			contentPane.add(layeredPane);
			
			IDCrear = new JTextField();
			IDCrear.setColumns(10);
			IDCrear.setBounds(10, 53, 126, 20);
			layeredPane.add(IDCrear);
			
			JLabel lblNewLabel = new JLabel("nombre");
			lblNewLabel.setBounds(195, 19, 36, 36);
			layeredPane.add(lblNewLabel);
			
			JComboBox habitadCrear = new JComboBox();
			habitadCrear.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
			habitadCrear.setBounds(10, 84, 126, 22);
			layeredPane.add(habitadCrear);
			
			JComboBox tipoAlimentoCrear = new JComboBox();
			tipoAlimentoCrear.setModel(new DefaultComboBoxModel(new String[] {"Carnivoro", "Herbivoro", "Insectiboro", "Omniboro", "Alimentacion esp"}));
			tipoAlimentoCrear.setBounds(10, 117, 126, 22);
			layeredPane.add(tipoAlimentoCrear);
			JLabel lblNewLabel_2 = new JLabel("ID");
			lblNewLabel_2.setBounds(195, 56, 46, 14);
			layeredPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Habitad\r\n");
			lblNewLabel_3.setBounds(195, 88, 46, 14);
			layeredPane.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("tipo alimento");
			lblNewLabel_4.setBounds(195, 121, 77, 14);
			layeredPane.add(lblNewLabel_4);
			
			JLabel lblNewLabel_13 = new JLabel("cant alimento(kg)");
			lblNewLabel_13.setBounds(195, 153, 112, 14);
			layeredPane.add(lblNewLabel_13);
			
			cantAlimentoCrear = new JTextField();
			cantAlimentoCrear.setColumns(10);
			cantAlimentoCrear.setBounds(10, 150, 126, 20);
			layeredPane.add(cantAlimentoCrear);
			
			nombreCrear = new JTextField();
			nombreCrear.setColumns(10);
			nombreCrear.setBounds(10, 27, 126, 20);
			layeredPane.add(nombreCrear);
			
			tipoAnimalCrear = new JTextField();
			tipoAnimalCrear.setColumns(10);
			tipoAnimalCrear.setBounds(10, 176, 126, 20);
			layeredPane.add(tipoAnimalCrear);
			
			JComboBox estadoCrear = new JComboBox();
			estadoCrear.setModel(new DefaultComboBoxModel(new String[] {"exposicion ", "fuera de expo", "fallecido"}));
			estadoCrear.setBounds(10, 207, 126, 22);
			layeredPane.add(estadoCrear);
			
			JLabel lblNewLabel_14 = new JLabel("estado\r\n");
			lblNewLabel_14.setBounds(195, 211, 46, 14);
			layeredPane.add(lblNewLabel_14);
			
			edadCrear = new JTextField();
			edadCrear.setColumns(10);
			edadCrear.setBounds(10, 240, 126, 20);
			layeredPane.add(edadCrear);
			
			JLabel lblNewLabel_15 = new JLabel("tipo Animal");
			lblNewLabel_15.setBounds(197, 178, 87, 14);
			layeredPane.add(lblNewLabel_15);
			
			JLabel lblNewLabel_16 = new JLabel("edad\r\n");
			lblNewLabel_16.setBounds(195, 243, 46, 14);
			layeredPane.add(lblNewLabel_16);
			
			JLayeredPane layeredPane_1 = new JLayeredPane();
			layeredPane_1.setBounds(371, 467, 294, 319);
			contentPane.add(layeredPane_1);
			
			JLabel lblNewLabel_5 = new JLabel("actualizar Trabajador");
			lblNewLabel_5.setBounds(85, 11, 125, 14);
			layeredPane_1.add(lblNewLabel_5);
			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(10, 59, 86, 20);
			layeredPane_1.add(textField_5);
			
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(10, 116, 86, 20);
			layeredPane_1.add(textField_6);
			
			JButton btnActualizar = new JButton("Actualizar");
			btnActualizar.setBounds(195, 285, 89, 23);
			layeredPane_1.add(btnActualizar);
			
			JLabel lblNewLabel_8 = new JLabel("id");
			lblNewLabel_8.setBounds(151, 62, 46, 14);
			layeredPane_1.add(lblNewLabel_8);
			
			JLabel lblNewLabel_9 = new JLabel("Nombre");
			lblNewLabel_9.setBounds(151, 119, 46, 14);
			layeredPane_1.add(lblNewLabel_9);
			
			JLabel lblNewLabel_10 = new JLabel("Tipo ID");
			lblNewLabel_10.setBounds(150, 180, 46, 14);
			layeredPane_1.add(lblNewLabel_10);
			
			JLabel lblNewLabel_11 = new JLabel("Rol");
			lblNewLabel_11.setBounds(151, 247, 46, 14);
			layeredPane_1.add(lblNewLabel_11);
			
			JComboBox comboBox_2 = new JComboBox();
			comboBox_2.setBounds(10, 176, 86, 22);
			layeredPane_1.add(comboBox_2);
			
			JComboBox comboBox_3 = new JComboBox();
			comboBox_3.setBounds(10, 243, 86, 22);
			layeredPane_1.add(comboBox_3);
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setBounds(371, 454, 294, 2);
			contentPane.add(separator_1);
			
			JLayeredPane layeredPane_2 = new JLayeredPane();
			layeredPane_2.setBounds(715, 467, 294, 319);
			contentPane.add(layeredPane_2);
			
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
			
			JButton btnEliminarTrabajador = new JButton("Eliminar ");
			btnEliminarTrabajador.setBounds(195, 166, 89, 23);
			layeredPane_2.add(btnEliminarTrabajador);
			
			JLabel lblNewLabel_7 = new JLabel("Id");
			lblNewLabel_7.setBounds(195, 60, 46, 14);
			layeredPane_2.add(lblNewLabel_7);
			
			JComboBox comboBox_4 = new JComboBox();
			comboBox_4.setBounds(10, 102, 86, 22);
			layeredPane_2.add(comboBox_4);
			
			JLabel lblNewLabel_12 = new JLabel("Rol");
			lblNewLabel_12.setBounds(195, 106, 46, 14);
			layeredPane_2.add(lblNewLabel_12);
			
			JSeparator separator_1_1 = new JSeparator();
			separator_1_1.setBounds(715, 454, 294, 2);
			contentPane.add(separator_1_1);
		
			JButton botonCrear = new JButton("crear");
			botonCrear.setBounds(195, 285, 89, 23);
			botonCrear.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
				
					String nombres= nombreCrear.getText();
					String id = IDCrear.getText();
					String tipoAlimento = tipoAlimentoCrear.getSelectedItem().toString();
					int cantAlimento = Integer.parseInt(cantAlimentoCrear.getText());
					String tipoAnimal = tipoAnimalCrear.getText();
					int edad = Integer.parseInt(edadCrear.getText());
					String estado= estadoCrear.getSelectedItem().toString();
					
					if (nombres.equals("") || id.equals("")){
						exeption2 exeption = new exeption2();
						exeption.setVisible(true);
					}
					else {
						zoo.addAnimal(nombres, id, tipoAlimento, cantAlimento, null, tipoAnimal, edad, estado);
						llenarTablaAnimal();
						popupExito Exito = new popupExito();
						Exito.setVisible(true);
					}
					tablaAnimales.revalidate();
					tablaAnimales.repaint();
				}
			
					
					
		});
			layeredPane.add(botonCrear);
			
		}
		//metodos
		
		
		
			public void llenarTablaAnimal(){
				
				Animal[] animal= zoo.imprimirAnimal();
				
				model2.setRowCount(0);
				
				for(Animal a: animal){
					
					Object[] fila=new Object[8];
					
					fila[0]=a.getNombre();
					fila[1]=a.getID();
					fila[2]=a.getEdad();
					fila[3]=a.getTipoAnimal();
					fila[4]=a.getTipoAlimento();
					fila[5]=a.getCantidadAlimento();
					fila[6]=a.getHabitad();
					fila[7]=a.getEstado();
					
					
					model2.addRow(fila);
				}
				tablaAnimales.revalidate();
				tablaAnimales.repaint();
			}
	}
