package me.corejava.effectivejava.createdestroyobjects.builder;

import me.corejava.effectivejava.createdestroyobjects.builder.Phone;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sarath
 */
public class BuilderTest {

    @Test
    public void builderTest() {
        Phone phone = new Phone.Builder("Samsung", "S7")
                .color("Gold").diskSizeIngb(128).build();

        Assert.assertTrue(phone.toString().contains("color='Gold'"));
    }
}
