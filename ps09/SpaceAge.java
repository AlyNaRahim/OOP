package ps09;

public class SpaceAge {
    private static final double EARTH_YEARS_IN_SECONDS = 365.25 * 24 * 60 * 60;
    private int ageInSeconds;

    public SpaceAge(int ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    public double AgeOnEarth(){
        return ageInSeconds / EARTH_YEARS_IN_SECONDS;
    }

    public double OnMercury() {
        return AgeOnEarth() / 0.2408467;
    }

    public double OnVenus() {
            return AgeOnEarth() / 0.61519726;
        }

    public double OnMars() {
        return AgeOnEarth() / 1.8808158;
    }

    public double OnJupiter() {
        return AgeOnEarth() / 11.862615;
    }

    public double OnSaturn() {
        return AgeOnEarth() / 29.447498;
    }

    public double OnUranus () {
        return AgeOnEarth() / 84.016846;
    }

    public double OnNeptune () {
        return AgeOnEarth() / 164.79132;
    }

}
