/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package risk_calculations_cybersec;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Arrays;
/**
 *
 * @author givem
 */
public class Risk_Calculations_CyberSec {
    private double singleLossExpectancy, annualRateOfOccurance, annualLossExpectancy;
    private ArrayList<Double> sleDataList = new ArrayList<>();
    private DecimalFormat df = new DecimalFormat("###.##");
    private Scanner input = new Scanner(System.in);
    private double sleTotal, eftotal;
    
    public double sleInformationCalc(){
        sleTotal = 0;
        System.out.println("Please insert the amount of items you would like to add values too.\n");
        int integerchoice = input.nextInt();
        for(int i = 1; i <= integerchoice; i++){
        System.out.println("Please insert the value for item #"+i);
        double singularItemPrice = input.nextDouble();
       while(singularItemPrice < 0){
       System.out.println("Are you sure you meant to input a negative value? Please try again");
       singularItemPrice = input.nextDouble();
       }
        sleTotal += singularItemPrice;
        sleDataList.add(singularItemPrice);
        }
        
        return Double.parseDouble(df.format(sleTotal));
}
    
    
    public void sleValueConfirmation(){
            String answer = input.nextLine();
            System.out.println("Please state 'Yes' or 'No'");
        switch(answer){
            case "yes":
                System.out.println("You have stated the value " +sleTotal +" is correct");
                break;
            case "no":
                System.out.println("You have stated the value " +sleTotal +" is incorrect... Please begin again");
                sleInformationCalc();
            default:
                sleValueConfirmation();
    
    }}
    public void efCalculation(){
    System.out.println("How likely is it that your product will be threatened?");
    eftotal = input.nextDouble();
    double efPercentage = eftotal/100;
if (eftotal < 0){
System.out.println("This value cannot be negative");
efCalculation();
}
else if(eftotal > 100){
System.out.println("The value cannot exceed the natural value 100");
efCalculation();
}
else{
     System.out.println("\nThe value you have typed is " + eftotal +". which calculates to be " + efPercentage +"%" );
     singleLossExpectancy = sleTotal * efPercentage;
     System.out.println("The total loss you would face in a single instance of loss would be $" +singleLossExpectancy);
        }
    }
    
    
    public void 
    
    
    
    
    
    
    
    
    
    public void aroCalculation() {
    
    
    
    }
    
    
    
    
    
   
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Risk_Calculations_CyberSec cs = new Risk_Calculations_CyberSec();
        cs.sleInformationCalc();
        for(int i = 0; i < cs.sleDataList.size(); i++){
        System.out.println("Value "+i+":  "+(cs.sleDataList.get(i)).toString());
        }
        System.out.println("\nThe Total value equals $" + cs.sleTotal + "In total. Does this look correct?\n");
        cs.sleValueConfirmation();
        cs.efCalculation();
        
    }
    
}
