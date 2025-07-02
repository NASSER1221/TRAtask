public class Pc {

    boolean PCOnOff;
    int hot;

    public void PC(boolean onOrOff) {
        this.PCOnOff = onOrOff;
    }

    public void heat(int temp) {
        this.hot = temp;

        if(temp >=90 ) {
            System.out.println("system is hot");
        }
        else {
            System.out.println("system is running on normal temp");
        }
    }
}
