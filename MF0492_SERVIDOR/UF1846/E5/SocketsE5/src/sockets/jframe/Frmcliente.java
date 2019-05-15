package sockets.jframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frmcliente extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8773035353727665022L;
	JTextField txtmensaje;
	JButton btnenviar;

	public Frmcliente() {
		
		txtmensaje = new JTextField();
		txtmensaje.setBounds(10,10,200,20);
		add(txtmensaje);
		btnenviar = new JButton();
		btnenviar.setText("Enviar");
		btnenviar.setBounds(10,50,150,20);
		btnenviar.addActionListener(this);
		add(btnenviar);
		
		setLayout(null);
		setSize(400,400);
		setVisible(true);
		
		// TODO Auto-g-enerated constructor stub
	}

	public static void main(String[] args) {
		new Frmcliente();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnenviar) {
			try {
				Socket cli = new Socket("127.0.0.1",9090);
				DataOutputStream flujo = new DataOutputStream(cli.getOutputStream());
				flujo.writeUTF(txtmensaje.getText());
				cli.close();
			} catch (Exception ex) {
				System.out.println("Error en cliente" + ex.getMessage());
				
			}
		}
	}

}
