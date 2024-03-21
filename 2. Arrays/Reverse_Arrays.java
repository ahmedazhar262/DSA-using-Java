public class Reverse_Arrays {
    public static void reverseArrays(int arr[]){
        int start=0;
        int end= arr.length-1;
        
        while (start<end) {
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 63, 1, 12,5, 62, 122, 4, 7, 9, 16, 25}; 

        reverseArrays(arr);
        for(int i=0; i<arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
}
