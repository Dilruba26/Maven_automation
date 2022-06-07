package Day2_04242022;

public class WhileLoop {
    public static void main(String[] args) {
        //iterate through zipcode and its streetNumber using linear array and while loop
        String[] zipcodes = new String[]{"11218","11219","11231","10001"};
        int[] houseNumber = new int[]{111,222,333,444};

        //initialize your tarting point before calling while loop
        int i =0;
        //define the end point inwhile loop
        while (i < houseNumber.length){
            System.out.println("My zip code is " + zipcodes[i] + "houseNumber" + houseNumber[i]);
            //incementing
            i= i+1;

        }
    }//end of main method
}//end of java class
