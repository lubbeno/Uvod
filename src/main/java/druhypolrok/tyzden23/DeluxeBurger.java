package druhypolrok.tyzden23;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("DeluxeBurger", "Sausage", 3.56,  "White");
        super.addHamburgerAddition1("drink",0);
        super.addHamburgerAddition2("chips",0);

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public double itemizeHamburger() {
        return 19.10;
    }
}
