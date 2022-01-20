package com.probert999.studentclass.app;

import com.probert999.studentclass.model.Student;

public class Main {

    private static void printStudentStatus(Student student) {
        if (student != null) {
            System.out.printf("Student: %s in group %d has an %s grade%n%n",
                    student.getName(), student.getGroup(), student.getGrade());
        }
    }

    public static void main(String[] args) {

        System.out.println("Create Student");

        Student student = new Student("Paul", 'F', 5);
        printStudentStatus(student);

        System.out.println("Call upgrade");
        student.upgrade();
        printStudentStatus(student);

        System.out.println("Call downgrade");
        student.downgrade();
        printStudentStatus(student);

        System.out.println("Call downgrade again");
        student.downgrade();
        printStudentStatus(student);

    }

}
