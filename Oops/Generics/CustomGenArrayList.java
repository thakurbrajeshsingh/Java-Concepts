package Oops.Generics;

import java.util.Arrays;


//Object is created at Run Time and bytes checking takes place at compile time.
// So we cannot create Object of type T .
// As during checking it do not have idea about T object.

public class CustomGenArrayList<T> {

//    public class CustomGenArrayList<T extends  Number> {      extends Number will restrict to Object of type Number
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomGenArrayList() {

        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private  void resize() {
        Object[] temp = new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]= data[i];
        }
        data=temp;
    }
    private boolean isFull() {
        return data.length==size;
    }


    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public int size(){
        return size;
    }

    public T get(int index){

        return (T)data[index];
    }
    public void set(int index,T value){
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
      CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }

        System.out.println(list);
    }
}
