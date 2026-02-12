package app;

import platform.*;
import content.*;

public class Main {
    public static void main(String[] args) {

        Platform instagram = new Instagram();

        Content photo = new Photo(instagram);
        photo.publish();

        Content story = new Story(instagram);
        story.publish();

        Content thread = new Thread(instagram);
        thread.publish();


    }
}

