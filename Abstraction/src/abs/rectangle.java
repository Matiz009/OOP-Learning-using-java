package abs;

public class rectangle extends shape{
    private double width;

    public rectangle(double length, double width) {
        super(length);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calculateArea(double length) {
       double area= length*getWidth();
        System.out.println("Area of rectangle : "+area);
    }
}
