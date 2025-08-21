package ku.cs.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ku.cs.models.Student;
import ku.cs.models.StudentList;

public class StudentHardCodeDatasourceTest {
    static StudentHardCodeDatasource testDatasource;

    @BeforeEach
    void init() {
        testDatasource = new StudentHardCodeDatasource();
    }

    @Test
    void testReadData() {
        StudentList testStudentHardcodeDatasource = testDatasource.readData();
        String studentsArrayStringRepresentation = "";
        
        for(Student s : testStudentHardcodeDatasource.getStudents()) {
            studentsArrayStringRepresentation = studentsArrayStringRepresentation + s.toString() + "\n";
        }

        assertEquals("{id: '6710400001', name: 'First', score: 0.0}\n{id: '6710400002', name: 'Second', score: 0.0}\n{id: '6710400003', name: 'Third', score: 0.0}\n{id: '6710400004', name: 'Fourth', score: 0.0}\n", studentsArrayStringRepresentation);
    }
}
