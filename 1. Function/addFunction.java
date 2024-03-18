import java.util.*;

public class addFunction{

    public static int sumTwo( int a, int b){
        int sum= a +b;
                
        System.out.println(sum);
        return sum;
    }

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("ENTER First Number:");
        int a= sc.nextInt();

        System.out.println("ENTER Second Number:");
        int b= sc.nextInt();

        sumTwo(a, b);


        
    }

}