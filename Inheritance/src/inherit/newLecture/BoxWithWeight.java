package inherit.newLecture;

public class BoxWithWeight extends Box{
    double weight;

    public BoxWithWeight(double wight) {
        this.weight = wight;
    }

    public BoxWithWeight(double length, double height, double width, double weight,double size) {
        super(length, height, width,size);
        System.out.println(super.weight);
        System.out.println(super.areaCal());
        this.weight = weight;
        System.out.println("Box Weight");
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
