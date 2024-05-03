package lab5;
import java.util.*;

class Manager{
    int DepID;
    int EmpID;

    void cash(int days){
        System.out.println("cash out: " +days*800);
    }
}
class Workers extends Manager{

    void cash(int days){
        System.out.println("cash out: " +days*500);
    }
}
class Others extends Manager{

    void cash(int days){
        System.out.println("cash out: " +days*600);
    }
}

public class ass3 {
    public static void main(String[] args) {
        System.out.println("1 for manager, 2 for worker and 3 for others: ");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        
        System.out.println("enter number of days: ");
        int days = sc.nextInt();


        switch (op) {
            case 1:
                Manager m = new Manager();
                m.cash(days);
                break;
            case 2:
                Workers w = new Workers();
                w.cash(days);
                break;
            case 3:
                Others o = new Others();
                o.cash(days);
                break;
        
            default:
                System.out.println("WRONG INPUT");
                break;
        }
        sc.close();
    }
    
}
