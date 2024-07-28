//class name must be same as file name 

class LinearSearch_BinarySearch{
    public static void main(String args[]){

      int arr[]={10,20,30,40,50};
      int target=30;

      int result1 = linearSearch(arr, target);
      
      if(result1!=-1){
      System.out.println("Element found at index:" +result1+ " through linear search");
      }else{
      System.out.println("Element not found");
      } 

      int result2 = binarySearch(arr, target);

      if(result2!=-1){
        System.out.println("Element found at index:" +result2+ " through binary search");
        }else{
        System.out.println("Element not found");
        } 

    }

//passing parameter arr and target because array and target are placed inside main method
// cannot be accessible outside the method 

// if we write array and target outside the main method then there is no need to pass parameter in linear search func.

public static int linearSearch(int arr[],int target){
    
    // time complexity: O(n)

    int steps=0;
    for (int i=0; i<arr.length; i++){
        steps++;
        if (arr[i]==target){
            System.out.println("steps taken through linear searcch:"+steps);
            return i;
        }
    }

    System.out.println("steps taken through linear search:"+steps);
    return -1;

}

public static int binarySearch(int arr[],int target){
    
    //time complexity: O(logn n)
    
    int begin=0;
    int end=arr.length -1;
    int steps=0;
    
    while (begin<=end){
        steps++;

        int mid=(begin+end)/2;

            if (arr[mid]==target){
                System.out.println("steps taken through binary search:"+steps);
                return mid;
            }
            else if(arr[mid]<target){
                begin= mid +1;
            }
            else{
                end= mid-1;
            }
        }

    
    // can't write string under system.out.println coz we have made int func. 
    //which must be returned with any of the integer
    System.out.println("steps taken through binary search:"+steps);
    return -1;

}
}