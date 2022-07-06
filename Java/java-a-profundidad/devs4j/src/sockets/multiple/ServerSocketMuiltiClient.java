package sockets.multiple;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class WorkerSocket extends Thread {

	private Socket client;

	public WorkerSocket(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		try (DataInputStream dis = new DataInputStream(this.client.getInputStream());) {
			String message = null;
			do {
				message = dis.readUTF();
				System.out.printf("%s dice: %s", this.client.getInetAddress().getHostAddress(), message);
			} while (!"salir".equals(message));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

public class ServerSocketMuiltiClient {

	public static void main(String[] args) throws IOException {
		try (ServerSocket ss = new ServerSocket(8090);) {

			while (true) {
				System.out.println("Listening clients");

				Socket client = ss.accept();

				System.out.printf("Cliente conectado %s \n",client.getInetAddress().getHostName());

				new WorkerSocket(client).start();
			}
		}
	}

}
