/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author matia
 */
public class EnVideo implements States{

    @Override
    public void pause() {
        System.out.println("Video Pausado");
    }

    @Override
    public void reanudar() {
        System.out.println("Video reanudado");
    }
}
