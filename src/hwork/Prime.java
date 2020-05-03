package hwork;

public class Prime {
    // найти простое ли число 2, 3, 5, 7
    boolean isPrime(int number) {
        if(number <= 2) return true;
       for(int i = 2; i <= number /2; i ++) {
           if(number%i == 0){
               return false;
           }
        }
        return true;
    }
}
