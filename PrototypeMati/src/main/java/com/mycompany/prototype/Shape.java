/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototype;

/**
 *
 * @author matia
 */
public abstract class Shape {
    int x;
    int y;
    String color;
    
    public Shape(int x, int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    public Shape(Shape figuraClonar){
        this.x = figuraClonar.x;
        this.y = figuraClonar.y;
        this.color = figuraClonar.color;
    }
    
    public abstract Shape clonar();
}
