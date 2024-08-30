/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridge1;

/**
 *
 * @author matia
 */
public class Television implements Device{
    int volumen;
    boolean estado;
    int channel;
    
    public Television(){
        volumen = 0;
        channel = 0;
        estado = false;
    }

    @Override
    public void encender() {
        this.estado = true;
        System.out.println("Prendiendo television...");
    }

    @Override
    public void apagar() {
        this.estado = false;
        System.out.println("Apagando television...");

    }

    @Override
    public void volumeUp() {
        this.volumen = volumen+10;
        System.out.println("Subiendo volumen...");
    }

    @Override
    public void volumeDown() {
        this.volumen = volumen-10;
        System.out.println("Bajando volumen...");
    }
    
    @Override
    public void changeChannel(){
        channel++;
        System.out.println("Cambiando canal...");
    }
}
