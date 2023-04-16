package test;

import collection.Factory;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;

public class FactoryTest {
    @Test
    public void True() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Factory.main(null);
        String ln = System.lineSeparator();
        String expected = "first" + ln + "second"
                + ln + "third"
                + ln + "fourth"
                + ln + "fifth" + ln;
        Assert.assertThat(out.toString(), is(expected));
    }
}