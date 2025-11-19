// Parent class (superclass)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class (subclass)
class Dog extends Animal {
    void bark() {
        System.out.println(name + " barks.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Buddy";   // Inherited field
        d.eat();            // Inherited method
        d.bark();           // Dog's own method
    }
}
