import java.util.*;
public class inheritance {
    public static void main(String args[]) {
        // Fish shark = new Fish();
        // shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}
//Base class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void Breathe(){
        System.out.println("Breathe");
    }
}

//Derived Class
// 

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}