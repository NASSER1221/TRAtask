package basics;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeCreatorPractice {


    public static void main(String[] args) {

        String[] names = {"nasser", "haitham","manal"};


        for (String st : names) {
            StringBuilder string1= new StringBuilder();
        for (int i=st.length()-1; i>=0;i--){
            string1.append(st.charAt(i));
        }

            System.out.println( "reversed name "+ string1);
        }
    }


}
