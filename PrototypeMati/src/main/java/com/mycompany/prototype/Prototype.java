package com.mycompany.prototype;

public class Prototype {

    public static void main(String[] args) {
        Rectangle rectangulo = new Rectangle(20,40,2,4,"red");
        Rectangle clon2 = (Rectangle) rectangulo.clonar();
        System.out.println(clon2.x);
        System.out.println(clon2.y);
        System.out.println(clon2.color);
    }
}
