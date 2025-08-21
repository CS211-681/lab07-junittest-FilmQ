package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    static Student studentTestUnit1, studentTestUnit2;
    static StudentList studentListUnit1;

    @BeforeEach
    void initTestObjects() {
        studentListUnit1 = new StudentList();
        studentListUnit1.addNewStudent("1234567890", "UnemptyStudent1");
    }

    @Test
    void testAddNewStudent() {
        studentListUnit1.addNewStudent("6710450708", "UnemployedNisit");
        studentListUnit1.addNewStudent("6710450709", "UnemployedNisit2");
        assertEquals(true, studentListUnit1.findStudentById("6710450708").isId("6710450708"));
    }

    @Test
    void testAddNewStudent2() {
        studentListUnit1.addNewStudent("6710450708", "UnemployedNisit", 9999999);
        assertEquals(9999999, studentListUnit1.findStudentById("6710450708").getScore());
    }

    @Test
    void testFindStudentById() {
        assertEquals(true, studentListUnit1.findStudentById("1234567890").isId("1234567890"));
    }

    @Test
    void testFilterByName() {
        studentListUnit1.addNewStudent("123", "Bro");
        studentListUnit1.addNewStudent("124", "Broskii");
        studentListUnit1.addNewStudent("125", "Ayelmaoo");
        // System.out.println(studentListUnit1.filterByName("Bro").findStudentById("123").getId());
        assertEquals("123", studentListUnit1.filterByName("Bro").findStudentById("123").getId());
    }

    @Test
    void testGiveScoreToId() {
        studentListUnit1.addNewStudent("123", "Bob");
        studentListUnit1.giveScoreToId("123", 90);
        assertEquals(90, studentListUnit1.findStudentById("123").getScore());
    }

    @Test
    void testViewGradeOfId() {
        studentListUnit1.findStudentById("1234567890").addScore(99);
        assertEquals("A", studentListUnit1.viewGradeOfId("1234567890"));
    }
}