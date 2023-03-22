package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist{
    private int[] data;
    private  static int DEFAULT =10;

    private int size =0;

    public CustomArraylist(){
        this.data = new int[DEFAULT];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public int get(int num){
        return data[num];
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int size(){
        return this.size;
    }

    private boolean isFull() {
        return data.length ==size;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    private void resize(){
        int temp[] = new int[2*DEFAULT];
        for(int i =0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;

    }

    public static void main(String[] args) {
        CustomArraylist arr = new CustomArraylist();
        arr.add(5);
        arr.add(6);
        System.out.println(arr.remove());
        System.out.println(arr.get(1));
        System.out.println(arr);





    }
}
