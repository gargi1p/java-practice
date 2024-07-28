import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        
        int arr[] = {5,8,3,6,1};
        int steps =0;

         // Loop through the array starting from the second element
        for(int i=1; i<arr.length; i++){

            // Store the current element in key
            int key = arr[i];
            // Initialize j to the index of the previous element
            int j = i-1;
            steps++;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while(j>=0 && arr[j]>key){

                arr[j+1] = arr[j];
                j--;
            }
            // Place key at the correct position in the sorted subarray
              arr[j+1]=key;
              
        }

    //Time Complexity is O(n^2)    

    System.out.println(Arrays.toString(arr));
    System.out.println("Insertion sort done in " +steps + " steps");

    }
}
