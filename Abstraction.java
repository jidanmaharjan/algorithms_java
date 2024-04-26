
interface Vehicle {

    void runsOn();
}

class Bike implements Vehicle {
    public void runsOn() {
        System.out.println("Petrol");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.runsOn();
    }
}
