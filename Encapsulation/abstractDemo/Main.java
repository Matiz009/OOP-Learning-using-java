package abstractDemo;

public class Main {
    public static void main(String[] args) {
        MatricStudent matricStudent=new MatricStudent();
        matricStudent.calculateGrade(17,"Ali",910);
        InterStudent interStudent = new InterStudent();
        interStudent.calculateGrade(19,"Ahmad",1080);
        UniversityStudents universityStudents=new UniversityStudents();
        universityStudents.calculateGrade(21,"Raza",67);
    }

}
