/*
//
// Java 109 : Networking with Java, by David Reilly
//
// TCP_Finger_Client
//
// TCP finger client connects to the host
// and requests information on a single user
//
// Params : TCP_Finger_Client username@host.com
//
*/

import java.io.*;
import java.net.*;


public class TCP_Finger_Client 
{
	public static void main ( String args[] )
	{
		// Check command line paramaters
		if (args.length != 1)
		{
			System.err.println ("Invalid number of paramaters");
			System.exit(1);
		}
		else
		// Check for existence of @ in paramater
		if (args[0].indexOf("@") == -1)
		{
			System.err.println ("Invalid paramater : syntax user@host");
			System.exit(1);
		}

		// Split command line paramater at the @ character
		String username = args[0].substring(0, args[0].indexOf("@") );
		String hostname = args[0].substring(args[0].indexOf("@") +1, args[0].length());

		try
		{
			System.out.println ("Connecting to " + hostname);

			// Create a connection to server
			Socket s = new Socket(hostname, 80);

			// Create input and output streams to socket
			PrintStream out = new PrintStream( s.getOutputStream()) ;
			DataInputStream in = new DataInputStream(s.getInputStream());

			// Write username to socket output
			out.println( username );

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
			
		}
		catch (SocketException e )
		{
			System.err.println ("Socket error : " + e);
		}
		catch (UnknownHostException e )
		{
			System.err.println ("Invalid host!");
		}
		catch (IOException e )
		{
			System.err.println ("I/O error : " + e);
		}
	}

}

