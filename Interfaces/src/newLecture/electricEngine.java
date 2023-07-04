package newLecture;

public class electricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine stops");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric  Engine accelerate");
    }
}
