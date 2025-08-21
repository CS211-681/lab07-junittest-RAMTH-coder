package ku.cs.models;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;
//    @BeforeAll
//    static void initAll() {
//
//    }

    @BeforeEach
    void setUp() {
        s = new Student("6710405133","P");
    }




    @Test
    @DisplayName("ทดสอบการเพิ่มคะเเนน")
    void testAddScore(){

        s.addScore(10);
        assertEquals(10,s.getScore());
    }

    @Test
    @DisplayName("ทดสอบเกรด")
    void testCalculateGrade(){

        s.addScore(84);
        assertEquals("A",s.getGrade());
    }
    @Test
    @DisplayName("ทดสอบการเปลี่ยนชื่อ")
    void testChangeName_validName() {
        s.changeName("Bob");
        assertEquals("Bob", s.getName());
    }

    @Test
    @DisplayName("ทดสอบรหัสนักศึกษา")
    void testIsID(){
        assertTrue(s.isId("6710405133"));

    }
    @Test
    @DisplayName("เช็คชื่อว่ามีตัวอักษร")
    void testIsNameContainsTrue() {
        assertTrue(s.isNameContains("P")); // case-insensitive
    }
}