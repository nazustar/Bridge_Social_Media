/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contenido;

import platform.platform;

public class Foto extends Contenido {

    public Foto(platform platform) {
        super(platform);
    }

    @Override
    protected String crearMensaje() {
        return "Publicando una Foto ";
    }
}

