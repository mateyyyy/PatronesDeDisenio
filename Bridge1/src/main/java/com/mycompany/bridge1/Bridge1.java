/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bridge1;

/**
 *
 * @author matia
 */
public class Bridge1 {

    public static void main(String[] args) {
        System.out.println("Patron BRIDGE");
        Television tv = new Television();
        Remote control = new Remote(tv);
        control.encender();
        
        Radio radio = new Radio();
        Remote controlRadio = new Remote(radio);
        controlRadio.cambiarCanal();
    }
}
