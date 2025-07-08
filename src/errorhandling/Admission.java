package errorhandling;


public class Admission {
    
    String stdName;
    String stdGender;
    int stdAge;
    int stdGradeLevel;
    
    public Admission(String stdName, String stdGender, int stdAge, int stdGradeLevel){
        
        this.stdName = stdName;
        this.stdAge = stdAge;
        this.stdGender = stdGender;
        this.stdGradeLevel = stdGradeLevel;
    
    }   
    
    public void displayStudentAccount(){
    
        System.out.println("---------------------------------------------------");
        System.out.println("University of Mindanao");
        System.out.println("---------------------------------------------------");
        System.out.println("Student Name: "+ stdName);
        System.out.println("Age: "+ stdAge);
        System.out.println("Gender"+ stdGender);
        System.out.println("Grade Level"+ stdGradeLevel);
        System.out.println("");
        System.out.println("");
    }
    
    
}
