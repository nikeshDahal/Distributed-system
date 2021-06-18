
import java.rmi.RemoteException;
        import java.rmi.registry.LocateRegistry;
        import java.rmi.registry.Registry;

public class Server {
    public static void main(String[]args) throws RemoteException{
        Registry reg = LocateRegistry.createRegistry(5099);
        HelloServant helloservent = new HelloServant();
        reg.rebind("hello",helloservent);
        System.out.println("Server Running");
    }
}