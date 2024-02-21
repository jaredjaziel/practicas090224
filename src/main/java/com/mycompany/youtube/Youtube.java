/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtube;

public class Youtube {

    public static void main(String[] args) {
        Usuario usuario=new Usuario(" limon");
        Video video=new Video(" aprendiendo java",2400,"http;//limon.com");
        usuario.setsubirVideo(video);
        
        Usuario usuario2=new Usuario(" JARED ");
        usuario.mostrarInfoUsuario();
        Comentario comentario1 =new Comentario(" buen video",usuario2);
        System.out.println("El usuario"+ usuario2.getNombre()+"publico el comentario"+ comentario1.getContenido());
    }
}

