public class Trucks extends Vehicle  {
    private static int load;

    protected Trucks(int fuelLevel, int cargoLoad) {
        super(fuelLevel);
        Trucks.load = cargoLoad;
    }

}
