// Write a Java method to compute the sum of the digits in an integer.
// (Hint : Approach this question in the following way :
// a. Take a variable sum = 0
// b. Find the last digit of the number
// c. Add it to the sum
// d. Repeat a & b until the number becomes 0 )


package Home_Work;

import java.util.Scanner;

public class Ques5 {

    public static void sumOfDigits(int num){
        int original_d= num;
        int sumOfDigit= 0;

        while (original_d!=0) {

            int remainder= original_d%10;
            sumOfDigit= sumOfDigit+ remainder;
            original_d= original_d/10;
        }
        System.out.println("Sum of digits of "+ num+ " is: "+ sumOfDigit);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter NUMBER: ");
        int num= sc.nextInt();

        sumOfDigits(num);
    }
    
}
