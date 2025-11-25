package SensingDetails;

import Feeds.EnvironmentalSystem;

public abstract class AllSensing {

    protected EnvironmentalSystem system;


    public AllSensing(EnvironmentalSystem system) {
        this.system = system;
    }

    public EnvironmentalSystem getSystem() {
        return system;
    }



    public abstract String consoleOutput();
    public abstract String isDeviceOn();

}
