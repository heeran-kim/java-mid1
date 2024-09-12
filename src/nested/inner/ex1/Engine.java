package nested.inner.ex1;

// only used in a Car
public class Engine {

    private Car car;

    public Engine(Car car) {
        this.car = car;
    }

    public void start() {
        System.out.println("Check Charge Level: " + car.getChargeLevel());
        System.out.println(car.getModel() + "'s engine is turned on");
    }
}
