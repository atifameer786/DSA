public class Test {
    public static void main(String[] args) {

        Animal a = new Dog();  // Substituting Dog for Animal
        a.makeSound();         // Works as expected: Bark

        a = new Cat();         // Substituting Cat for Animal
        a.makeSound();         // Works as expected: Meow

        Cat c = new Cat();
        
        c.makeSound();
    }
}


class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}