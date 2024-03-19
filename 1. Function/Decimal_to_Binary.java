import java.util.*;

public class Decimal_to_Binary {

    public static void decimaltoBinary(int num){
        int realDecimalValue= num;

        int pow = 0;
        int binaryNum = 0;

        while(num>0){

            int rem= num%2;
            num = num/2;

            binaryNum= binaryNum + (rem*(int)Math.pow(10, pow));
            pow++;
            
        }
        System.out.println("Binary of Number "+ realDecimalValue+ " is: "+ binaryNum);

    }




    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter DECIMAL Number: ");
        int num= sc.nextInt();

        decimaltoBinary(num);

    }
    
}
