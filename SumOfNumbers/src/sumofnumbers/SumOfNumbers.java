/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofnumbers;
import java.util.Scanner;
/**
 *
 * @author givem
 */
public class SumOfNumbers {
    private int intChoice, sum, total;
    Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    private void setNumber(){
        int userInput;
        System.out.println("Please input a number: ");
        userInput = input.nextInt();  
        intChoice = userInput; 
    }
    
    
   
    public int getNumber(){
    return intChoice;
    }
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        SumOfNumbers codeiteration = new SumOfNumbers();
        codeiteration.setNumber();
        codeiteration.getNumber();
        if (codeiteration.intChoice > 1){
        int i = 1;
        while(i <= codeiteration.intChoice){
         codeiteration.total += i;
          i++;
        }
        
        codeiteration.sum = codeiteration.total / codeiteration.intChoice;
         System.out.println("Total = "+ codeiteration.total +";   sum = " + codeiteration.sum);
    } else{
        System.out.println("your number is not more then 1 and as such has no purpose being used by this program.");
        
        }
 }
}
