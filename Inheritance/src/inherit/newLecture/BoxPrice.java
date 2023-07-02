package inherit.newLecture;

public class BoxPrice extends BoxWithWeight{
    double cost;

    public BoxPrice(double length, double height, double width, double weight, double size, double cost) {
        super(length, height, width, weight, size);
        this.cost = cost;
        System.out.println("Box Price");
    }
}
