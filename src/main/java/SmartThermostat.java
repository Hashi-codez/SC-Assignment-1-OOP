/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
public class SmartThermostat implements SmartDevice {

    private boolean isOn = false;
    private double temperature = 20.0;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Thermostat turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Thermostat turned OFF.");
    }

    @Override
    public String getStatus() {
        return "Thermostat is " + (isOn ? "ON" : "OFF") + ", set to: " + temperature + "°C";
    }

    public void setTemperature(double temp) {
        temperature = temp;
    }
}
