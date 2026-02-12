package content;

import platform.Platform;

public class ThreadContent extends Content{

    public ThreadContent(Platform platform) {
        super(platform);
    }

    @Override
    protected String createMessage(){
        return "Hola";
    }
}
