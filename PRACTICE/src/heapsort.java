//public class heapsort {
//
//    static void max_heapify(int arr[],int parent_ind,int scope){
//        int left_ind = parent_ind*2+1;
//        int right_ind= left_ind+1;
//        if(arr[left_ind]>arr[parent_ind]&&arr[left_ind]>arr[right_ind]){
//            int temp = arr[left_ind];
//            arr[left_ind] = arr[parent_ind];
//            arr[parent_ind]=temp;
//        }
//        if(arr[right_ind]>arr[parent_ind]&&arr[right_ind]>arr[left_ind]){
//            int temp = arr[right_ind];
//            arr[right_ind] = arr[parent_ind];
//            arr[parent_ind]=temp;
//        }
//
//    }
//    public static void main(String[] args) {
//         int[] arr =
//        [5,15,10,25,55,35,75,45,95,50,70,40.60.90,3];
//         int no_ele = arr.length;
//         int scope = no_ele-1;
//         int parent_ind = (scope-1)/2;
//         max_heapify(arr,parent_ind,scope);
//    }
//}
