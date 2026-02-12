package platform;

public class Tiktok implements Platform {

    @Override
    public void publish(String message) {
        System.out.println("Tiktok -> " + message);
    }
}

