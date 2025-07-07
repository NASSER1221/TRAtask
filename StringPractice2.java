package basics;

public class StringPractice2 {
    public static void main(String[] args) {


        String[] names = {"nasser", "abdullah"};
    for(String st: names){

        char[] namesToChar=st.toCharArray();
        StringBuilder string1=new StringBuilder();

        for(int i=st.length()-1;i>=1;i--){

            string1.append(namesToChar[i]);

        }   System.out.println(string1.toString());
    }
    }
}