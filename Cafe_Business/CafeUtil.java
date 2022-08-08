import java.io.Console;
import java.util.ArrayList;

public class CafeUtil {

    // each week a customer needs to purchase 1 more drink than they bought the previous week to get some free drinks after 10 weeks // return sum from 1-10

    int getStreakGoal() {
        int sum = 0;
        for (int i=1; i<=10; i++) {
            sum += i;
        }
        return sum;
    }
//Given an array of order prices, sum the prices and return the total
    int double getOrderTotal(double[] prices) {
        double sum = 0;
       for (double price : prices){
        sum += price;
       }
       return sum;
    }
2

// Given an ArrayList of menu items (strings), print out each index and menu item. 

public void displayMenu(Arraylist<"drip coffee" "cappuccino" "latte"> menuItems) 
for ( int i=0; i<menuItems.size(); i++) {
    System.out.println("%d %s\n", i, menuItems.get(i));


}
//Print this string to the console: "Please enter your name:"

System.out.println ("Please enter your name:");

// Then add this line of code to get user input from the terminal and store it in the variable  userName: 

String userName = System.console().readLine();

// Next print the userName to the console, saying "Hello, [user name here]!"

System.out.print ("Hello", userName); 

// Next print "There are ___ people in front of you" using the number for how many people are ahead of them (how many items already in the array)
System.out.print ("There are people in front of you", customersInLine.size());
customersInLine.add(username);
 


//Then, add the customer's name to the given customers list. And print the list
for (int i=0; i<customersInLine.size(); i++) {
    System.out.print(customersInLine.get(i));
    if (i<(customersInLine.size()-1)) {
        System.out.print(", ");

    }

}
