package inherit.newLecture;

public class BoxWithWeight extends Box{
    double weight;

    public BoxWithWeight(double wight) {
        this.weight = wight;
    }

    public BoxWithWeight(double length, double height, double width, double weight,double size) {
        super(length, height, width,size);
        this.weight = weight;
    }

    public BoxWithWeight(double side, double wight) {
        super(side);
        this.weight = wight;
    }

    public BoxWithWeight(Box old, double wight) {
        super(old);
        this.weight = wight;
    }
}
