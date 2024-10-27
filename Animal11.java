package basicJava.org.com;
/*.Write a Java program that demonstrates method overriding by creating a superclass called Animal 
and two subclasses called Dog and Cat. ● The Animal class should have a method called makeSound(), which simply prints "The animal makes a sound." ● The Dog and Cat classes should override this method to print "TheCat/The dog meows/barks" 
respectively. ● The program should allow the user to create and display objects of each class.
*/

import java.util.Scanner;

//Superclass
class Animal11 {
 // Method to be overridden by subclasses
 public void makeSound() {
     System.out.println("The animal makes a sound.");
 }
}

//Subclass Dog overriding makeSound()
class Dog extends Animal11  {
 public void makeSound(){
     System.out.println("The dog barks.");
 }
}

//Subclass Cat overriding makeSound()
class Cat extends Animal11 {
 @Override
 public void makeSound() {
     System.out.println("The cat meows.");
     
 }
 
}
class MethodOverriding1 {
	//main method for executing the main method for animal11 class reference and its method using  Polymorphism 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner for allocating memory to objects

        System.out.println("Choose an animal: 1 for Dog, 2 for Cat");
        int choice = scanner.nextInt();

        Animal11 animal; // Reference of superclass

        if (choice == 1) {
            animal = new Dog();// Polymorphism in action
        } else if (choice == 2) {
            animal = new Cat();// Polymorphism in action
        } else {
            System.out.println("Invalid choice. Creating a generic animal.");
            animal = new Animal11();
        }

        animal.makeSound();
    }
}

