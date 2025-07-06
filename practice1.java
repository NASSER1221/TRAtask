package basics;

public class practice1 {
    public static void main (String[] args){

        String[] names={ "nasser", "abdullah"};

        for (String st:names){
            int index= st.length();
            StringBuilder string1=new StringBuilder();

            for (int i=index-1;i>=1;i--){
                string1.append(st.charAt(i));



            }
        }
    }
}
