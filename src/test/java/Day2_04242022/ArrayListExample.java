package Day2_04242022;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //create an arraylist for countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Usa");
        countries.add("Bangkadesh");
        countries.add("India");
        countries.add("Canada");
        countries.add("Pakistan");

        //I want to print 4th value from the list
        System.out.println("my last country is" + countries.get(4) + "my third country is" + countries.get (2));

    }//end of main method
}//end of java class
