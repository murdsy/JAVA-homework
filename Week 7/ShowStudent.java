/*
 * b.  Write a class named ShowStudent that instantiates a Student object from the
class you created and assign values to its fields. Compute the Student grade point
average, and then display all the values associated with the Student. Save the
application as ShowStudent.java

 */
public class ShowStudent {
    public static void main(String[] args){
        Student student = new Student();
        student.IDnumber = 5466;
        student.NoOfPoints = 853;
        student.NoOfCredit = 60;
        student.gradeAvg = Student.calcultateGradeAvg(student.NoOfCredit, student.NoOfPoints);
        Student.displayValues(student.IDnumber, student.NoOfCredit, student.NoOfPoints, student.gradeAvg);
    }
   

}
