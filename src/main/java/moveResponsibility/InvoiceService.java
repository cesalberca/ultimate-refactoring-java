package moveResponsibility;

import java.math.BigDecimal;

public class InvoiceService {
    public String calculateNetAmount(String amount, String tax) {
        Invoice invoice = new Invoice(new BigDecimal(amount), new BigDecimal(tax));
        return invoice.getSubtract()
                .toString();
    }

}
