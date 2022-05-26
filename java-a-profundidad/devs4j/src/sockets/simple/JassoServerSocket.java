package sockets.simple;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class JassoServerSocket {

	public static void main(String[] args) throws IOException {
		ServerSocket socket = new ServerSocket(8090);
		System.out.println("Listening requests");
		Socket client = socket.accept();
		System.out.println("Connected client");
		System.out.println(client.getInetAddress().getHostName());
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String message = null;

		do {
			message = dis.readUTF();
			System.out.printf("%s Dice: %s \n", client.getInetAddress().getHostName(), message);
		} while (!"salir".equals(message));
		System.out.println("closed connection");
		socket.close();
		client.close();
		dis.close();
	}

}
