package oop;

@FunctionalInterface
interface MyFunctionalInterface {
    void greet();  // Single Abstract Method

    default void sayHello() {
        System.out.println("Hello from default method!");
    }

    static void sayStaticHello() {
        System.out.println("Hello from static method!");
    }
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface myFunc = () -> System.out.println("Hello, Functional Interface!");
        myFunc.greet(); // Output: Hello, Functional Interface!
    }
}


