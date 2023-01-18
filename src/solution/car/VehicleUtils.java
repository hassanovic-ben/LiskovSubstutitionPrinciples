package solution.car;

import java.util.ArrayList;
import java.util.List;

public class VehicleUtils {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Car();
        Vehicle vehicle3 = new RacingCar();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        vehicles.add(vehicle3);

        for (Vehicle v : vehicles) {
            System.out.println(v.getInteriorWidth());
        }
    }



}
