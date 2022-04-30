import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class Tests {
    public Tests() {
    }

    @Test
    public void testFueling() {
        Vehicle myCar = new Cars(5);
        myCar.fueling();
        Assertions.assertEquals(10, myCar.getCurrentFuelLevel());
    }

    @Test
    public void testFuelAtMax() {
        Vehicle myCar = new Cars(7);
        GasStation station = new GasStation();

        station.fuelAtMax(myCar);

        Assertions.assertEquals(100, myCar.getCurrentFuelLevel());
    }

    /*
    @Test
    public void testCarWreck() {
        Vehicle myCar = new Cars(5);
        Vehicle wreckedCar = new AbstractWreckedDecorator(myCar) {
            @Override
            public Vehicle deduct() {
                return super.deduct();
            }
        };

        Assertions.assertEquals(0, myCar.getCurrentFuelLevel());
    }

     */

    @Test
    public void testRemovalNotif() {
        Vehicle Car1 = new Cars(5);
        Vehicle Car2 = new Cars(5);
        Vehicle Truck1 = new Trucks(5, 2);
        Vehicle Truck2 = new Trucks(5, 2);

        GasStation station = new GasStation();

        station.addVehicle(Car1);
        station.addVehicle(Car2);
        station.addVehicle(Truck1);
        station.addVehicle(Truck2);

        station.removeVehicle(Car1);
        station.removeVehicle(Car2);

        ArrayList<Vehicle>  testArray = new ArrayList<>();
        testArray.add(Truck1);
        testArray.add(Truck2);

        Assertions.assertEquals(testArray, station.getVehicles());

    }



}