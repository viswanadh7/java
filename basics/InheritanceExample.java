class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal { // we use extends keyword to inherit the parent class
    void bark() {
        System.out.println("Dog barks.");
    }
}

class InheritanceExample {
    public static void main(String a[]) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
