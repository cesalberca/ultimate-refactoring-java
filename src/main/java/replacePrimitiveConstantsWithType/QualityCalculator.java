package replacePrimitiveConstantsWithType;

public class QualityCalculator {
    private int score = 0;

    public void rateLocation(Quality quality) {
        score += quality.locationScore;
    }

    public void rateFacilities(Quality quality) {
        score += quality.facilityScore;
    }

    public int getScore() {
        return score;
    }
}
