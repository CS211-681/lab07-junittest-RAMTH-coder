package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    static StudentList studentList = new StudentList();

    @BeforeEach
    void setUp() {
        studentList = new StudentList();
        studentList.addNewStudent("6710405133","P");
    }
    @Test
    @DisplayName("ทดสอบการเพิ่มนักศึกษา")
    void testAddNewStudent() {
        assertEquals(1, studentList.getStudents().size());
        assertEquals("P", studentList.getStudents().get(0).getName());
        assertEquals("6710405133", studentList.getStudents().get(0).getId());
    }

    @Test
    @DisplayName("ทดสอบการหานักศึกษาด้วยรหัส")
    void testFindStudentById() {
        studentList.addNewStudent("6710405532", "Leo");
        Student found = studentList.findStudentById("6710405532");
        assertNotNull(found);
        assertEquals("Leo", found.getName());
    }
    @Test
    @DisplayName("ทดสอบการค้นหาด้วยชื่อนักศึกษา")
    void testFilterByName() {
        studentList.addNewStudent("6710405123", "Dave");
        studentList.addNewStudent("6710405145", "Daisy");
        studentList.addNewStudent("6710405222", "Mark");

        StudentList filtered = studentList.filterByName("Da");
        assertEquals(2, filtered.getStudents().size());
    }
    @Test
    @DisplayName("ทดสอบการให้คะแนนกับนักศึกษาด้วยรหัส")
    void testGiveScoreToId() {
        studentList.addNewStudent("6710405155", "Eva");
        studentList.giveScoreToId("6710405155", 50);
        assertEquals(50, studentList.findStudentById("6710405155").getScore());
    }
    @Test
    @DisplayName("ทดสอบการดูเกรดนักศึกษา")
    void testViewGradeOfId() {
        studentList.addNewStudent("6710405666", "Katey", 85);
        assertEquals("A", studentList.viewGradeOfId("6710405666"));
    }


}