package content;

import platform.Platform;

public abstract class Content {

    protected Platform platform;

    public Content(Platform platform) {
        this.platform = platform;
    }

    protected abstract String createMessage();
    
    public void publish() {
        platform.publish(createMessage());
    }
    
    public void setPlatform(Platform platform){
        this.platform = platform;
    }

}
