package me.corejava.oops;

/**
 * Example of Compile time polymporphism- method overloading
 *
 * @author Sarath
 */
public class CompileTimePolymorphism {

    class Animal {

        void jump(){
            System.out.println("jumping once..");
        }

        void jump(int num){
            System.out.println("jumping " + num + " times..");
        }

    }

    void run(){
        Animal animal = new Animal();
        animal.jump();
        animal.jump(4);
    }

    public static void main(String[] args) {
        new CompileTimePolymorphism().run();
    }
}
