package nested.inner.ex1;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    // used only in Engine
    public int getChargeLevel() {
        return chargeLevel;
    }

    // used only in Engine
    public String getModel() {
        return model;
    }

    public void start() {
        engine.start();
        System.out.println(model + " has started");
    }
}
