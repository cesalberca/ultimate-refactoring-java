package untestableLegacy;

public class WordEncryptor extends Encryptor {
    @Override
    public String encrypt(int character) {
        return String.valueOf((char) character);
    }
}
