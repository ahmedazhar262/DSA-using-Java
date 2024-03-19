import java.util.*;

public class Prime_inRange {

     public static boolean isPrime(int num){
        boolean isPrime = true;

        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                isPrime= false;
                break;
            }
        }
        return isPrime;
    }

    public static void primeInrange(int n){

        for(int i=2; i<=n; i++){
           if(isPrime(i)){
            System.out.println(i+ " ");
           }
        }
        System.out.println(" ");

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         
        System.out.println("Enter Number to check Prime: ");
        int n= sc.nextInt();

        primeInrange(n);
    }
    
}
