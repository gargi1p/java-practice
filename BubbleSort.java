// importing Arrays class to use Arrays.toString method for printing array elements

import java.util.Arrays;

public class BubbleSort {
    
public static void main(String[] args) {
    
 int arr[] = {5,6,8,4,3,2};
 int temp=0;
 int step=0;
 
System.out.println("Before sorting"); 
System.out.println(Arrays.toString(arr));

// Outer loop for the number of passes
 for(int i=0; i<arr.length-1; i++){
    step++;
  // Inner loop for comparing and swapping adjacent elements
    for(int j=0; j<arr.length-i-1; j++){

      if(arr[j]>arr[j+1]){
     
        // Swapping elements
     temp = arr[j];
     arr[j] = arr[j+1];
     arr[j+1] = temp;

      } 
    
    }

    System.out.println("sorted array - step " + step);   
    System.out.println(Arrays.toString(arr));

 } 

// Time Complexity is O(n^2) 

System.out.println("After sorting through bubble sort"); 
System.out.println(Arrays.toString(arr));


}

}
