import Feeds.EnvironmentalSystem;
import SensingDetails.AllSensing;
import SensingDetails.Humidity;
import SensingDetails.Pollution;
import SensingDetails.Temperature;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DisplayUI extends JPanel {
    private Temperature tempSystem = new Temperature(new EnvironmentalSystem());
    private Pollution pollutionSystem = new Pollution(new EnvironmentalSystem());
    private Humidity humiditySystem = new Humidity(new EnvironmentalSystem());
    private JPanel mainPanel = new JPanel();
    private JPanel northTempPanel = new JPanel();
    private JPanel southTempPanel = new JPanel();
    private JPanel humidityPanel = new JPanel();
    private JPanel pollutionPanel = new JPanel();
    private MonitoringSystem monitoringSystem = new MonitoringSystem();

    public DisplayUI(){
        mainPanel.setSize(600,600);
        mainPanel.setBackground(Color.white);
        mainPanel.setLayout(new GridLayout(3,2));
        mainPanel.add(addNorthTempPanel());
        mainPanel.add(addSouthTempPanel());


    }

    public JPanel addNorthTempPanel() {
        if (monitoringSystem.getNorthTempStatus() == true) {
            northTempPanel.setBackground(Color.green);
        } else {
            northTempPanel.setBackground(Color.red);
        }

        JLabel wardName = new JLabel("North Ward");
        JLabel temp = new JLabel("Current temp: " +String.valueOf(tempSystem.getCurrentTempNorth()));
        JLabel ideal = new JLabel("Ideal temp: "+String.valueOf(monitoringSystem.getMaxSouthTemp()));
        JLabel isOn = new JLabel(tempSystem.isDeviceOn());
        northTempPanel.add(wardName);
        northTempPanel.add(temp);
        northTempPanel.add(ideal);
        northTempPanel.add(isOn);
        return northTempPanel;
    }

    public JPanel addSouthTempPanel() {
        if (monitoringSystem.getSouthTempStatus() == true) {
            southTempPanel.setBackground(Color.green);
        } else {
            southTempPanel.setBackground(Color.red);
        }

        JLabel wardName = new JLabel("South Ward\n");
        JLabel temp = new JLabel("Current temp: " +String.valueOf(tempSystem.getCurrentTempNorth()) +"\n");
        JLabel ideal = new JLabel("Ideal temp: "+String.valueOf(monitoringSystem.getMaxSouthTemp()));
        JLabel isOn = new JLabel(tempSystem.isDeviceOn());
        southTempPanel.add(wardName);
        southTempPanel.add(temp);
        southTempPanel.add(ideal);
        southTempPanel.add(isOn);
        return southTempPanel;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    /*
    public void addSensor(AllSensing sensing){
        sensings.add(sensing);
    }

    public ArrayList<AllSensing> getSensings() {
        return sensings;
    }

     */
}
