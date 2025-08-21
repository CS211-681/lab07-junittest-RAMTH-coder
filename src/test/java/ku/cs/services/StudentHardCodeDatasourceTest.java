package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    StudentHardCodeDatasource datasource;

    @BeforeEach
    void setUp() {
        datasource = new StudentHardCodeDatasource();
    }

    @Test
    @DisplayName("ทดสอบการอ่านข้อมูลนักศึกษาที่ถูก hardcode ไว้")
    void testReadData() {
        StudentList list = datasource.readData();

        // ตรวจสอบจำนวน
        assertEquals(4, list.getStudents().size());

        // ตรวจสอบนักศึกษาบางคน
        assertEquals("First", list.findStudentById("6710400001").getName());
        assertEquals("Second", list.findStudentById("6710400002").getName());
        assertEquals("Third", list.findStudentById("6710400003").getName());
        assertEquals("Fourth", list.findStudentById("6710400004").getName());
    }

    
}
