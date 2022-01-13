package com.probert999.studentclass;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.runners.JUnit4;

public class StudentClassTest {

    @Test
    public void testCreateStudent() {

        Student student = new Student("Paul", 'F', 5);

        assertEquals("Incorrect name set", "Paul", student.getName());


        assertEquals("Incorrect grade set", 'F', student.getGrade());

    }

    @Test
    public void testCreateStudentWithInvalidGrade() {
        assertThrows("Created student with invalid grade",
                IllegalArgumentException.class, () -> new Student("Paul", 'X', 5));
    }

    @Test
    public void testCreateStudentWithInvalidGroup() {
        assertThrows("Created student with invalid group",
                IllegalArgumentException.class, () -> new Student("Paul", 'B', 99));
    }


    @Test
    public void testUpgrade() {

        Student student = new Student("Paul", 'F', 5);

        student.upgrade();
        assertEquals("Incorrect grade after upgrade", 'E', student.getGrade());

        student.upgrade();
        assertEquals("Incorrect grade after upgrade", 'D', student.getGrade());

        student.upgrade();
        assertEquals("Incorrect grade after upgrade", 'C', student.getGrade());

        student.upgrade();
        assertEquals("Incorrect grade after upgrade", 'B', student.getGrade());

        student.upgrade();
        assertEquals("Incorrect grade after upgrade", 'A', student.getGrade());

        student.upgrade();
        assertEquals("Incorrect grade after upgrade", 'A', student.getGrade());

    }

    @Test
    public void testDowngrade() {

        Student student = new Student("Paul", 'A', 5);

        student.downgrade();
        assertEquals("Incorrect grade after downgrade", 'B', student.getGrade());

        student.downgrade();
        assertEquals("Incorrect grade after downgrade", 'C', student.getGrade());

        student.downgrade();
        assertEquals("Incorrect grade after downgrade", 'D', student.getGrade());

        student.downgrade();
        assertEquals("Incorrect grade after downgrade", 'E', student.getGrade());

        student.downgrade();
        assertEquals("Incorrect grade after downgrade", 'F', student.getGrade());

        student.downgrade();
        assertEquals("Incorrect grade after downgrade", 'F', student.getGrade());

    }


    @Test
    public void isGroupSet() {
        Student student = new Student("Dave", 'C', 1);

        assertEquals("Group value is incorrect", 1, student.getGroup());
    }

}
