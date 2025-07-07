package basics;

import java.util.Arrays;
import java.util.List;

public class practice2 {
    public static void main(String[] args){

        String[] list = {"nasser", "abdullah"};

        for(String st: list){
            StringBuilder string1= new StringBuilder(new StringBuilder(st).reverse().toString());
            System.out.println(string1);

        }

    }
}
