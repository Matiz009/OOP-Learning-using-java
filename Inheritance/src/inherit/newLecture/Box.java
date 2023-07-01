package inherit.newLecture;

public class Box {
    double length;
    double height;
    double width;
    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
       if(size>0) {
           this.size = size;
       }else{
           System.out.println("Size not valid");
           this.size=1;
       }
    }

    Box(){
        this.length=-1;
        this.width=-1;
        this.height=-1;
    }
    public Box(double length, double height, double width,double size) {
        this.length = length;
        this.height = height;
        this.width = width;
        setSize(size);
    }
    //cube
    Box(double side){
        this.length=side;
        this.height=side;
        this.width=side;
    }
    Box(Box old){
        this.length=old.length;
        this.height=old.height;
        this.width=old.width;
    }
    public void info(){
        System.out.println("Running the box");
    }
}