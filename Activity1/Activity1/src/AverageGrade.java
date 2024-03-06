/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class AverageGrade {
    
    public static String calculateEquivalent(double average){
        if(average > 99){
            return "1.00";
        }else if(average >= 96 && average <= 98){
            return "1.25";
        }else if(average >= 93 && average <= 95){
            return "1.50";
        }else if(average >= 90 && average <= 92){
            return "1.75";
        }else if(average >= 87 && average <= 89){
            return "2.00";
        }else if(average >= 84 && average <= 86){
            return "2.25";
        }else if(average >= 81 && average <= 83){
            return "2.50";
        }else if(average >= 78 && average <= 80){
            return "2.75";
        }else if(average >= 75 && average <= 77){
            return "3.00";
        }else{
            return "FAILED";
        }
    }
    
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);
        String[] subjects = {"Algorithms and Complexity(AC221)", "Information Management(CC115)", "Science, Technology and Society(GE704)",
            "The life and Works of Jose Rizal(GE709)", "Networks and Communications(NC225)", "Operating Systems(OS223)",
            "Team Sports(PE104)", "Programming Languages(PL222)"};
        int noOfSubjects = subjects.length;
        String cont = "";
               
        System.out.println("--------------Average grade calculator---------------------");
        do{
            double sum = 0;
            
            for(int i = 0; i < noOfSubjects; i++){
                System.out.print("Enter grade for " + subjects[i] + ": ");
                double grade = myObj.nextDouble();
                sum += grade;
                myObj.nextLine();
            }
            double average = sum / noOfSubjects;
            String equivalent = calculateEquivalent(average);

            System.out.println("\nAverage grade is: " + average);
            System.out.println("Equivalent: " + equivalent);
            
            System.out.print("\nDo you want to calculate more? y(yes)/n(no): ");
            cont = myObj.nextLine();
        }while("y".equals(cont) || "yes".equals(cont) || "Yes".equals(cont) || "YES".equals(cont));
        
    }
}
