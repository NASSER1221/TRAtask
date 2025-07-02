import java.util.Scanner;

public class water {
    int water;
    Scanner scanner = new Scanner(System.in);
    public void volume() {
        System.out.print("Please enter the water volume: ");
        int water = scanner.nextInt();
        System.out.println("The volume you entered is: " + water+" liters");

    }

    public void flow(boolean flow) {


        if (flow ) {
            System.out.println(" water is flowing");
        } else  {
            System.out.println(" water is static");
        }
    }
}
