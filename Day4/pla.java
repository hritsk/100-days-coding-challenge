import java.util.*;
public class pla {
    public static void printPrimes(int n){
        if(n<=2) return;
        boolean prime[] = new boolean[n+1];
        Arrays.fill(prime,true);
        for( int i=2; i*i<n; i++){
            if(primes[i]){
                for (int j = i ; j*i<n; j++){
                    primes[j*i] = false;
                    
                }
            }
        }  
        System.out.println("prime numbers upto"+ n + " i ");   
        for( int i=2; i*i<n; i++){
            if(prime[i]){
                System.out.println(i + " ");
            }
        }     
    }
}
