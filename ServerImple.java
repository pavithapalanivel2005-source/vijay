import java.rmi.*;
import java.rmi.server.*;

class ServerImple extends UnicastRemoteObject
        implements MyRemoteInterface {

    ServerImple() throws RemoteException {}

    public String sendMessage(String msg) throws RemoteException {
        return "Received: " + msg;
    }
}