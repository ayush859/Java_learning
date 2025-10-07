import java.util.*;

abstract class Animal {

    protected String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("The dog " + name + " says : Woof!");
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);

    }

    public void makeSound() {
        System.out.println("The cat " + name + " says : Meow!");

    }
}

 
// This is the driver code that will execute and demonstrate the functionality
// of your abstract class `Animal` and the drived classes 'Dog', 'Cat'.

// First the object of the class Dog is created along with the dog name.
// Then the Dog class object is used to call the Method makeSound() to print the
// corresponding text of Dog class.

// Next the object of the class Cat is created along with the cat name.
// Then the Cat class object is used to call the Method makeSound() to print the
// corresponding text of Cat class.

public class _02_Practice_Abstraction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 

        System.out.println("Enter the Dog Name : ");
        String dName = scanner.nextLine();
        System.out.println("Enter the Cat Name : ");
        String cName = scanner.nextLine();
 
        Animal dog = new Dog(dName);
        dog.makeSound(); 
        
        Animal cat = new Cat(cName);
        cat.makeSound();

        scanner.close();
    }
}

// Below are the output statements

// System.out.println("The dog " + name + " says : Woof!");
// System.out.println("The cat " + name + " says : Meow!");
