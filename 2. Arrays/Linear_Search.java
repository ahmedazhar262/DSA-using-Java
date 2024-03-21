
import java.util.*;

public class Linear_Search {

   
    public static void linearSearch(int X, int arr[]){
       
        for(int i=0; i<arr.length; i++){
            if( arr[i]==X){
                System.out.println(" Number is found at indext: "+ i);
                break;
            }
           
        }
    }
    public static void main(String [] args ){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Size of an Arrays: ");
        int size= sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the value in Arrays: ");

        for(int i=0; i<size; i++){
           
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter No to be SEARCH: ");
        int X= sc.nextInt();

        linearSearch(X,arr);

        
    
    }
    
}
