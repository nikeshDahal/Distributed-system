import java.net.MalformedURLException;
        import java.rmi.Naming;
        import java.rmi.NotBoundException;
        import java.rmi.RemoteException;

public class Client {

    public static void main(String[]args) throws NotBoundException,MalformedURLException,RemoteException
    {
        HelloService abc=(HelloService) Naming.lookup("rmi://localhost:5099/hello");
        String msg = abc.echo("hello server");
        int sum =abc.add(10,20);
        System.out.println("The output is  "+msg);
        System.out.println("The sum is"+ sum);




    }
}
