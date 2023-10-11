/*
//
// Java 109 : Networking with Java, by David Reilly
//
// MyFirstInternetAddress
//
// Displays the IP & hostname of localhost
//
//
*/

import java.io.*;
import java.net.*;

public class MyFirstInternetAddress
{
        public static void main(String args[])
        {
             try
             {
                InetAddress localaddr = InetAddress.getLocalHost();
                System.out.println ("Local IP Address : " + localaddr );
                System.out.println ("Local hostname   : " + localaddr.getHostName());
             }
             catch (UnknownHostException e)
             {
                System.err.println ("Can't detect localhost : " + e);
             }
        }
}
