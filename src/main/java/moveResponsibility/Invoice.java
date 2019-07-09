package moveResponsibility;

import java.math.BigDecimal;

public class Invoice {
    private final BigDecimal grossAmount;
    private final BigDecimal taxPercentage;

    public Invoice(BigDecimal grossAmount, BigDecimal taxPercentage) {
        this.grossAmount = grossAmount;
        this.taxPercentage = taxPercentage;
    }

    BigDecimal getSubtract() {
        return grossAmount.subtract(
                grossAmount.multiply(
                        taxPercentage.divide(
                                new BigDecimal("100")
                        )));
    }
}
