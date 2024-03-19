import java.util.*;

public class Convert_Binary_to_Dedimal {

    
    public static void binaryDecimal(int n){

        int answer = n;
        int pow= 0;
        int decimal= 0;

        while(n>0){
            int lastDigit = n% 10;
            decimal = decimal + (lastDigit * (int)Math.pow(2, pow));
            pow++;

            n= n/10;
        }
        System.out.println("Binary of "+ answer + " is: "+ decimal);
    
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Binary Number to be Convert in DECIMAL Number: ");
        int num= sc.nextInt();

        binaryDecimal(num);
    }
}