/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainfallv2;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Collections;

public class RainfallV2 {
int highest = 0;
int lowest = 0;
String maxMonth = "";
String minMonth = "";

    private Scanner input = new Scanner(System.in);
    private ArrayList<Double> rainfall = new ArrayList<>();
    private DecimalFormat df = new DecimalFormat("###.##");
    private String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    
    public double getTotalRainfall(){
    double total = 0;
    int lowest = 0;
    for (int i = 1; i <=12; i++){
    System.out.println("Enter the rainfall for the month of #"+i+";");
    double inches = input.nextDouble();
    while(inches < 0){
    System.out.println("Apologies, A negative value has been calculated for"
      +"inches of rainfall. Negative values are not allowed, Please try again");
    inches = input.nextDouble();
    }
    
    
    
    total += inches;
    rainfall.add(inches);
    }
    
    return Double.parseDouble(df.format(total));
    }
    
    public double getAaverageRainfall(){
    double total = 0;
    for(double inches : rainfall){
    total += inches;
    }
    return Double.parseDouble(df.format(total/12));
    }
    
    public double getMaximumRainfall(){
    return Collections.max(rainfall);
    }
    public double getMinimumRainfall(){
    return Collections.min(rainfall);
    }

    public int getHighMonth(){
    highest = rainfall.indexOf(Collections.max(rainfall)) + 1;
    return highest;
    }
    
    public int getLowMonth(){
    lowest = rainfall.indexOf(Collections.min(rainfall)) + 1;
    return lowest;
    }
    
     public String getMaximumMonthName(){;
     int content = rainfall.indexOf(Collections.max(rainfall));
         return monthNames[content];
     }
         public String getMinimumMonthName(){
        int content = rainfall.indexOf(Collections.min(rainfall));
         return monthNames[content];
     }
    
    
    
    
    public static void main(String[] args) {
    RainfallV2 rain = new RainfallV2();
    System.out.println("Rainfall statistics:\n");
    System.out.println("\nTotal Rainfall: " + rain.getTotalRainfall());
    System.out.println("Average Rainfall: " + rain.getAaverageRainfall());
    System.out.println("Most Rainfall: " + rain.getMaximumRainfall() + " on the #" + rain.getHighMonth() + " month: " 
             + rain.getMaximumMonthName());
    System.out.println("Least Rainfall: " + rain.getMinimumRainfall() + " on the #" + rain.getLowMonth() + " month: " 
             + rain.getMinimumMonthName());
//   
        
        
        
        
        
    }
    
}
