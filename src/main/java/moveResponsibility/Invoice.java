package moveResponsibility;

import java.math.BigDecimal;

public class Invoice {
    private final Amount grossAmount;
    private final Amount taxPercentage;
    public int numberOfItems;

    public Invoice(Amount grossAmount, Amount taxPercentage) {
        this.grossAmount = grossAmount;
        this.taxPercentage = taxPercentage;
    }

    public String calculateNetAmount() {
        return grossAmount.value.subtract(
                grossAmount.value.multiply(
                        taxPercentage.value.divide(
                                new BigDecimal("100")
                        )))
                .toString();
    }
}
