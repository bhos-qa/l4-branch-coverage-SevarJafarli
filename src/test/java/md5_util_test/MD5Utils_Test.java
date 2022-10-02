package md5_util_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import md5utils.MD5Utils;

public class MD5Utils_Test {
    @Test
    @DisplayName("MD5 Test")
    void testMD5Hash() throws NoSuchAlgorithmException {
        String plainText = "user";
        String hashedPassword = "ee11cbb19052e40b07aac0ca060c23ee";
        assertEquals(hashedPassword, MD5Utils.encryptMessage(plainText));

    }
}
