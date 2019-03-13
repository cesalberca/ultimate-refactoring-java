package untestableLegacy;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptorTest {

    @Test
    public void should_displace_two_characters() {
        final Encryptor encryptor = new WordEncryptor();

        final String encrypted = encryptor.cryptWord("abc");

        assertEquals("cde", encrypted);
    }

    @Test
    public void should_displace_two_character() {
        final Encryptor encryptor = new WordToNumberEncryptor();

        final String encrypted = encryptor.cryptWordToNumbers("abc");

        assertEquals("99100101", encrypted);
    }
}