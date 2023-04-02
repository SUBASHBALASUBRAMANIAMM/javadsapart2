package intro;

public class BinearySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 3;
        System.out.println(
                search(arr,target,0,arr.length-1)
        );

    }
    static int search(int[] arr,int tar,int s,int e){
        if(s>e){
            return -1;
        }
        int mid = (s+e)/2;
        if(arr[mid] == tar){
            return mid;
        }
        if(arr[mid] > tar){
           return search(arr,tar,s,mid-1);
        }
        return search(arr,tar,mid+1,e);

    }
}
