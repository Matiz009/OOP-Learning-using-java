package accessModifiers;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"Mati");
        System.out.println(obj.getNum());
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
    }


}
