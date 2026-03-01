package org.example.constructor;

public class Student {
    private int studentId;
    private String studentName;
    private int grade;

    public Student() {
        this.studentId = 0;
        this.studentName = "Unknown";
        this.grade = 0;

    }
    public Student(int studentId, String studentName, int grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }
    public int getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public int getGrade() {
        return grade;
    }
    public void info(){
        System.out.println("StudentId: " + studentId);
        System.out.println("StudentName: " + studentName);
        System.out.println("Grade: " + grade);
    }
}
