package SensingDetails;

import Feeds.EnvironmentalSystem;
import Feeds.HumidityFeed;

public class Humidity extends AllSensing{

    private int insideHumidity;
    private int outsideHumidity;
    private HumidityFeed humidityFeed = system.getHumidityFeed();

    public Humidity(EnvironmentalSystem system) {
        super(system);
    }

    public int getInsideHumidity() {
        return humidityFeed.getInsideHumidity();
    }

    public int getOutsideHumidity() {
        return humidityFeed.getOutsideHumidity();
    }

    public String isDeviceOn() {
        boolean status =  system.isDehumudifierOn();
        if (status = true) {
            return "ON";
        } else {
            return "OFF";
        }
    }

    @Override
    public String consoleOutput() {
        return "Outside Details.Humidity = " + getOutsideHumidity() + "\nInside Details.Humidity = " + getInsideHumidity() +
                "\n Difference in humidity = " + (getInsideHumidity()-getInsideHumidity()) + "\nStatus of Humidifier = " + isDeviceOn();
    }


}
