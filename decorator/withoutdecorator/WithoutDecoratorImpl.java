package decorator.withoutdecorator;

public class WithoutDecoratorImpl {
    public static void main(String[] args) {
        // Car basicCar = new BasicCar("Hyandai", "Red");
        // basicCar.assemble();
        // System.out.println(basicCar.getPriceQuota());
        // System.out.println(basicCar.toString());

        // Car acCar = new AirConditionedCar("Hyandai", "Red", "O-General", false);
        // acCar.assemble();
        // System.out.println(acCar.getPriceQuota());
        // System.out.println(acCar.toString());

        Car ventilatedCar = new VentilatedCar("Hyandai", "Red", 2, true);
        ventilatedCar.assemble();
        System.out.println(ventilatedCar.getPriceQuota());
        System.out.println(ventilatedCar.toString());
    }
}

// WE CANNOT HAVE A CAR WITH BOTH VENTILATION AND AC. WE NEED TO DESIGN A NEW CLASS FOR THE USECASE.
// WITH DECORATOR PATTERN WE CAN ADD A FEATURE ON TOP OF EXISTING FIELD.
