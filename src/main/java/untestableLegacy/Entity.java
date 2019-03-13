package untestableLegacy;

/*
 * This code has been extracted from OpenbravoERP:
 * https://code.openbravo.com/erp/stable/2.50-bp/file/cec9b1da72ed/src/org/openbravo/base/model/Entity.java
 */
public class Entity {
    private String name;
    private static final String ILLEGAL_CHARACTERS = "([/?,/*])";

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = removeIllegalChars(name);
    }

    private String removeIllegalChars(String fromName) {
        return fromName.replaceAll(ILLEGAL_CHARACTERS, "");
    }
}
