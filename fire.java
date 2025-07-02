public class fire {
    byte smoke;
    boolean growth;


    public void fire1(byte smokes) {
        this.smoke = smokes;

        if (smokes == 1) {
            System.out.println("fire detected");
        } else {
            System.out.println("no fire");
        }
    }

    public void growing(boolean grows) {
        this.growth = grows;

        if (grows == true) {
            System.out.println("fire is still spreading");
        } else {
            System.out.println("no fire");

        }
    }
}
