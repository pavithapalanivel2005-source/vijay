import java.rmi.*;

class Client {
    public static void main(String[] args) throws Exception {
        MyRemoteInterface r = (MyRemoteInterface)
            Naming.lookup("rmi://localhost/MyRemoteObject");

        System.out.println(r.sendMessage("Hello from Client"));
    }
}