import java.net.*;
import java.io.*;

public class Client {
	public static void main(String args[]) {
		try {
			System.out.println("Connecting to 98.139.183.24");
			
			//Membuka koneksi dengan server
			Socket s = new Socket("98.139.183.24",80);

			// Create input and output streams to socket
			PrintStream out = new PrintStream( s.getOutputStream()) ;
			DataInputStream in = new DataInputStream(s.getInputStream());

			// Write username to socket output
			//out.println("Xave");

			// Read response from socket
			String line = in.readLine();

			while (line != null)
			{
				System.out.println ( line );

				// Read next line
                                line = in.readLine();
			}

			// Terminate connection
			s.close();

			//Selesai, menutup stream dan koneksi
			s.close();

		} catch (SocketException e){
			System.err.println ("Socket error : " + e);
		} catch (UnknownHostException e){
			System.err.println ("Invalid host!");
		} catch (IOException e){
			System.err.println ("I/O error : " + e);
		}
	}
}
