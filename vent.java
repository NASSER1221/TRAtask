public class vent {
    byte vent;



    public void setVent(byte currentVent) {
        this.vent = currentVent;

        if (currentVent == 1) {
            System.out.println("Vent is Open ");
        } else {
            System.out.println("Vent is closed");
        }
    }
}
