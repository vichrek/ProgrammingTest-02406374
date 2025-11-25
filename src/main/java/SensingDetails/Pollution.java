package SensingDetails;

import Feeds.EnvironmentalSystem;
import Feeds.PollutionFeed;

public class Pollution extends AllSensing{

    private float pollution;
    private PollutionFeed pollutionFeed = system.getPollutionFeed();

    public Pollution(EnvironmentalSystem system) {
        super(system);
    }

    public float getPollution() {
        return pollutionFeed.getPollution();
    }

    @Override
    public String isDeviceOn() {
        boolean status =  system.isAirPurifierOn();
        if (status = true) {
            return "ON";
        } else {
            return "OFF";
        }
    }

    @Override
    public String consoleOutput() {
        return "Details.Pollution = " + getPollution() + "\nStatus of Air Purifier = " + isDeviceOn();
    }
}
