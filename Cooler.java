import java.util.Scanner;

public class Cooler {

    public void setHours() {

        System.out.println("please enter the number of hours  ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        if (hours >= 600) {
            System.out.println("the cooler needs maintenance");
        } else {
            System.out.println("the cooler is working fine");
        }
    }
}
