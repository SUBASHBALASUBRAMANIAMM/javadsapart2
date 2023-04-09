
public class pracice1 {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int pivot = findPivot(arr);
        if(pivot==-1){
            System.out.println(binarySearch(arr,target,0,arr.length-1));
        }
        if(arr[pivot]==target){
            System.out.println(pivot);
        }
        if(target < arr[pivot]){
            System.out.println(binarySearch(arr,target,pivot,arr.length-1));
        }
        if(target>arr[pivot]){
            System.out.println(binarySearch(arr,target,0,pivot));
        }
        System.out.println(pivot);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        int mid = (start+end)/2;
        while(start<end){
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
     static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;
        while(start<=end){
            if(mid < end&&arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid > start &&arr[mid] < arr[mid-1]){
                return mid-1;
            }
            else if(arr[start] >= arr[mid]){
                end = mid-1;
            }
            else if(arr[start]<=arr[mid]){
                start = mid+1;
            }
        }
        return -1;
    }
}
