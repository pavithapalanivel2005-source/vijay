import java.rmi.*;
import java.rmi.registry.*;

class Server {
    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);

        Naming.rebind("MyRemoteObject", new ServerImple());

        System.out.println("Server running");
    }
}