
class Animal {
    int eyes = 2;
    int legs;
}

class Dog extends Animal {
    public void bark() {
        System.out.println("woof woof");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.legs = 4;
        System.out.println("Doggo has " + d1.legs + " legs and" + d1.eyes + " eyes");
        d1.bark();
    }
}
