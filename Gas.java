import java.util.Scanner;
public class Gas {

    int pressure;
    Scanner scanner = new Scanner(System.in);
    public void Temperature() {
        System.out.print("Please enter the temperature: ");
        int temp = scanner.nextInt();
        System.out.println("The temperature you entered is: " + temp);

        if (temp > 50) {
            System.out.println(" Temperature is rising");
        } else if (temp < 50) {
            System.out.println(" Temperature is decreasing");
        }
    }

    public void Pressure(int press) {


        if (press > 50) {
            System.out.println(" pressure is high");
        } else if (press < 50) {
            System.out.println(" Pressure is low");
        }
    }
}
