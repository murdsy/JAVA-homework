/*
 * a.Create a class named Student. A Student has fields for an ID number, number of
credit hours earned, and number of points earned. (For example, many schools
compute grade point averages based on a scale of 4, so a three-credit-hour class in
which a student earns an A is worth 12 points.) Include methods to assign values
to all fields. A Student also has a field for grade point average. Include a method to
compute the grade point average field by dividing points by credit hours earned.
Write methods to display the values in each Student field. Save this class as
Student.java (d)


c. Create a constructor for the Student class you created. The constructor should
initialize each Student’s ID number to 9999, his or her points earned to 12, and
credit hours to 3 (resulting in a grade point average of 4.0). Write a program that
demonstrates that the constructor works by instantiating an object and displaying
the initial values. Save the application as ShowStudent2.java
 */

public class Student{
    int IDnumber;
    int NoOfCredit;
    int NoOfPoints;
    double gradeAvg;

    public static double calcultateGradeAvg(int NoOfCredit, int NoOfPoints){
        double gradeAvg = NoOfPoints/NoOfCredit;
        return gradeAvg;
    }

    public static void displayValues(int IDnumber, int NoOfCredit, int NoOfPoints, double gradeAvg){
        System.out.println("Student ID: "+IDnumber);
        System.out.println("Student No of Credit: "+NoOfCredit);
        System.out.println("Student No of Points: "+NoOfPoints);
        System.out.println("Student Grade Average: "+gradeAvg);
    }

    public static int setIDNumber(){ int IDnumber=9999; return IDnumber;}
    public static int setNoOfCredit(){int NoOfCredit=3; return NoOfCredit;}
    public static int setNoOfPoints(){int NoOfPoints=12; return NoOfPoints;}
    public static double setGPA(double gradeAvg, int NoOfCredit, int NoOfPoints){
        gradeAvg = calcultateGradeAvg(NoOfCredit, NoOfPoints);
        return gradeAvg;
    }
}