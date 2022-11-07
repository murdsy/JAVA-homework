public class ShowStudent2 {
    public static void main(String[] args){
        Student student = new Student();
        student.IDnumber = Student.setIDNumber();
        student.NoOfCredit = Student.setNoOfCredit();
        student.NoOfPoints = Student.setNoOfPoints();
        student.gradeAvg = Student.setGPA(student.gradeAvg, student.NoOfCredit, student.NoOfPoints);
        Student.displayValues(student.IDnumber, student.NoOfCredit, student.NoOfPoints, student.gradeAvg);
    }
}
