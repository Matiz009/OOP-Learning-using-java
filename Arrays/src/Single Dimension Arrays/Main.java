package Sample;

public class Main {

    public static void main(String[] args) {//Student type array
        Student student= new Student(1,"Mati");//creation of object
        Student student1 = new Student(2,"John");
       Student[] std1 = {student,student1};
        for (Student value : std1) {//enhanced for loop
            System.out.println(value.getId());//printing id
            System.out.println(value.getName());//printing name
        }
	int[] alpha ={12,45,67,67};  //int type array
        for (int j : alpha) {
            System.out.println(j);
        }
    }
}
