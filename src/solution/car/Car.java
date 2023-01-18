package solution.car;

public class Car implements Vehicle {
    @Override
    public double getInteriorWidth() {
        return this.getCabinWidth();
    }

    private double getCabinWidth() {
        return 4;
    }
}
