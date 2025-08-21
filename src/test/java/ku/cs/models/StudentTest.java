package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static Student s1, s2;

    @Test
    @BeforeEach
    void initStudentObject() {
        s1 = new Student("6710450708", "Student test object 1");
        s2 = new Student("6710450709", "Student test object 2");
    }

    @Test
    void testCalculateGrade() {
        s1.addScore(80 + 1);
        assertEquals("A", s1.getGrade());
    }

    @Test
    void testAddScore() {
        s1.addScore(30.5);
        assertEquals(30.5, s1.getScore());
    }

    @Test
    void testChangeName() {
        s1.changeName("Super Gawk Gawk 9000");
        assertTrue(s1.getName().equals("Super Gawk Gawk 9000"));
    }

    @Test
    void testIsId() {
        String id = "6710450708";
        assertTrue(s1.isId(id));
    }

    @Test
    void testIsNameContains() {
        s1.changeName("Superman Superman Super");
        assertEquals(true, s1.isNameContains("Super"));
    }

    @Test
    void testToString() {
        // System.out.println(s1.toString());
        s1.addScore(10);
        String testString = "{id: '6710450708', name: 'Student test object 1', score: 10.0}";
        assertEquals(testString, s1.toString());
    }
}