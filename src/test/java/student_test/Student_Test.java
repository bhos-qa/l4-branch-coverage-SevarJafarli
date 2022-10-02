package student_test;

import student.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import occupations.Occupations;

public class Student_Test {

    Student student = new Student("BS12343838", "Samara Aviens", "+28383233", Occupations.Business);

    @Test
    @DisplayName("Occupation Test")

    void testOccupation() {
        String actualData = student.getOccupation();
        String expectedData = "Business";
        assertEquals(expectedData, actualData);
    }

    @Test
    @DisplayName(" Email Setter Test")
    void testEmailSetter() throws Exception {
        String email = "samara_aliens@gmail.com";
        student.setEmailAddress(email);
        String expectedData = student.getEmailAddress();
        assertEquals(email, expectedData);
    }

    @Test
    @DisplayName("Fullname getter Test")
    void testFullnameGetter() {
        String actualData = student.getFullName();
        assertEquals("Samara Aviens", actualData);
    }
}
