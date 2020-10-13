import org.junit.*;

/**
 * Test the Temperature class
 */
public class TemperatureTest extends junit.framework.TestCase {

    public static void main(String[] args) {
      TemperatureTest test = new TemperatureTest();
      test.test_convertTemperature();
    }

    @Test
    public void test_convertTemperature() {
         Temperature t = new Temperature();
        double c = 15.0;
        double f = t.convertTemperature(c);
        if (Math.abs(f-59.0) < .01)
            System.out.println("Your convertTemperature method works.");
        else {
            fail("Your program says that 15 in celsius is " + f + " in fahrenheit. It should be 59.0");
        }
       
      
    }
}
