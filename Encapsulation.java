class Person {
    public String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "John";
        p1.setAge(20);
        System.out.println(p1.name + p1.getAge());
    }
}
