public abstract class AbstractWreckedDecorator extends Cars {

    private Cars aVehicle;

    public AbstractWreckedDecorator(Cars uVehicle) {
        super();
        this.aVehicle = uVehicle;
    }

    public Vehicle deduct(){
        aVehicle.currentFuelLevel -= 5;
        return aVehicle;
    }
}
