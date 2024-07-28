// importing Arrays class to use Arrays.toString method for printing array elements


import java.util.Arrays;

public class SelectionSort {
  
    public static void main(String[] args) {
        
int arr[] = {2,9,3,4,7,1};
int temp=0;
int minIndex=0;
int step=0;

System.out.println("Before sorting"); 
System.out.println(Arrays.toString(arr));

 // Outer loop to iterate through the entire array
for(int i=0; i<arr.length-1; i++){

  step++;
  minIndex=i;  // Assume the current element is the minimum

   // Inner loop to find the actual minimum element in the remaining array
    for(int j=i+1; j<arr.length; j++){

      if(arr[minIndex]>arr[j]){
     
        minIndex=j;  // Update minIndex if a smaller element is found

      } 
      
    }

// Swap the found minimum element with the element at index i
    temp = arr[minIndex];
    arr[minIndex] = arr[i];
    arr[i] = temp;
  

    System.out.println("sorted array - step " +step);   
    System.out.println(Arrays.toString(arr));

 } 

//Time Complexity is O(n^2)

System.out.println("After sorting through selection sort"); 
System.out.println(Arrays.toString(arr));

}

}







   

