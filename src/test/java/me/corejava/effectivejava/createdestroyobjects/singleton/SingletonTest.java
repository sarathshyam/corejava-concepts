package me.corejava.effectivejava.createdestroyobjects.singleton;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Sarath
 */
public class SingletonTest {

    @Test
    public void checkSingleton() {
        SingletonExample instanceOne = SingletonExample.getInstnce();
        SingletonExample instanceTwo = SingletonExample.getInstnce();
        assert(instanceOne == instanceTwo);
        assertEquals(instanceOne.hashCode(), instanceTwo.hashCode());
    }

}
