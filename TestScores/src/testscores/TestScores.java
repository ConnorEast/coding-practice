/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testscores;
import java.util.Scanner;

/**
 *
 * @author givem
 */
public class TestScores {
private int score, test1, test2, test3;
char grade;
Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */


private void setTestScore(){
        int data1, data2, data3;
        System.out.println("1st testScore: ");
        data1 = input.nextInt();  
        test1 = data1; 
        
        System.out.println("2nd testScore: ");
        data2 = input.nextInt();  
        test2 = data2; 
        
        System.out.println("3rd testScore: ");
        data3 = input.nextInt();  
        test3 = data3; 
}

public void setTestAverage(){
score = (test1 + test2+ test3)/3;
}

public char setLetterGrade(){
if(score < 60)
{
grade = 'f';    
}
else
{
if(score < 70){
grade = 'D';    
} 
else {  
if(score < 80){
grade = 'C';   
}    
else{ 
if(score < 90){
grade = 'B';   
}    
else {
grade='A'; 
}      
}
}
}
    return grade;
}



public int getTestScore1(){
return test1; 
}
public int getTestScore2(){
return test2; 
}
public int getTestScore3(){
return test3; 
}

public int getTestAverage(){
return score; 
}



    public static void main(String[] args) {
        // TODO code application logic here
        TestScores test = new TestScores();
        test.setTestScore();
        test.getTestScore1();
        test.getTestScore2();
        test.getTestScore3();
        test.setTestAverage();
        test.getTestAverage();
        test.setLetterGrade();
        System.out.println("Your average was a " + test.score + 
                " Which means you got a "+ test.grade);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
