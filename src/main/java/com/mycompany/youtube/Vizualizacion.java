/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube;

/**
 *
 * @author obed
 */
public class Vizualizacion {
    public Usuario espectador;
    public Video video;

    public Vizualizacion(Usuario espectador, Video video) {
        this.espectador = espectador;
        this.video = video;
    }

    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
    
    
}
    

