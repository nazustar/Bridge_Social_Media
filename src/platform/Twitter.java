package platform;

public class Twitter implements Platform {

    @Override
    public void publish(String message) {
        System.out.println("Twitter -> " + message);
    }
}

