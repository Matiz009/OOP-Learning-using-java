package cloning;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Human mati = new Human(12,"Mati");
        //Human ali = new Human(mati);
        System.out.println(mati.age);
        //System.out.println(ali.name);
        Human twin = (Human) mati.clone();
        System.out.println(twin.name+" "+ twin.age);
        twin.arr[1]=23;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(mati.arr));
    }
}
