package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class inicioGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicioGUI frame = new inicioGUI();
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
	public inicioGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 958, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton inicar = new JButton("iniciar\r\n");
		inicar.setBounds(242, 184, 89, 23);
		inicar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
			
				
				if(e.getSource()==inicio){}
			
				String password = inicio.getText();
				System.out.println(password);
				if(password.equals("123")) {
					Selecciones admin= new Selecciones();
					admin.setVisible(true);
					dispose();
					
				}
				else if(password.equals("hola")){
					//compras comp= new compras();//codigo de accion al presionar el boton de inicio
					//comp.setVisible(true);
					dispose();
				}
			}	
		});
		contentPane.add(inicar);
		
		inicio = new JTextField();
		inicio.setBounds(428, 185, 86, 20);
		contentPane.add(inicio);
		inicio.setColumns(10);
		
		
		
		
	}
}
