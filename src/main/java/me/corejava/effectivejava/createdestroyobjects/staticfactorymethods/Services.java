package me.corejava.effectivejava.createdestroyobjects.staticfactorymethods;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Sarath
 */
public class Services {

    //List of providers
    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();
    private static final String DEFAULT_PROVIDER_NAME = "DEF_PRVDR";


    //Private constructor
    private Services(){
    }

    /**
     * Provider Registration API
     * @param provider
     */
    public static void registerDefaultProvider(Provider provider){
        providers.put(DEFAULT_PROVIDER_NAME, provider);
    }

    /**
     * Provider registration API
     * @param name
     * @param provider
     */
    public static void registerProvider(String name, Provider provider){
        providers.put(name, provider);
    }

    /**
     * Service access API, which is a static factory method
     * @return
     */
    public static Service newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    /**
     * Service access API which is a static factory method
     * @param name
     * @return
     */
    public static Service newInstance(String name){
        Provider p = providers.get(name);
        if(p == null){
            throw new IllegalArgumentException("No Provider available for " + name);
        }
        return p.newService();
    }

}
