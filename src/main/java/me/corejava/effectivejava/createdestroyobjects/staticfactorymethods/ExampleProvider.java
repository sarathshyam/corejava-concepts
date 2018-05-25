package me.corejava.effectivejava.createdestroyobjects.staticfactorymethods;

/**
 * @author Sarath
 */
public class ExampleProvider implements Provider {

    @Override
    public Service newService() {
        return new ExampleService();
    }
}
