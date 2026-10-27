import java.net.*;
import java.io.*;

class MyClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 3333);

        DataInputStream in =
            new DataInputStream(s.getInputStream());

        DataOutputStream out =
            new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

        String str;
        while (!(str = br.readLine()).equals("stop")) {
            out.writeUTF(str);
            out.flush();
            System.out.println("Server: " + in.readUTF());
        }

        s.close();
    }
}