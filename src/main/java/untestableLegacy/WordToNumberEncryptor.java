package untestableLegacy;

public class WordToNumberEncryptor extends Encryptor {
    @Override
    public String encrypt(int character) {
        return String.valueOf(character);
    }
}
