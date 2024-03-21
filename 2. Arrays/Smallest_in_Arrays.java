public class Smallest_in_Arrays {
    public static void largestinArrays(int arr[]){
        int largest= Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest>arr[i]){
                largest= arr[i];
            }
        }
        System.out.println("Largest value is: "+ largest);
    }
    public static void main(String[] args) {
        int arr[]= {9, 3, 5, 0, 1, 7, 4, 12};

        largestinArrays(arr);
    }
    
}
