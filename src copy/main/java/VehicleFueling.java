public abstract class VehicleFueling {

    public void fuel(){
        System.out.println("fueling car with 10 litres");
        fueling();
        System.out.println("finished fueling vehicle");

    }

    abstract void fueling();


}
