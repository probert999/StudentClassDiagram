package com.probert999.studentclass;

import com.probert999.studentclass.model.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StudentClassTest {

    @Test
    public void testCreateStudent() {

        Student student = new Student("Paul", 'F', 5);

        assertEquals("Incorrect name set", "Paul", student.getName());
        assertEquals("Incorrect grade set", 'F', student.getGrade());
        assertEquals("Incorrect group set", 5, student.getGroup());
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
        assertEquals("Incorrect grade after upgrade from F", 'E', student.getGrade());

        student.upgrade();
        assertEquals("Incorrect grade after upgrade from E", 'D', student.getGrade());

        student.upgrade();
        assertEquals("Incorrect grade after upgrade from D", 'C', student.getGrade());

        student.upgrade();
        assertEquals("Incorrect grade after upgrade from C", 'B', student.getGrade());

        student.upgrade();
        assertEquals("Incorrect grade after upgrade from B", 'A', student.getGrade());

        student.upgrade();
        assertEquals("Incorrect grade after upgrade attempt from A", 'A', student.getGrade());

    }

    @Test
    public void testDowngrade() {

        Student student = new Student("Paul", 'A', 5);

        student.downgrade();
        assertEquals("Incorrect grade after downgrade from A", 'B', student.getGrade());

        student.downgrade();
        assertEquals("Incorrect grade after downgrade from B", 'C', student.getGrade());

        student.downgrade();
        assertEquals("Incorrect grade after downgrade from C", 'D', student.getGrade());

        student.downgrade();
        assertEquals("Incorrect grade after downgrade from D", 'E', student.getGrade());

        student.downgrade();
        assertEquals("Incorrect grade after downgrade from E", 'F', student.getGrade());

        student.downgrade();
        assertEquals("Incorrect grade after attempt to downgrade from F", 'F', student.getGrade());

    }

}
