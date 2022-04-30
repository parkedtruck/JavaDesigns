import java.util.ArrayList;

public class GasStation {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public final void addVehicle(Vehicle uVehicle){
        assert uVehicle != null;
        vehicles.add(uVehicle);
        notifyVehiclesAdded(uVehicle);
    }

    public final void removeVehicle(Vehicle uVehicle){

        vehicles.remove(uVehicle);
        notifyVehiclesRemoved(uVehicle);
    }

    private void notifyVehiclesAdded(Vehicle uVehicle){
        assert uVehicle != null;
        for (Vehicle vehic: vehicles){
            vehic.vehicleAdded();
        }
    }

    private void notifyVehiclesRemoved(Vehicle uVehicle){
        assert uVehicle != null;
        for (Vehicle vehic: vehicles){
            vehic.vehicleRemoved();
        }
    }

    private void notifyVehiclesFueled(Vehicle uVehicle){
        assert uVehicle != null;
        for (Vehicle vehic: vehicles){
            vehic.vehicleFueled();
        }
    }

    public final void fuelAtMax(Vehicle uVehicle){
        for (Vehicle vehic: vehicles){
            vehic.setCurrentFuelLevel(100);
        }
        notifyVehiclesFueled(uVehicle);
    }

    public final void fuelAllCars(Cars uCar) {
        for (Vehicle vehic : vehicles) {
            if (vehic.getClass().getName() == "Cars") {
                vehic.setCurrentFuelLevel(100);
                removeVehicle(vehic);
                //concurrent modification array error
                notifyVehiclesFueled(vehic);
                notifyVehiclesRemoved(vehic);
            }
        }
    }

    public final ArrayList<Vehicle> getVehicles(){
        ArrayList<Vehicle> copyArray = new ArrayList<>(vehicles);
        return copyArray;
    }
}
