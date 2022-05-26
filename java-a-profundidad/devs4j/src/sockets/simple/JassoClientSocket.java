package sockets.simple;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class JassoClientSocket {

	public static void main(String[] args) throws UnknownHostException, IOException {
		try (Socket socket = new Socket("localhost", 8090);) {
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF("Soy un cliente del socket");
			dos.writeUTF("salir");
		}

	}

}
