/**
 * this class made by Deddy Kakunsi
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Reader {
    public static String reader() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in), 1);
        String string = " ";
        
        try {
            string = bfr.readLine();
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
        return string;
    }

    public static byte readByte() {
        return Byte.parseByte(reader());
    }

    public static short readShort() {
        return Short.parseShort(reader());
    }

    public static int readInt() {
        return Integer.parseInt(reader());
    }

    public static long readLong() {
        return Long.parseLong(reader());
    }
    
    public static float readFloat() {
        return Float.parseFloat(reader());
    }

    public static double readDouble() {
        return Double.parseDouble(reader());
    }
}
