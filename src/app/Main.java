package app;

import platform.*;
import content.*;

public class Main {
    public static void main(String[] args) {

        Platform instagram = new Instagram();
        Platform youtube = new Youtube();
        Platform tiktok = new Tiktok();
        Platform twitter = new Twitter();

        Content story = new Story(tiktok);
        Content photo = new Photo(instagram);
        Content shortVideo = new ShortVideo(youtube);
        Content threadContent = new ThreadContent(twitter);
        
        photo.publish();
        story.publish();

        story.setPlatform(instagram);
        story.publish();

        shortVideo.publish();

        shortVideo.setPlatform(tiktok);
        shortVideo.publish();
        
        threadContent.publish();

    }
}

