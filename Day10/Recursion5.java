//Print Nth Fibonacci number.....
import java.util.*;
public class Recursion5 {
    public static int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int fnm1 =fib(n-1);
        int fnm2 =fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String args[]) {
        int n = 26;
        System.out.println(fib(n));
    }
}
