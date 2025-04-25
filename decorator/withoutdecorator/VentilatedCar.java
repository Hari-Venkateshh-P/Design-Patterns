package decorator.withoutdecorator;

public class VentilatedCar extends BasicCar {

    private int ventilationLevels;
    private boolean rearSeatVentilation;

    public VentilatedCar(String brand, String color, int ventilationLevels, boolean rearSeatVentilation) {
        super(brand, color);
        this.ventilationLevels = ventilationLevels;
        this.rearSeatVentilation = rearSeatVentilation;
    }

    public void assemble() {
        super.assemble();
        System.out.println("Assembling VentilatedCar");
    }

    public int getPriceQuota() {
        System.out.println("Ventilation Price : 200");
        return super.getPriceQuota() + 200;
    }

    public String toString() {
        return super.toString() + "\nVentilatedSeatsFeature: { ventilationLevels: " + ventilationLevels + ", rearSeatVentilation: "
                + rearSeatVentilation + " }";
    }

}
