
public class Satellite  {

    public void satellite(Satellite satellite, String message) {
        satellite.receiveFrom(message);
    }

    public void receiveFrom(String message) {
        System.out.println("Message received: " + message);
    }

    public static void main(String[] args) {
        Satellite satellite1 = new Satellite();
        Satellite satellite2 = new Satellite();

        satellite1.satellite(satellite2, "Hello from sat1!"); // im sending message to the second satellite
    }
}



