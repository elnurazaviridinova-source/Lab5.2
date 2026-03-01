package encapsulation;

import java.util.ArrayList;

public class Student {
    private int student_id;
    private String student_name;
    private ArrayList<Integer> grades;


    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();

    }
    public int getStudent_id() {
        return student_id;

    }
    public String getStudent_name() {
        return student_name;

    }
    public ArrayList<Integer> getGrades() {
        return grades;

    }
    public void setStudent_id(int student_id) {
        this.student_id = student_id;

    }
    public void setStudent_name(String student_name) {
        this.student_name = student_name;

    }
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade added: " + grade);
        } else {
            System.out.println("Invalid grade! Must be between 0 and 100.");
            }
        }
        public void info() {
        System.out.println("ID: " + student_id);
        System.out.println("Name: " + student_name);
        System.out.println("Grades: " + grades);
    }
}
