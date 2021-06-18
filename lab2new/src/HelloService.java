import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloService extends Remote {
    public String echo(String input) throws RemoteException;
    public int add(int a,int b) throws RemoteException;
}
