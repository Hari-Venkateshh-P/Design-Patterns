package decorator.withdecorator;

public class BasicCar implements Car {

    private String brand;
    private String color;

    public BasicCar(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling Basic Car");
    }

    @Override
    public int getPriceQuota() {
        System.out.println("Basic Car Price : 100");
        return 100;
    }

    public String toString() {
        return "BasicCar: { brand: '" + brand + ", color: '" + color + "' }";
    }

}
