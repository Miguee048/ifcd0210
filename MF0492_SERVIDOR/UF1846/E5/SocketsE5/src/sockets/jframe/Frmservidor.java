package sockets.jframe;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Frmservidor extends JFrame implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2088389838598255121L;
	/**
	 * 
	 */
	
	JTextArea txtmensajes;
	public Frmservidor() {
		txtmensajes = new JTextArea();
		txtmensajes.setBounds(10,10,500,500);
		add(txtmensajes);
		setLayout(null);
		setSize(600,600);
		setVisible(true);
		Thread hilo = new Thread(this);
		hilo.start();
	}

	public static void main(String[] args) {
		new Frmservidor();
	}

	@Override
	public void run() {
		try {
			ServerSocket servidor = new ServerSocket(9090);
			Socket cli;
				while (true) {
					cli = servidor.accept();
					DataInputStream flujo = new DataInputStream(cli.getInputStream());
					String msg = flujo.readUTF();
					txtmensajes.append("\n" + msg);
					cli.close();
					if(msg.equalsIgnoreCase("FIN")) {
						servidor.close();
						break;
					}
					}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
