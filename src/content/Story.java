package content;

import platform.Platform;

public class Story extends Content {

    public Story(Platform platform) {
        super(platform);
    }

    @Override
    protected String createMessage() {
        return "Publishing a Story ";
    }
}

