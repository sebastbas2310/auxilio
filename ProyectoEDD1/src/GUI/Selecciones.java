package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Selecciones extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Selecciones frame = new Selecciones();
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
	public Selecciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		JButton btnHabitad = new JButton("HABITAD");
		btnHabitad.setBounds(28, 110, 117, 29);
		btnHabitad .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				AdminHabitad habitad= new AdminHabitad();
				habitad.setVisible(true);
				dispose();
			}
			
		});
		getContentPane().add(btnHabitad);
		
		JButton btnAnimal = new JButton("ANIMAL");
		btnAnimal.setBounds(197, 110, 117, 29);
		btnAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				AdminAnimal animal= new AdminAnimal();
				animal.setVisible(true);
				dispose();
			}
			
		});
		getContentPane().add(btnAnimal);
		
		JButton btnUsuaisio = new JButton("USUARIO");
		btnUsuaisio.setBounds(375, 110, 117, 29);
		btnUsuaisio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				AdminUsuario usuario= new AdminUsuario();
				usuario.setVisible(true);
				dispose();
			}
			
		});
		getContentPane().add(btnUsuaisio);
		
		JButton btnTrabajador = new JButton("TRABAJDOR");
		btnTrabajador.setBounds(554, 110, 117, 29);
		btnTrabajador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				AdminTrabajador trabajador= new AdminTrabajador();
				trabajador.setVisible(true);
				dispose();
			}
			
		});
		getContentPane().add(btnTrabajador);
		
		JButton btnCerrarSesion = new JButton("cerrar sesion");
		btnCerrarSesion.setBounds(600, 6, 117, 29);
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				inicioGUI inicio= new inicioGUI();
				inicio.setVisible(true);
				dispose();
			}
			
		});
		getContentPane().add(btnCerrarSesion);
		
	}

}
