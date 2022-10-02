package student;

import java.security.NoSuchAlgorithmException;
import md5utils.MD5Utils;
import validator.Validator;
import occupations.Occupations;

public class Student {
    String studentId;
    String fullName;
    String password;
    String phoneNumber;
    String emailAddress;
    Occupations occupation;

    public Student(String studentId, String fullName, String phoneNumber,
            Occupations occupation) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.occupation = occupation;
    }

    public String getFullName() {
        return fullName;

    }

    public String getOccupation() {
        return occupation.name();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) throws Exception {
        boolean isMatched = Validator.validateEmail(emailAddress);
        if (isMatched) {
            this.emailAddress = emailAddress;
        } else {
            throw new Exception("Email is not valid");

        }
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String encryptPassword(String password) {
        String encryptedPassword = "";
        try {
            encryptedPassword = MD5Utils.encryptMessage(password);

        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return encryptedPassword;
    }

    public void setPassword(String inputVal) {
        String encryptedPass = encryptPassword(inputVal);
        this.password = encryptedPass;
    }

    public static void main(String[] args) throws NoSuchMethodException, NoSuchAlgorithmException, Exception {
        Student student = new Student("IT137478", "Marc Jacobs", "+9947028388382", Occupations.IT);
        student.setEmailAddress("djdjdjd@gmail.com");
        student.setPassword("marc123");
        System.out.println(student.password);

    }
}
