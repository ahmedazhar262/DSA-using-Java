import java.util.*;

public class CheckPrimeorNot {

    public static boolean isPrime(int num){
        boolean isPrime = true;

        for(int i=2; i<=num-2; i++){
            if(num%i==0){
                isPrime= false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         
        System.out.println("Enter Number to check Prime: ");
        int n= sc.nextInt();

        System.out.println(isPrime(n));
    }
}
