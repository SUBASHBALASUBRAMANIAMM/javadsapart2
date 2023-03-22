package Generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private  static int DEFAULT =10;

    private int size =0;

    public CustomGenArrayList(){
        data = new Object[DEFAULT];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public T get(int num){
        return (T)(data[num]);
    }
    public T remove(){
        T removed = (T)data[--size];
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
        return "CustomGenArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    private void resize(){
        Object[] temp = new Object[2*DEFAULT];
        for(int i =0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;

    }

    public static void main(String[] args) {
//        CustomArraylist arr = new CustomArraylist();
//        arr.add(5);
//        arr.add(6);
//        System.out.println(arr.remove());
//        System.out.println(arr.get(1));
//        System.out.println(arr);

        CustomGenArrayList<Integer> arr2 = new CustomGenArrayList<>();
        arr2.add(2);
        System.out.println(arr2);





    }
}

