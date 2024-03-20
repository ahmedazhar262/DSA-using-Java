// Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test your method.

package Home_Work;
import java.util.Scanner;

public class Ques2 {
    public static boolean isEven(int num){
       boolean isEven;

       if(num%2==0){
        isEven= true;
       }
       else{
        isEven= false;
       }
       return isEven;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter NUMBER to Check Even or not: ");
        int num= sc.nextInt();

        System.out.println(isEven(num));
        
    }
    
}

