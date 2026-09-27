/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
public class SmartBulb implements SmartDevice {

    private boolean isOn = false;
    private int brightness = 0;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Bulb turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Bulb turned OFF.");
    }

    @Override
    public String getStatus() {
        return "Bulb is " + (isOn ? "ON" : "OFF") + ", brightness: " + brightness + "%";
    }

    public void setBrightness(int level) {
        if (level < 0) level = 0;
        if (level > 100) level = 100;
        brightness = level;
    }
}
