/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeepayroll;
import java.util.Scanner;
/**
 *
 * @author givem
 */
public class EmployeePayroll {
    private String employeeName;
    private double employee_ID_Nmbr;
    private int hourly_PayRate;
    private int employee_hoursWorked;
    Scanner input = new Scanner(System.in);
    
//Setter Methods
private void setEmployeeName(){
    String name;
        System.out.println("Name: ");
        name = input.nextLine();  
        employeeName = name;
        
    } 
    private  void setEmployeeID(){
        Double eMP_ID_NMBR;
        System.out.println("Company ID Number: ");
        eMP_ID_NMBR = input.nextDouble();  
        employee_ID_Nmbr = eMP_ID_NMBR; 
    }
    private void setEmployeePayRate(){
        int hourly_Pay;
        System.out.println("Hourly Pay: ");
        hourly_Pay = input.nextInt();  
        hourly_PayRate = hourly_Pay;
        
    }
    private void setEmployeeHoursWorked(){
        int hours_Worked;
        System.out.println("Hours Worked: ");
        hours_Worked = input.nextInt();  
        employee_hoursWorked = hours_Worked;
    }
    
    
// Getter Methods.

public String getEmployeeName(){
return employeeName;
}
public Double getEmployeeID(){
return employee_ID_Nmbr;
}
    public int getHourlyPay(){
    return hourly_PayRate;
}
    public int getHoursWorked(){
    return employee_hoursWorked;
}
    
      public static void main(String[] args){
      EmployeePayroll employee = new EmployeePayroll();
      employee.setEmployeeName();
      employee.getEmployeeName();
      employee.setEmployeeID();
      employee.getEmployeeID();
      employee.setEmployeePayRate();
      employee.getHourlyPay();
      employee.setEmployeeHoursWorked();
      employee.getHoursWorked();
      int totalEmployeePay = employee.hourly_PayRate * employee.employee_hoursWorked;
      System.out.println("Welcome ID number: " + employee.employee_ID_Nmbr);
      
      System.out.println("You have worked " + employee.employee_hoursWorked + 
              " hours at a pay rate of $" + employee.hourly_PayRate + " This means you"
                      + " have made a total gross pay of $" + totalEmployeePay);
          
          
          
      }


    
    
}
