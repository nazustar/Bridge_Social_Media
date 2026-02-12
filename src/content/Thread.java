package content;

import platform.Platform;;

public class Thread extends Content{

    public Thread(Platform platform) {
        super(platform);
    }

    @Override
    protected String createMessage(){
        return "Hola";
    }
}
