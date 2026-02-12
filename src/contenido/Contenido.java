/*
 Manejar diferentes tipos de contenido (mínimo 4) que se puedan publicar.
Manejar distintas platforms (mínimo 4) donde se publica el contenido.
Ejecutar una operación principal de publicación (p. ej., publicar(...)) que delegue el
envío a la platform.
Cambiar la platform asociada a un contenido en tiempo de ejecución.
 */
package contenido;

import platform.platform;

public abstract class Contenido {

    protected platform platform;

    public Contenido(platform platform) {
        this.platform = platform;
    }

    public void publicar() {
        platform.publicar(crearMensaje());
    }

    protected abstract String crearMensaje();
}
