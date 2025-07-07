package basics;

import java.util.Arrays;

public class practice4 {
    public static void main(String[] args) {

        String[] names = {"nasser", "abdullah"};

        for (int i = 0; i < names.length; i++) {

            String nameToReverse = names[i];
            String reversedName = reverseWord(nameToReverse);
            String reversed = names[i];

            System.out.println(Arrays.toString(names));


        }


    }

    public static String reverseWord(String runReserve) {


        char[] length = new char[runReserve.length()];


        for (int i = 0; i < runReserve.length(); i++) {
            StringBuilder string1 = new StringBuilder();
            char[] words = runReserve.toCharArray();
            for (i = runReserve.length() - 1; i < -1; i--) {

                char[] savedChar = new char[i];
                string1.append(savedChar);


            }
            return string1.toString();
        }
        return runReserve;
    }
}


