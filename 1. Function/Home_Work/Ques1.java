// Write a Java method to compute the average of three numbers..
package Home_Work;

import java.util.*;


public class Ques1 {

    public static void averageThree(int a, int b, int c){
        int average = (a+b+c)/3;

        System.out.println("Average of "+ a+","+ b+","+ c+ " is: "+ average);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        int a= sc.nextInt();

        System.out.println("Enter 1st Number: ");
        int b= sc.nextInt();

        System.out.println("Enter 1st Number: ");
        int c= sc.nextInt();

        averageThree(a, b, c);
        
    }
    
}
