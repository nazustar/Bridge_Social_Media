package app;

import platform.*;
import content.*;

public class Main {
    public static void main(String[] args) {

        Platform instagram = new Instagram();
        Platform youtube = new Youtube();
        Platform tiktok = new Tiktok();
        Platform twitter = new Twitter();

        Content photo = new Photo(instagram);
        photo.publish();

        Content story = new Story(tiktok);
        story.publish();

        story.setPlatform(instagram);
        story.publish();



    }
}

