package springboot;

public class Car {
    private Engine engine;
 
    // Constructor-based DI
    public Car(Engine engine) {
        this.engine = engine;
    }
 
    public void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}
 