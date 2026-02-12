package content;

import platform.Platform;

public class ShortVideo extends Content{

    public ShortVideo(Platform platform) {
        super(platform);
    }

    @Override
    protected String createMessage(){
        return "Publishing a ShortVideo";
    }
}
