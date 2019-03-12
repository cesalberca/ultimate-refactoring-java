package signatureChange;

public final class Id {

    private int code;

    private Id(int code) {
        this.code = code;
    }

    public boolean isAdmin() {
        return code == 12345;
    }

    public static Id valueOf(int code) {
        return new Id(code);
    }
}
