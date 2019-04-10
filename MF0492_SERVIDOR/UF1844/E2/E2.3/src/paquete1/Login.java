package paquete1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class Login extends JFrame {

	protected static final JLabel txtresultado = null;
	private JPanel contentPane;
	private JTextField txtañoact;
	private JTextField txtañonac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("A\u00F1o actual");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 39, 137, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A\u00F1o de nacimiento");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 67, 126, 14);
		contentPane.add(lblNewLabel_1);
		
		txtañoact = new JTextField();
		txtañoact.setBounds(133, 36, 86, 20);
		contentPane.add(txtañoact);
		txtañoact.setColumns(10);
		
		txtañonac = new JTextField();
		txtañonac.setBounds(133, 64, 86, 20);
		contentPane.add(txtañonac);
		txtañonac.setColumns(10);
		JTextArea txtresultado = new JTextArea();
		txtresultado.setBounds(33, 121, 347, 99);
		contentPane.add(txtresultado);
		JButton btnprocesar = new JButton("Procesar");
		btnprocesar.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnprocesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int AñoActual =Integer.parseInt(txtañoact.getText());
				int AñoNacimiento = Integer.parseInt(txtañonac.getText());
				int edad;
				
				edad = AñoActual -AñoNacimiento;
				txtresultado.setText("Tu edad es de:"+ edad + "años");
			}
		});
		btnprocesar.setBounds(252, 58, 89, 23);
		contentPane.add(btnprocesar);
		
		
	}
}
