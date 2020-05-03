package hwork;

public class HwExecute {
    public static void main(String[] args) {
        Prime prime_obj = new Prime();
        for(int i = 1; i <=100; i++){
            if(prime_obj.isPrime(i)){
                System.out.print(i);
            };
        }
    }
}
