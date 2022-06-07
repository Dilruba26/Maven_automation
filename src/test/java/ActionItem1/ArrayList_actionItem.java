package ActionItem1;

import java.util.ArrayList;

public class ArrayList_actionItem {
    public static void main(String[] args) {
        //create an arraylist for country and iterate through all  values using for loop
        ArrayList<String> country = new ArrayList<>();
        country.add("USA");
        country.add("Bangladesh");
        country.add("France");
        country.add("Canada");
        country.add("Mexico");

        //Declaring int as country code in arraylist
        ArrayList<Integer> countryCode = new ArrayList<>();
        countryCode.add(1111);
        countryCode.add(2222);
        countryCode.add(3333);
        countryCode.add(4444);
        countryCode.add(5555);

        //Using for loop for iteration
        for (int i=0; i<country.size(); i++){
            for (i =0; i<countryCode.size(); i++){

                System.out.println("My country is" + country.get(i) + " and my coutry code is" + countryCode.get(i));
            }
        }
    }//end of main method
}//end of java class
