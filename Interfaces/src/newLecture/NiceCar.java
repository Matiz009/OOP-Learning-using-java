package newLecture;

public class NiceCar {
    private Engine engine;
    NiceCar(){
        engine=new electricEngine();
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void changeEngine(Engine engine){
        this.engine=engine;
    }
}
