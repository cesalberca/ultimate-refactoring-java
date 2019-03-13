package untestableLegacy;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class EncryptorTest {

    @Test
    public void should_displace_two_characters() {
        final Encryptor encryptor = new WordEncryptor();

        final String encrypted = encryptor.cryptWord("hello");

        assertEquals("jgnnq", encrypted);
    }

    @Test
    public void should_displace_two_character() {
        final Encryptor encryptor = new WordToNumberEncryptor();

        final String encrypted = encryptor.cryptWord("world");

        assertEquals("121113116110102", encrypted);
    }

    @Test
    public void cryptSentence() {
        final Encryptor encryptor = new WordEncryptor();

        final String encrypted = encryptor.cryptSentence("hello world!");

        assertEquals("jgnnq\"yqtnf#", encrypted);
    }

    @Test
    public void get_word_with_partial_sentence() {
        final Encryptor encryptor = new WordEncryptor();

        final String encrypted = encryptor.cryptWord("hello", "ho");

        assertEquals("jellq", encrypted);
    }

    @Test
    public void print_words() {
        final Encryptor encryptor = Mockito.spy(new WordEncryptor());

        encryptor.printWords("hello world");

        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(encryptor, Mockito.times(2)).log(argumentCaptor.capture());

        assertEquals("hello", argumentCaptor.getAllValues().get(0));
        assertEquals("world", argumentCaptor.getAllValues().get(1));
    }
}