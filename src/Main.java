import java.util.ArrayList;

/**
 * Created by Equ on 11/29/2016.
 */

public class Main {

    public static void main(String [] args)
    {
        NTC ntc = new NTC();
        String matchStatus = "Approx. Color";
        ArrayList<String> results = ntc.findName("#1212AB");
        System.out.println("Color Hex: " + results.get(0));
        System.out.println("Color Name: " + results.get(1));
        if (results.get(2).equals("True")){
            matchStatus = "Exact match!";
        }
        System.out.println(matchStatus);
    }
}
