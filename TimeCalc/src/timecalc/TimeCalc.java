/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecalc;

import java.util.Scanner;

/**
 *
 * @author givem
 */
public class TimeCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner input = new Scanner(System.in);
        int timeSpent, days, hours, minutes, totalTime;
        days = 86400;
        hours = 3600;
        minutes = 60;
        
        
        
       System.out.println("Welcome to the time clock.");
               System.out.println("Please Insert how many minutes you have" +
                       "been working on your project.: ");
        timeSpent = input.nextInt();  
    if(timeSpent >= days)
    {
        totalTime = timeSpent / days;
            System.out.println("You have been at this for " + totalTime +" Days");
        }
    else if(timeSpent >= hours)
            {
            totalTime = timeSpent / hours;
            System.out.println("You have been at this for " + totalTime +
                    " hours");
    } 
    else if(timeSpent >= 60)
             {
     totalTime = timeSpent / minutes;
            System.out.println("You have been at this for " + totalTime +
                    " minutes");
    
    } else {
        if(timeSpent > 59){
                System.out.println("Sorry, You must have done something funny" + 
              " because I can't seem to find the answer.");
        } else{
              System.out.println("Anything under 60 seconds is invalid");
    }
    
    }
    
        
        
    }
    
}
