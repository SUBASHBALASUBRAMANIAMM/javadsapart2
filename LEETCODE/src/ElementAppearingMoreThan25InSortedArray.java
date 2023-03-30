public class ElementAppearingMoreThan25InSortedArray {
    //https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/description/
    public static void main(String[] args) {
        int arr[] = {15,15,21,21,32,32,33,33,33,34,35};
        int count=1;
        int val =0;
        int max =0;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }else if(count >max){
                max = count;
                count =1;
                val = arr[i];
            }

        }

        if(count > max) System.out.println(arr[arr.length-1]);
        else System.out.println(val);
    }

    }

