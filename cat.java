public class cat {
    boolean sleeping;
    boolean eating;


    public void sleep(char sleepStatus) {

        String yes = "yes";
        String no = "no";
        if (sleepStatus == 'y'|| sleepStatus=='Y'){
            System.out.println(" the cat is sleeping");}
        else if (sleepStatus == 'n'|| sleepStatus=='N'){
            System.out.println(" the cat is awake");



        } else {
            System.out.println("no");
        }


    }

    public void eat(boolean eats) {
        this.eating = eats;
        if (eats == true) {
            System.out.println("cat is eating");
        } else {
            System.out.println("cat is not eating");
        }
    }
}

