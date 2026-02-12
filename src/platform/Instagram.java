package platform;

public class Instagram implements Platform {

    @Override
    public void publish(String message) {
        System.out.println("Instagram -> " + message);
    }
}

