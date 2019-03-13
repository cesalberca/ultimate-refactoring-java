package safeUnwrap;

public class Model {
    private String color;
    private int amount;

    public Model(String color, int amount) {
        this.color = color;
        this.amount = amount;
    }

    public String getColor() {
        return color;
    }

    public int getAmount() {
        return amount;
    }
}
