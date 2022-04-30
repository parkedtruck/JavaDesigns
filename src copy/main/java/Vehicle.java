public class Vehicle extends VehicleFueling implements VehicleObserver{
    protected int currentFuelLevel;

    public Vehicle(int fuelLevel){
        this.currentFuelLevel = fuelLevel;
    }

    @Override
    protected void fueling() {
        this.currentFuelLevel = 10;
    }

    public final int getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public final void setCurrentFuelLevel(int level) {
        this.currentFuelLevel = level;
    }


    @Override
    public void vehicleAdded(Vehicle this) {
        System.out.println("Vehicle added to Gas Station");
    }

    @Override
    public void vehicleRemoved(Vehicle this) {
        System.out.println("Vehicle removed from Gas Station");
    }

    @Override
    public void vehicleFueled(Vehicle this) {
        System.out.println("Vehicle fueled at Gas Station");
    }
}
