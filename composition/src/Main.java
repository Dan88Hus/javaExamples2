public class Main {
    public static void main(String[] args) {
// Car extends Vehicle, means is a relationship to Vehicle,  1 to 1 relationship with Vehicle
        // composition has a relationship with Vehicle, 1 to many, computer has a case, has a motherboard
// in Java we can inherit from only one class therefore composition is useful
        Case theCase = new Case("2022", "Lenovo", "240", new Dimensions(20, 20, 5));
        Monitor theMonitor = new Monitor("27inch Beast", "Lenovo", 45, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Lenovo", 4, 6, "v2.44");
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();

        Wall wall1 = new Wall("WEST");
        Wall wall2 = new Wall("EAST");
        Wall wall3 = new Wall("NORTH");
        Wall wall4 = new Wall("SOUTH");

        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Hus Bedrooms'", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}
