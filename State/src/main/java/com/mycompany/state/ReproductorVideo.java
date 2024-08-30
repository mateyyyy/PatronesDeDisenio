/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author matia
 */
public class ReproductorVideo {
    States estado;
    public ReproductorVideo(States estado){
        this.estado = estado;
    }
    
    public void CambiarEstado(States estado){
        this.estado = estado;
    }
    
    public void Reanudar(){
        estado.reanudar();
    }
    
    public void Pausar(){
        estado.pause();
    }
}
