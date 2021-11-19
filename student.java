import java.util.Scanner;

public class student {
    private int studentID;
    private int gradeLevel;
    private double gradePointAvg;
    private String studentName;  
       
    public student() {
        this.studentID = 0;
        this.gradeLevel = 0;
        this.gradePointAvg = 0;
        this.studentName = "";
    }
    public student(int studentID, int gradeLevel, double gradePointAvg, String studentName) {
        this.studentID;
        this.gradeLevel;
        this.gradePointAvg;
        this.studentName;
    }
    

    
public static void calcGPA() {
    int grade0;
    int grade1;
    int grade2;
    int grade3;
    double newGPA;
}
    Scanner myScanner = new Scanner(System.in);

    System.out.println("What is the first grade?");
    grade0= myScanner.nextInt();
    System.out.println("What is the second grade?");
    grade1= myScanner.nextInt();
    System.out.println("What is the third grade?");
    grade2= myScanner.nextInt();
    System.out.println("What is the fourth grade?");
    grade3= myScanner.nextInt();

    newGPA = (grade0 + grade1 + grade2 + grade3) / 4;
    System.out.print("The new GPA is");
    System.out.println(newGPA);
    
public static void newline() 
    System.out.println();

public static void threeline(){

    newline();
    newline();
    newline();

}


public static void assignLunch(int gradeLevel){
    String lunchPeriod;
    
    if(gradeLevel == 9){
        lunchPeriod ="First Lunch";
        System.out.print("This student has");
        System.out.println(lunchPeriod);
    }else if(gradeLevel == 10) {
        lunchPeriod = "Second Lunch";
        System.out.print("This student has");
        System.out.println(lunchPeriod);
    
    }else if(gradeLevel == 11) {
        lunchPeriod = "Third Lunch";
        System.out.print("This student has");
        System.out.println(lunchPeriod);
    }else if(gradeLevel == 12) {
        lunchPeriod = "Off Campus Lunch";
        System.out.print("This student has");
        System.out.println(lunchPeriod);
    }
}

public static void mathPractice(){
    
}

public static void main(String[] args){
}

    

















