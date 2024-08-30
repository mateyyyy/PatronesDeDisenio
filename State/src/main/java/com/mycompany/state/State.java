/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.state;

/**
 *
 * @author matia
 */
public class State {

    public static void main(String[] args) {
        System.out.println("Patron STATE");
        EnVideo pelicula = new EnVideo();
        EnMenu menu = new EnMenu();
        ReproductorVideo netflix = new ReproductorVideo(pelicula); 
        netflix.Pausar();
        netflix.Reanudar();
        netflix.CambiarEstado(menu);
        netflix.Pausar();
        netflix.Reanudar();
    }
}
