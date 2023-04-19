package Oops.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private  void resize() {
        int[] temp = new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    private boolean isFull() {
        return data.length==size;
    }


    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int size(){
        return size;
    }

    public int get(int index){
        return data[index];
    }
    public void set(int index,int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
      CustomArrayList arr= new CustomArrayList();
      arr.add(1);
      arr.add(2);
      arr.add(3);
        System.out.println(arr.size());

        System.out.println(arr);

    }
}
