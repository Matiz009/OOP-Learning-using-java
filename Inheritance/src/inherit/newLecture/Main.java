package inherit.newLecture;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(5);
        Box box1=new Box(box);
        BoxWithWeight box2 = new BoxWithWeight(1,2,3,4,-5);//It is the type of object which determines which members can be accessed
        System.out.println(box1.height+" "+ " "+box1.width+" "+ box1.length);
        System.out.println(box.height+" "+ " "+box.width+" "+ box.length);
        System.out.println(box2.height+" "+ " "+box2.width+" "+ box2.length+" "+ box2.getSize()+" "+box2.weight);
    }
}
