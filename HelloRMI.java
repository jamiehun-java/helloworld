//https://ifuwanna.tistory.com/244
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloRMI {
    public static void main(String[] args) {
//        if (System.getSecurityManager() == null){
//            System.setSecurityManager(new SecurityException());
//        } ; deprecated since version 17
        try {
            Registry registry = LocateRegistry.getRegistry("testRMI");
            System.out.println("Hello RMI!");
        } catch (Exception e) {
            System.err.println("RMI exception");
            e.printStackTrace();
        }
    }
}
