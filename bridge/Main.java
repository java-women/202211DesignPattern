package bridge;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, javajo!"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, java!"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, JJUG!"));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}