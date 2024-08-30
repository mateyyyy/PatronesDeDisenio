/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bridgepattern;

/**
 *
 * @author matia
 */
public class BridgePattern {

    public static void main(String[] args) {
    // Crear dispositivos
    Tv tv = new Tv();
    Radio radio = new Radio();

    // Crear controles remotos avanzados para diferentes dispositivos
    advancedRemote samsungTvRemote = new advancedRemote(tv);
    advancedRemote sonyRadioRemote = new advancedRemote(radio);

    // Encender los dispositivos usando los controles remotos avanzados
    System.out.println("Encendiendo el televisor usando el control remoto Samsung:");
    samsungTvRemote.turnOn();

    System.out.println("\nEncendiendo la radio usando el control remoto Sony:");
    sonyRadioRemote.turnOn();
    }
}
