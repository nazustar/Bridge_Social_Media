package content;

import platform.Platform;

public class Photo extends Content {

    public Photo(Platform platform) {
        super(platform);
    }

    @Override
    protected String createMessage() {
        return "Publishing a Photo ";
    }
}

