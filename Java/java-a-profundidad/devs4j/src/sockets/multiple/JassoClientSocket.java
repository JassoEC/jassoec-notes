package sockets.multiple;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class JassoClientSocket {
	public static String readMessage() throws IOException {
		System.out.printf("\n->");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		try (Socket socket = new Socket("localhost", 8090);
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream())) {
			String message = null;
			do {
				message = readMessage();
				dos.writeUTF(message);
			} while (!"salir".equals(message));
		}
	}
}
