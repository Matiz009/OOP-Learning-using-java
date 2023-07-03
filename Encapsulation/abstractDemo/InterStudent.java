package abstractDemo;

public class InterStudent extends Student{
    public InterStudent() {
    }

    @Override
    void calculateGrade(int age, String name,int marks) {
        double percentage=((double) marks /1200)*100;
        if(percentage<=100 && percentage >=80){
            System.out.println("Student Name: " +name +" Age: "+age + "and got A");
        }else if(percentage<80 && percentage >=70){
            System.out.println("Student Name: " +name +" Age: "+age + "and got B");
        }else if(percentage<70 && percentage >=60){
            System.out.println("Student Name: " +name +" Age: "+age + "and got C");
        }else if(percentage<60 && percentage >=33){
            System.out.println("Student Name: " +name +" Age: "+age + "and got D");
        }else if(percentage<33 && percentage >=0){
            System.out.println("Student Name: " +name +" Age: "+age + "and got F");
        }else{
            System.out.println("Invalid");
        }


    }

    @Override
    void calculateMarks(int age, String name,int marks) {
        int percentage=(marks/1200)*100;
        System.out.println("Student Name: " +name +" Age: "+age + "and got "+percentage +"% marks.");

    }
}
