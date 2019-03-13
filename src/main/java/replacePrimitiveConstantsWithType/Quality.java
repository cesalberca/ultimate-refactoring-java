package replacePrimitiveConstantsWithType;

public enum Quality {
    EXCELLENT(10, 2), GOOD(7, 1), BAD(-2, -1), TERRIBLE(-10, -2);

    public final int locationScore;
    public final int facilityScore;

    Quality(int locationScore, int facilityScore) {
        this.locationScore = locationScore;
        this.facilityScore = facilityScore;
    }
}