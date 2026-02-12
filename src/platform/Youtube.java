package platform;

public class Youtube implements Platform {

    @Override
    public void publish(String message) {
        System.out.println("Youtube -> " + message);
    }
}

