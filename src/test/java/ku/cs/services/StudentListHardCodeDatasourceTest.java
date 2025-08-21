package ku.cs.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ku.cs.models.Student;
import ku.cs.models.StudentList;

public class StudentListHardCodeDatasourceTest {
    static StudentListHardCodeDatasource testDatasource;

    @BeforeEach
    void init() {
        testDatasource = new StudentListHardCodeDatasource();
    }

    @Test
    void testReadData() {
        StudentList testStudentListHardcodeDatasource = testDatasource.readData();
        String studentsArrayStringRepresentation = "";
        
        for(Student s : testStudentListHardcodeDatasource.getStudents()) {
            studentsArrayStringRepresentation = studentsArrayStringRepresentation + s.toString() + "\n";
        }

        System.out.println(studentsArrayStringRepresentation);
        assertEquals("{id: '6710400001', name: 'First', score: 0.0}\n{id: '6710400002', name: 'Second', score: 0.0}\n{id: '6710400003', name: 'Third', score: 0.0}\n{id: '6710400004', name: 'Fourth', score: 0.0}\n{id: '6710400005', name: 'Fifth', score: 0.0}\n{id: '6710400006', name: 'Sixth', score: 0.0}\n{id: '6710400007', name: 'Seventh', score: 0.0}\n{id: '6710400008', name: 'Eighth', score: 0.0}\n{id: '6710400009', name: 'Ninth', score: 0.0}\n{id: '67104000010', name: 'Tenth', score: 0.0}", studentsArrayStringRepresentation);
    }
}
