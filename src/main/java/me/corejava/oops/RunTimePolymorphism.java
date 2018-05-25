package me.corejava.oops;

/**
 * Example of Run time polymorphism = Method overriding
 */
public class RunTimePolymorphism {

    class Animal {
        String name = "Animal";
        void eat() {
            System.out.println("Animal Eating..");
        }
    }

    class Cat extends Animal {
        String name = "Cat";
        @Override
        void eat() {
            System.out.println("Cat Eating..");
        }
    }

    void run() {

        /**
         * Here the reference type a is an Animal,the actual method to execute is decided at RunTime
         */
        Animal a = new Cat();
        a.eat(); // Expect Cat Eating
        System.out.println(a.name); //Expect Animal coz fields are bound compile time. Only methods are overriden
    }

    public static void main(String[] args) {
        RunTimePolymorphism test = new RunTimePolymorphism();
        test.run();
    }
}
