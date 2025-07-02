import java.util.Scanner;
public class knife {


    public void sharp(int sharpness) {

        if (sharpness > 400) {
            System.out.println("dull knife needs maintenance");
        } else if (sharpness < 400) {
            System.out.println("the knife will cut");

        }
    }

    public void length() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the length");
        int length = scanner.nextInt();
        if (length > 40) {
            System.out.println("the knife is lengthy ");
        } else {
            System.out.println("the knife requires more length");
        }
    }
}
