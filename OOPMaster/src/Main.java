public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausege", 3.50, "white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("tomato",0.50);
        hamburger.addHamburgerAddition2("Lettuce",0.50);
        hamburger.addHamburgerAddition3("Cheese",0.50);
        price = hamburger.itemizeHamburger();
        System.out.println("Total price is: "+ price);

    }
}
