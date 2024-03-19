import java.util.*;

public class Find_BinomialCoeficient {

    public static int findFactorial(int num){
        int result= 1;
    
        for(int  i=1; i<=num; i++){
            result = result*i;
        }
        return result;
    }

    public static int binomialCoficient(int n, int r){

        if(r>n){
            return -1;
        }

        int nFactorial= findFactorial(n);
        int rFactorial= findFactorial(r);
        int nmrFactorial= findFactorial(n-r);

        int finalBinomialCoeficient= nFactorial/(rFactorial * nmrFactorial);

        return finalBinomialCoeficient;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter value of N: ");
        int n= sc.nextInt();

        System.out.println("Enter value of R: ");
        int r= sc.nextInt();

        int answer= binomialCoficient(n, r);

        System.out.println("Binomial Coeficient is: "+ answer);
    }
    
}
