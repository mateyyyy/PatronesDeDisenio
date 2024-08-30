/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridge1;

/**
 *
 * @author matia
 */
public class Radio implements Device{
    int volumen;
    boolean estado;
    float freq;
    
    public Radio(){
        volumen = 0;
        freq = 90;
    }

    @Override
    public void encender() {
        this.estado = true;
    }

    @Override
    public void apagar() {
        this.estado = false;
    }

    @Override
    public void volumeUp() {
        this.volumen = volumen+10;
    }

    @Override
    public void volumeDown() {
        this.volumen = volumen-10;
    }
    
    public void changeChannel(){
        this.freq++;
        System.out.println("Cambiando frecuencia...");

    }
    
    
    
}
