package me.corejava.effectivejava.createdestroyobjects.staticfactorymethods;

/**
 * @author Sarath
 */
public class ServiceProviderTest {

    public static void main(String[] args) {
        Provider exampleProvider = new ExampleProvider();

        //register defaultProvider
        Services.registerDefaultProvider(exampleProvider);
        //register provider with the name example
        Services.registerProvider("example", exampleProvider);

        Client client = new Client();
        client.useService();

    }

    static class Client{

        //Client is decoupled from the Actual service implementation

        public void useService(){
            //Use example service
            Service service = Services.newInstance("example");
            service.doSomething();// Prints Example Service
        }
    }
}
