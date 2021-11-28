package oop;

import java.util.*;
public class tasks
{	//start of class Editor
    public static void main(String[] args)
    {			//start of main method

        Scanner input=new Scanner(System.in);

        NumEditor NE= new NumEditor();		//creating Object of NumEditor Class
        int option=1, choice, num=0, pos=0, delnum=0, replacenum=0;	//local variables

        while(option!=5)
        {

            //**** Main Menu ****//
            System.out.print("""
                    \t\t1. Insert Number in Array
                    \t\t2. Delete From Number Array.
                    \t\t3. Search by index
                    \t\t4. Traverse
                    \t\t5. Exit
                    \t\tEnter Option =\s""");
            option=input.nextInt();

            switch (option)        //This switch handles Main Menu Options --> main switch
            {
                case 1 -> {            //Case 1 if user wants to insert number
                    if (NE.getCounter() >= NE.getArraySize())    // checks if Array is full or not
                    {
                        System.out.print("\n  Array is Full");
                        continue;
                    }
                            System.out.print("\n\t\tEnter Number to Insert in Array = ");
                            num = input.nextInt();
                            NE.InsertNumber(num);
                            System.out.println("\n\t\tNumber Inserted Successfully");
                }        //break of case 1

                case 2 -> {    //if user wants to delete number from array
                    System.out.print("""

                            \t\t1. Delete a number from array
                            \t\t2. Delete a Range of Numbers from array
                            \t\t Enter choice =\s""");
                    choice = input.nextInt();
                    switch (choice)    //this swtich handles delete method choices
                    {
                        case 1 -> {        // if user wants to delete a number from index
                            System.out.print("\n\t\tEnter number position to be deleted = ");
                            delnum = input.nextInt();
                            if (delnum >= NE.getCounter()) {
                                System.out.print("\n\t\t Invalid Index Entered");
                                continue;
                            }
                            NE.DelNum(delnum);
                        }
                        case 2 -> {        // if user wants to delte a range of numbers
                            System.out.print("""

                                    \t\tEnter range of positions to be deleted
                                    From =\s""");
                            int start = input.nextInt();
                            System.out.print("\n\t\tTo = ");
                            int end = input.nextInt();
                            if (start < 0 || end >= NE.getArraySize())//if user inputs invalid index
                            {
                                System.out.println("Out of Bound ... Try Again ");
                                continue;
                            }
                            NE.DelNum(start, end);
                        }
                        default -> System.out.print("\n\t\t Invalid Option ");
                    }
                }        // break of case 2

                case 3 -> {
                    System.out.print("Enter the number you want to search:\t");
                    int value= input.nextInt();
                    NE.search(NE.NumArray,NE.getCounter(),value);

                }        //break of case 3

                case 4 ->        //displays array in ascending order
                        NE.DisplayAscending();
                default -> System.out.println("Invalid Choice");
            }        // end of switch --> main switch
        }		// end of while loop
    }		// end of main method


} //end of class Editor

class NumEditor
{
    //private members of class
    private final int ArraySize=25;
    protected int []NumArray= new int[ArraySize];
    private int counter;


    public void InsertNumber (int num)	//insert number at position automatically
    {
        int i=0;
        while(NumArray[i]<num&&i<counter)
        {
            i=i+1;
        }
        int j=counter;
        while(j>i)
        {
            NumArray[j]=NumArray[j-1];
            j--;
        }
        NumArray[j]=num;
        counter++;
    }
    public void DelNum(int position)	//delete a number from specific index
    {
        int i=position;

        while(i<counter-1)
        {
            NumArray[i]=NumArray[++i];
        }
        counter--;
        System.out.print("\n\t\tNumber Deleted From Array");

    }
    public void DelNum(int from, int to)
    {

        while (to<=counter)
        {
            NumArray[from]=NumArray[to];
            from++;
            to++;
        }
        counter=counter-(to-from);

    }


    public void DisplayAscending()		//Display Array in Ascending Order
    {
        System.out.print("\t\tElements in array are : ");
        for(int i=0;i<counter;i++)
        {
            System.out.printf("%d ",NumArray[i]);
        }

    }
    public void search(int[] Array, int counter, int value){
        for (int i = 0; i < counter; i++) {
            if(Array[i]==value){
                return;
            }
        }
    }
    public int getCounter()		//return Counter i.e number of entries
    {
        return counter;
    }
    public int getArraySize()	//return size of array
    {
        return ArraySize;
    }

}	//end of class NumEditor
