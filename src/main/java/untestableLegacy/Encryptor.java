package untestableLegacy;

import java.security.InvalidParameterException;

public abstract class Encryptor {

    public abstract String encrypt(int character);

    public String cryptWord(String word) {
        return cryptSentence(word);
    }

    public String cryptWord(String word, String charsToReplace) {
        if (word.contains(" "))
            throw new InvalidParameterException();

        char[] wordArray = word.toCharArray();
        char[] replacement = charsToReplace.toCharArray();
        char[] result = wordArray.clone();
        for (int i = 0; i < wordArray.length; i++) {
            for (int j = 0; j < replacement.length; j++) {
                if (replacement[j] == wordArray[i]) {
                    int charValue = wordArray[i];
                    result[i] = (char) (charValue + 2);
                }
            }
        }
        return String.valueOf(result);
    }

    public String cryptSentence(String word) {
        char[] sentenceArray = word.toCharArray();
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            int charValue = sentenceArray[i];
            newWord += encrypt(charValue + 2);
        }

        return newWord;
    }

    public void printWords(String sentence) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            log(word);
        }
    }

    void log(String word) {
        System.out.print("<" + word + ">");
    }
}
