/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototype;

/**
 *
 * @author matia
 */
public class Rectangle extends Shape{
    int width;
    int height;
    
    public Rectangle(int width,int height, int x, int y, String color){
        super(x,y,color);
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    public Rectangle(Rectangle source){
        super(source);
        this.width = source.width;
        this.height = source.height;
    }
    
    @Override
    public Shape clonar(){
        return new Rectangle(this);
    }
}
