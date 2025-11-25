package SensingDetails;

import Feeds.EnvironmentalSystem;
import Feeds.TemperatureFeed;

public class Temperature extends AllSensing{

    private float currentTemp;
    private static final int NORTH_WARD = 0;
    private static final int CENTRAL_WARD = 1;
    private static final int SOUTH_WARD = 2;
    private TemperatureFeed tempFeed =system.getTempFeed();


    public Temperature(EnvironmentalSystem system) {
        super(system);
    }

    public float getCurrentTempNorth() {
        return Math.round(tempFeed.getTemperature(NORTH_WARD) * 1.0);
    }

    public float getCurrentTempCentral() {
        return Math.round(tempFeed.getTemperature(CENTRAL_WARD) * 1.0);
    }

    public float getCurrentTempSouth() {
        return Math.round(tempFeed.getTemperature(SOUTH_WARD) * 1.0);
    }

    @Override
    public String isDeviceOn() {
        String northHeating =null;
        String centralHeating=null;
        String southHeating = null;
        boolean statusNorth =  system.isHeatingOn(NORTH_WARD);
        boolean statusCentral = system.isHeatingOn(CENTRAL_WARD);
        boolean statusSouth = system.isHeatingOn(SOUTH_WARD);
        if (statusNorth = true) {
            northHeating =  "ON";
        } else {
            northHeating = "OFF";
        }

        if (statusCentral = true) {
            centralHeating =  "ON";
        } else {
            centralHeating = "OFF";
        }

        if (statusSouth = true) {
            southHeating =  "ON";
        } else {
            southHeating = "OFF";
        }

        return "North Heating is "+ northHeating + ", South heating is "+southHeating +", Central heating is "+centralHeating;
    }

    @Override
    public String consoleOutput() {
        return "Details.Pollution = "  + "\nStatus of Air Purifier = " + isDeviceOn();
    }


}
