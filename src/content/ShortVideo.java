package content;

import platform.Platform;

public class ShortVideo extends Content{

    public ShortVideos(Platform platform) {
        super(platform);
    }

    @Override
    protected String createMessage(){
        return "Publishing a ShortVideo";
    }
}
