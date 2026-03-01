package org.example.constructor;

public class Classroom {
    private String className;
    private String[] students;

    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;

    }

    public void info() {
        System.out.println("ClassName: " + className);
        System.out.println("Students: ");
        if (students != null && students.length > 0) {
            for (int i = 0; i < students.length; i++) {
                System.out.print(students[i]);
                if (i != students.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("No students in the class.");
        }
    }
}
