
package euler3;

import java.math.BigInteger;
import java.util.ArrayList;

public class Euler3 {
    //slow run
    
    static ArrayList<BigInteger> primes = new ArrayList();
    
    public static void main(String[] args) {
        long num = 600851475143L;
        
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0 && isPrime(i)){
                System.out.println(i);
            }
        }    
    }
    
    public static boolean isPrime(int n){
        if (n < 2)      return false;
        if (n == 2)     return true;
        if (n % 2 == 0) return false;
        
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0) return false;
       
        return true;
    }
}
