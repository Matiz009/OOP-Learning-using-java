public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        Student mati = new Student(400, "Mati ul Rehman","SP20-BSE-042");
        Student ali = new Student(500, "Ali Ahmad","SP20-BSE-069");
        Student ahmad = new Student(600, "Ahmad","SP20-BSE-070");
        System.out.println(mati.name+": "+mati.marks);
        System.out.println(ali.name+": "+ali.marks);
        System.out.println(ahmad.name+": "+ahmad.marks);
        mati.marks=450;
        System.out.println(mati.name+": "+mati.marks);

    }
}