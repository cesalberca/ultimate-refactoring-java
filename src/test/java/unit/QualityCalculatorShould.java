package unit;

import org.junit.Test;
import replacePrimitiveConstantsWithType.QualityCalculator;
import replacePrimitiveConstantsWithType.Quality;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class QualityCalculatorShould {

    @Test
    public void calculate_score() throws Exception {
        QualityCalculator calculator = new QualityCalculator();
        calculator.rateFacilities(Quality.EXCELLENT);
        calculator.rateLocation(Quality.EXCELLENT);

        assertThat(calculator.getScore()).isEqualTo(12);
    }
}
