
package errorhandling;

import java.util.Scanner;

public class ErrorHandling {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        
        System.out.println("Enter Student Name: ");
        String Name = scn.nextLine();
        System.out.println("Enter Age: ");
        int Age = scn.nextInt();
        System.out.println("Gender: ");
        String Gender = scn.nextLine();
        System.out.println("Grade Level: ");
        int GradeLevel= scn.nextInt();
        
        Admission admission = new Admission(Name, Gender, Age, GradeLevel);   
        
        admission.displayStudentAccount();
        
        
        
    }
    
}
