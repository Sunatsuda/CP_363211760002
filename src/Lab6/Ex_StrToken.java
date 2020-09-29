package Lab6;

import java.util.StringTokenizer;

public class Ex_StrToken {

    public static void main(String[] args) {

        String msg = "Don’t let the spiciness frighten you off, as you will mostly witness spiciness in the Thai food. Slowly, in the long run, you will get used to the spicy flavor. This might take you a few days filled with bathroom series, but steadily you will enjoy the taste and mostly will fell in love with Thai cuisine for sure.";

        System.out.println(msg.length());

        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens()); // return word count as integer

        while (myToken.hasMoreTokens()){
            System.out.println(myToken.nextToken());
        }
    }
}
