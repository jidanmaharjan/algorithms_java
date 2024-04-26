
public class Polymorphism {

    Polymorphism() {
        System.out.println("Constructercalled");
    }

    Polymorphism(int a) {
        System.out.println("your number is " + a);
    }

    public void sendMessage() {
        System.out.println("hi");
    }

    public void sendMessage(String name) {
        System.out.println("hi" + name);
    }

    public void sendMessage(int a) {
        System.out.println("hi your age is" + a);
    }

    public static void main(String[] args) {
        Polymorphism poly = new Polymorphism();
        poly.sendMessage(16);
        Polymorphism poly2 = new Polymorphism(2);
    }
}
