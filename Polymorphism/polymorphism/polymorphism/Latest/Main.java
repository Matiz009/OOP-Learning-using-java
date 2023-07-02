package polymorphism.Latest;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.calArea();
        Shape shape1=new Shape(23);
        System.out.println(shape1.num1);
    }
}
