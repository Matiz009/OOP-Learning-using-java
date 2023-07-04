package newLecture;

public class Main {
    public static void main(String[] args) {
        NiceCar car=new NiceCar();
        powerEngine pEngine=new powerEngine();
        car.start();
        car.changeEngine(pEngine);
        car.start();
    }
}
