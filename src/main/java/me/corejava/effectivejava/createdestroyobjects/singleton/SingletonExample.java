package me.corejava.effectivejava.createdestroyobjects.singleton;

/**
 * @author Sarath
 */
public class SingletonExample {

    private static final SingletonExample INSTNCE = new SingletonExample();


    private SingletonExample(){
        //Check to block multiple instance creations using reflection
        if(INSTNCE != null){
            throw new IllegalAccessError();
        }
    }

    public static SingletonExample getInstnce(){
        return INSTNCE;
    }
}
