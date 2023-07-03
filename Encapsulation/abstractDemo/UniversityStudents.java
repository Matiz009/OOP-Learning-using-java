package abstractDemo;

public class UniversityStudents extends Student{

    public UniversityStudents() {
    }

    @Override
    void calculateGrade(int age, String name,int marks) {
        double percentage=((double) marks /100)*100;
        if(percentage<100 && percentage >=90){
            System.out.println("Student Name: " +name +" Age: "+age + "and got A");
        }else if(percentage<90 && percentage >=85){
            System.out.println("Student Name: " +name +" Age: "+age + "and got A-");
        }else if(percentage<85 && percentage >=80){
            System.out.println("Student Name: " +name +" Age: "+age + "and got B+");
        }else if(percentage<80 && percentage >=75){
            System.out.println("Student Name: " +name +" Age: "+age + "and got B");
        }else if(percentage<75 && percentage >=70){
            System.out.println("Student Name: " +name +" Age: "+age + "and got B-");
        }else if(percentage<70 && percentage >=65){
            System.out.println("Student Name: " +name +" Age: "+age + "and got C+");
        }else if(percentage<65 && percentage >=60){
            System.out.println("Student Name: " +name +" Age: "+age + "and got C");
        }else if(percentage<60 && percentage >=55){
            System.out.println("Student Name: " +name +" Age: "+age + "and got C-");
        }else if(percentage<55 && percentage >=50){
            System.out.println("Student Name: " +name +" Age: "+age + "and got D");
        }else if(percentage<50 && percentage >=0){
            System.out.println("Student Name: " +name +" Age: "+age + "and got F");
        }
        else{
            System.out.println("Invalid");
        }


    }

    @Override
    void calculateMarks(int age, String name,int marks) {
        int percentage=(marks/100)*100;
        System.out.println("Student Name: " +name +" Age: "+age + "and got "+percentage +"% marks.");

    }
}
