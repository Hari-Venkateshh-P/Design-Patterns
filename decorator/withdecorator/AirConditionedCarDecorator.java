package decorator.withdecorator;

public class AirConditionedCarDecorator implements Car {

    private Car car;
    private boolean dualZoneAC;
    private String acBrand;

    public AirConditionedCarDecorator(Car car, String acBrand, boolean dualZoneAC) {
        this.car  = car;
        this.dualZoneAC = dualZoneAC;
        this.acBrand = acBrand;
    }

    public void assemble() {
        car.assemble();
        System.out.println("Assembling Air-conditioned Car");
    }

    public int getPriceQuota() {
        System.out.println("Basic Air-conditioned Price : 300");
        return car.getPriceQuota() + 300;
    }

    public String toString() {
        return car.toString() + "\nACFeature: { dualZoneAC: " + dualZoneAC + ", acBrand: '" + acBrand + "' }";
    }
}
