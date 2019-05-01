package com.company.prime;

import java.util.Scanner;

public class Eliza {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
//Prompt the user to input what they want Eliza to help with
        System.out.print("Good Afternoon, How can I help you with today? " );
        String userInput=" ";
        boolean userQuit=false;
//Provides user the option to enter response or quit
        while(!userQuit){
            System.out.println("Enter your response or Q to quit");
            userInput= input.nextLine();

            if(userQuit=checkQuitCommand(userInput)){
                break;
            }
        }



	// Boolean to specify an output for user's response
    }
    public static boolean checkQuitCommand(String answer)
    {

        boolean quit= false;
        if (answer.equalsIgnoreCase("Q")||answer.contains("I am feeling great"))
        {
            quit=true;
            System.out.println("Thank you for your visit!");
        }
        return quit;
    }
}
