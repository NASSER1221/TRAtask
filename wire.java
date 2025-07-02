public class wire {
    public void wire(char Plug) {


        if (Plug == 'c' || Plug == 'C') {
            System.out.println(" the wire is connected");
        } else if (Plug == 'd' || Plug == 'D') {
            System.out.println(" the wire is disconnected");


        } else {
            System.out.println("try connecting the wire first");
        }
    }
}
