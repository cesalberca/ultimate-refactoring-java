package moveResponsibility;

import java.math.BigDecimal;

public class Invoice {
    public final BigDecimal grossAmount;
    public final BigDecimal taxPercentage;
    public int numberOfItems;

    public Invoice(BigDecimal grossAmount, BigDecimal taxPercentage) {
        this.grossAmount = grossAmount;
        this.taxPercentage = taxPercentage;
    }

    public String calculateNetAmount() {
        return grossAmount.subtract(
                grossAmount.multiply(
                        taxPercentage.divide(
                                new BigDecimal("100")
                        )))
                .toString();
    }
}
