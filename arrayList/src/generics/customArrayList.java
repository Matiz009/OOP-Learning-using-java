package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class customArrayList {
    private int[] data;
    private static int DEFUALT_SIZE =10;
    private int size=0; //working as index value

    public customArrayList(){
        this.data = new int[DEFUALT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        int[] temp = new int[data.length *2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data=temp;
    }
    public int remove(){
        int removed=data[--size];
        return removed;
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index]=value;
    }
    public int get(int index){
        return data[index];
    }

    @Override
    public String toString() {
        return "CustomArrayList{ data=" + Arrays.toString(data) + ", size=" + size +"}";
    }

    public static void main(String[] args) {
        customArrayList list =  new customArrayList();
        list.add(25);
        list.add(23);
        list.set(1,78);
        System.out.println(list.size);
        System.out.println(list);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i*2+1);
        }
        System.out.println("For Each Loop");
        arrayList.forEach((item)-> System.out.println(item*2));//lambda function
    }
}
