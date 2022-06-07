package Day3_050122;

import java.util.ArrayList;

public class Loop_With_Coditions {
    public static void main(String[] args) {
        //create an array with fruits and print only when fruit is apple or orange
        ArrayList<String>fruits = new ArrayList<>();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("strawberry");
        fruits.add("mango");

        for (int i = 0; i < fruits.size(); i++){
            //with if conditions
            /*
            if(fruits.get(i) == "apple") {
                System.out.println("My fruit is " + fruits.get(i));
            }else if(fruits.get(i) == "orange"){
                System.out.println("My fruit is " + fruits.get(i));
            }

             */
            //with or operator
            if(fruits.get(i) == "apple" || fruits.get(i) == "orange"){
                System.out.println(" My fruit is " + fruits.get(i));
            }
        }
    }//end of main
}//end of java
