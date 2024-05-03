package lab5;
import java.util.*;

class sp{
    int amount;
    int rate;
    int time;

    sp(int amount,int rate,int time){
        this.amount=amount;
        this.rate=rate;
        this.time=time;
    }

    double calc(){
        double ans=(amount*rate*time)/100;
        return ans;
    }
}

public class simpleinterest {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        sp set = new sp(p,r,t);

        double ans=set.calc();

        System.out.println(set);
    }
}
