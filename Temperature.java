public class Temperature
{
  /**
     * converts a temperature from Celsius to Fahrenheit
     */
    public double convertTemperature(double celsius)
    {
       double fahrenheit = (celsius * (9.0/5.0)) + 32;
       return fahrenheit;
    }
}
