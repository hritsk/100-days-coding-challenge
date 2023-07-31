//Sum of n natural numbers....
import java.util.*;
public class Recursion4 {
    public static int calcSum (int n) {
        if(n == 1){
            return 1;
        }
        int snm1 = calcSum(n-1);
        int sn = calcSum(n-1);
        return sn;
    }
    public static void main(String args[]) {
        int n =9;
        System.out.println(calcSum(n));
    }
}
