public class BinarySearchRecursion {

    public static int binarySearchRecursion(int arr[], int target, int left, int right){

        if(right>=left){
            int mid= (left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
               return binarySearchRecursion(arr, target, left, mid-1);
            }
            else{
               return binarySearchRecursion(arr, target, mid+1, right);
            }
            
        }

        return -1;

    }
    public static void main(String[] args) {
        
    int arr[] = {10,20,30,40,50};
    int target=50;

    int result = binarySearchRecursion(arr, target, 0 ,arr.length -1);

    if(result!=-1){
        System.out.println("index:" +result);
    }
    else{
        System.out.println("Element not found");
    }
    }
}
