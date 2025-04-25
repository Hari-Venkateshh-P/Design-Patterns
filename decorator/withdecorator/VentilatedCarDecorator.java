package decorator.withdecorator;

public class VentilatedCarDecorator implements Car {

    private Car car;
    private int ventilationLevels;
    private boolean rearSeatVentilation;

    public VentilatedCarDecorator(Car car, int ventilationLevels, boolean rearSeatVentilation) {
        this.car = car;
        this.ventilationLevels = ventilationLevels;
        this.rearSeatVentilation = rearSeatVentilation;
    }

    public void assemble() {
        car.assemble();
        System.out.println("Assembling VentilatedCar");
    }

    public int getPriceQuota() {
        System.out.println("Ventilation Price : 200");
        return car.getPriceQuota() + 200;
    }

    public String toString() {
        return car.toString() + "\nVentilatedSeatsFeature: { ventilationLevels: " + ventilationLevels + ", rearSeatVentilation: "
                + rearSeatVentilation + " }";
    }

}
