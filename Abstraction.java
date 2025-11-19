abstract class Animal {
    abstract void sound(); // abstract method

    void sleep() {         // normal method
        System.out.println("Animal is sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.sleep();
    }
}
