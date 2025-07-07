public class StringPractice {

    public static boolean monkeySmile(boolean aSmile,boolean bsmile){

        if ( aSmile==true && bsmile==true) {
            System.out.println("there is trouble");
            return true;
        } else if (aSmile==false && bsmile==false) {
            System.out.println("there is trouble");
            return true;


            
        }
        else {
            return false;
    }
    }
    public static void main(String[] args){

        System.out.println(monkeySmile(true,true));
        System.out.println(monkeySmile(false,false));
        System.out.println(monkeySmile(true,false));
        System.out.println(monkeySmile(false,true));
    }
}
