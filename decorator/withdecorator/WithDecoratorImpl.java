package decorator.withdecorator;

public class WithDecoratorImpl {
    public static void main(String[] args) {
        // Car superCar = new BasicCar("Hyandai", "Red");

        // AC CAR
        // Car superCar = new AirConditionedCarDecorator(new BasicCar("Hyandai", "Red"), "O - General", false);
        
        // VENTILATED CAR
        // Car superCar = new VentilatedCarDecorator(new BasicCar("Hyandai", "Red"), 2, false);

        // FULLY LOADED CAR WITH AC AND VENTILATION
        Car superCar = new VentilatedCarDecorator(new AirConditionedCarDecorator(new BasicCar("Hyandai", "Red"), "O - General", false), 2, false);

        superCar.assemble();
        System.out.println(superCar.getPriceQuota());
        System.out.println(superCar.toString());
    }
}

