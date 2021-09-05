package abs;

public abstract class shape {
    private double length;

    public shape(double length) {
        setLength(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public abstract void calculateArea(double length);
}
