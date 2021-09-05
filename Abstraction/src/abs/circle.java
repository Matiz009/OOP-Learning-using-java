package abs;

public class circle extends shape{

    public circle(double length) {
        super(length);
    }

    @Override
    public void calculateArea(double length) {
        double radius= length/2;
        double area = Math.PI*radius;
        System.out.println("Area of circle : "+area);
    }
}
