package decorator.withoutdecorator;

public class AirConditionedCar extends BasicCar {

    private boolean dualZoneAC;
    private String acBrand;

    public AirConditionedCar(String brand, String color, String acBrand, boolean dualZoneAC) {
        super(brand, color);
        this.dualZoneAC = dualZoneAC;
        this.acBrand = acBrand;
    }

    public void assemble() {
        super.assemble();
        System.out.println("Assembling Air-conditioned Car");
    }

    public int getPriceQuota() {
        System.out.println("Basic Air-conditioned Price : 300");
        return super.getPriceQuota() + 300;
    }

    public String toString() {
        return super.toString() + "\nACFeature: { dualZoneAC: " + dualZoneAC + ", acBrand: '" + acBrand + "' }";
    }
}
