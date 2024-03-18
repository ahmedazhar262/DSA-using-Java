import java.util.*;

public class Find_Factorial {
    public static int factoril(int n){
        int answer= 1;

        for(int i= 1; i<=n; i++){
            answer = answer*i;
        }
        return answer;
    }

    public static void  main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number to print FACTORIAL: ");
        int number= sc.nextInt();

        int finalAnswer = factoril(number);

        System.out.println("Factorial of "+ number + " Is "+ finalAnswer);



    }
    
}
