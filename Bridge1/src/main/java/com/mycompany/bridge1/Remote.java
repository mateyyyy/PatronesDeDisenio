/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridge1;

/**
 *
 * @author matia
 */
public class Remote {
    Device dispositivo;
    
    public Remote(Device dispositivo){
        this.dispositivo = dispositivo;
    }

    public void encender(){
        dispositivo.encender();
    }
    
    public void apagar(){
        dispositivo.apagar();
    }
    
    public void volumeUp(){
        dispositivo.volumeUp();
    }
    
    public void volumeDown(){
        dispositivo.volumeDown();
    }
    
    public void cambiarCanal(){
        dispositivo.changeChannel();
    }
    
}
