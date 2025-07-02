public class Ship {
    int load;
    boolean dock;

    public void Load(int shipload) {
        this.load = shipload;

        if (shipload > 1000) {
            System.out.println("heavy load");
        } else {
            System.out.println("normal load");

        }
    }

    public void docks(boolean docked) {
        this.dock = docked;

        if (docked == true) {
            System.out.println("ship is docked");
        } else {
            System.out.println("ship is undocked");
        }
    }
}
