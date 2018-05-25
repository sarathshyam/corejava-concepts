package me.corejava.effectivejava.createdestroyobjects.staticfactorymethods;

/**
 * The Provider interface of a service provider framework pattern
 * @author Sarath
 */
public interface Provider {

    /*
     * Implementations can control creation of service instance.
     */
    public Service newService();

}
