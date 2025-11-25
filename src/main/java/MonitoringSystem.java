import Feeds.EnvironmentalSystem;
import SensingDetails.AllSensing;
import SensingDetails.Humidity;
import SensingDetails.Pollution;
import SensingDetails.Temperature;

import java.util.ArrayList;

public class MonitoringSystem {

    private static final float maxNorthTemp = 23;
    private static final float maxCentralTemp = 22;
    private static final float maxSouthTemp = 20;
    private static final float maxPollution = 5;
    private ArrayList<AllSensing> sensings;
    private Temperature tempSystem = new Temperature(new EnvironmentalSystem());
    private Pollution pollutionSystem = new Pollution(new EnvironmentalSystem());
    private Humidity humiditySystem = new Humidity(new EnvironmentalSystem());

    public MonitoringSystem(){
        sensings= new ArrayList<>();
    }

    public boolean getHumidityStatus(){
        if (humiditySystem.getInsideHumidity() > (humiditySystem.getOutsideHumidity()*0.1)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean getNorthTempStatus() {
        if (tempSystem.getCurrentTempNorth()>maxNorthTemp) {
            return false;
        } else {
            return true;
        }
    }

    public boolean getSouthTempStatus() {
        if (tempSystem.getCurrentTempSouth()>maxSouthTemp) {
            return false;
        } else {
            return true;
        }
    }

    public boolean getCentralTempStatus() {
        if (tempSystem.getCurrentTempCentral()>maxCentralTemp) {
            return false;
        } else {
            return true;
        }
    }

    public boolean getPollutionStatus() {
        if (pollutionSystem.getPollution()>maxPollution) {
            return false;
        } else {
            return true;
        }

    }


    public float getMaxCentralTemp() {
        return maxCentralTemp;
    }

    public static float getMaxSouthTemp() {
        return maxSouthTemp;
    }

    public static float getMaxNorthTemp() {
        return maxNorthTemp;
    }

    public static float getMaxPollution() {
        return maxPollution;
    }
}
