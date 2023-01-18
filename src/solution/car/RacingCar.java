package solution.car;

public class RacingCar implements Vehicle {

    @Override
    public double getInteriorWidth() {
        return this.getCockPitWidth();
    }

    private double getCockPitWidth() {
        return 1;
    }
}
