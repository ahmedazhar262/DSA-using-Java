import java.util.Scanner;

public class Binary_Search {

    public static int binarySearch(int arr[], int key){
        int start= 0;
        int end= arr.length-1;

        while(start<=end){
            int mid= (start+end)/2;

            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start= mid+1;
            }
            else if(arr[mid]>key){
                end= mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr []= {5, 3, 7, 23, 6, 8, 4, 0, 1, 2, 3, 4, 5 ,6, 8, 8, };

        System.out.println("Enter no to be Search in an Arrays: ");
        int key= sc.nextInt();

        int result= binarySearch(arr, key);

        if(result==-1){
            System.out.println("NUMBER is not present.");
        }
        else{
            System.out.println("NUMBER is present at index: "+ result);
        }
     
    }
}
