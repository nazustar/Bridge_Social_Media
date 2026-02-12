/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import platform.*;
import contenido.*;

public class Test {
    public static void main(String[] args) {
                platform instagram = new Instagram();

        Contenido foto = new Foto(instagram);
        foto.publicar();

        Contenido historia = new Historia(instagram);
        historia.publicar();
    
    }
}

