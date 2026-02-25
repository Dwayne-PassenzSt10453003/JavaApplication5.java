//single line comment
//This is my first java project 

/*This
is 
a
multi-line
comment
*/

package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {
    
/*
{This is a block}
 */

//This statement is a method 
//Static is one copy of method, there is one instance
//of the method
//void - returns nothing 
    public static void main(String[] args) {
     //Create tne scanner object
     Scanner inputOne = new Scanner(System.in);
     //data types
     //variables
     //[D][w][a][y][n][e]
    String myName = "I am Dwayne";
     char initial = 'D';
     int myAge = 20;
     double  myFractionAge = 20.95;
             
     System.out.print("Hello" + " ! " + myName +  " ! " + initial + " ! " + myAge + " ! " + " ! " +myFractionAge);
     System.out.println("\nPlease enter your ID:" );        
      String ID = inputOne.next();
      System.out.println("Hello" + myName + ",your ID is:" + ID);
      }
    }
    

