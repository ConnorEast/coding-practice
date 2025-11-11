/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumerals;
import java.util.Scanner;
/**
 *
 * @author givem
 */
public class RomanNumerals {

    
    
    
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int number;
        System.out.println("Please Insert a number between 1 and 10: ");
        number = input.nextInt();   
        
        switch(number){
        
            case 1:
                System.out.println("The Number 1 is the Equivalent of the" +
                        " Roman Numeral .I.");
                break;
        
             case 2:
                System.out.println("The number 2 is the Equivalent of the" +
                        " Roman Numeral .II.");
                break;
             case 3:
                System.out.println("The number 3 is the Equivalent of the" + 
                        " Roman Numeral .III." );
                break;
             case 4:
                System.out.println("The number 4 is the Equivalent of the" + 
                       " Roman Numeral .IV.");
                break;
             case 5:
                System.out.println("The number 5 is the Equivalent of the" +
                        " Roman numeral .V.");
                break;        
             case 6:
                System.out.println("The number 6 is the Equivalent of the" +
                        " Roman Numeral .VI.");
                break;
             case 7:
                System.out.println("The number 7 is the Equivalent of the" +
                        " Roman Numeral .VII.");
                break;
             case 8:
                System.out.println("The number 8 is the Equivalent of the" + 
                        " Roman Numeral .VIII.");
                break;
             case 9:
                System.out.println("The number 9 is the Equivalent of the" + 
                        " Roman Numeral .IX.");
                break;        
             case 10:
                System.out.println("The number 10 is the Equivalent of the" +
                        " Roman Numeral .X.");
                break;      
             default: System.out.println("Answer not available");
                
                
                
                
        
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
