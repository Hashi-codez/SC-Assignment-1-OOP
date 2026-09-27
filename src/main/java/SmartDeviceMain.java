/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
import java.util.ArrayList;
import java.util.List;

public class SmartDeviceMain {
    public static void main(String[] args) {

        SmartBulb bulb = new SmartBulb();
        SmartThermostat thermostat = new SmartThermostat();

        bulb.turnOn();
        bulb.setBrightness(75);

        thermostat.turnOn();
        thermostat.setTemperature(23.5);

        List<SmartDevice> devices = new ArrayList<>();
        devices.add(bulb);
        devices.add(thermostat);

        for (SmartDevice d : devices) {
            System.out.println(d.getStatus());
        }
    }
}
