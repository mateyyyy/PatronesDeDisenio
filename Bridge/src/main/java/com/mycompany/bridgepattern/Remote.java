/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridgepattern;

/**
 *
 * @author matia
 */
public abstract class Remote {
    Device device;
    public Remote(Device device){
        this.device = device;
    }
    void turnOn(){
        device.turnOn();
    };
}
