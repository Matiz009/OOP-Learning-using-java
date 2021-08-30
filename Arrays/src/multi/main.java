package multi;

import Sample.Student;

public class main{
    public static void main(String[] args) {
        int[][] alpha ={{12,45,67},{12,45,34,67,65},{11,22,33,45}};//array declaration and initializing
        for (int[] ints : alpha) {//enhanced for loop for ith elements
            for (int anInt : ints) {//enhanced for loop for jth elements
                System.out.print(anInt+" ");
            }
            System.out.println("");
        }

    }
}