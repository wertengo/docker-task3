package Client;

import java.net.Socket;
import java.io.OutputStream;
import java.io.DataOutputStream;

public class Client
{
    public static void main(String args[]) throws Exception
    {
        Socket sock = new Socket("192.168.1.146", 5000);
        String message1 = "Accept Best Wishes, Serverji";
        OutputStream ostream = sock.getOutputStream();
        DataOutputStream dos = new DataOutputStream(ostream);
        dos.writeBytes(message1);
        dos.close();
        ostream.close();
        sock.close();
    }
}