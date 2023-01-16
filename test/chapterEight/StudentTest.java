package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    @Test
    public void universityTest() {
        Student student = new Student();
        student.setName("Folahan");
        student.setSchool(University.UNILAG);
//      University.UNILAG.setFullName("Lagos Model College");
// You can change Enums fields

        System.out.println(student.getSchool().getFullName());
    }

    @Test
    public void getStateTest() {
        University[] universities = University.values();
        for (University university : universities) {
            System.out.println(university.getFullName());
        }

        University uniport = University.valueOf("UNIPORT");
        System.out.println(uniport.getState());
    }
}