import java.net.*;
import java.io.*;

class MyServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();

        DataInputStream in =
            new DataInputStream(s.getInputStream());

        DataOutputStream out =
            new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

        String str;
        while (!(str = in.readUTF()).equals("stop")) {
            System.out.println("Client: " + str);
            out.writeUTF(br.readLine());
            out.flush();
        }

        s.close();
        ss.close();
    }
}