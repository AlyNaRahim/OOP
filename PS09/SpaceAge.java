public class SpaceAge {
    private static final double EARTH_YEARS_IN_SECONDS = 365.25 * 24 * 60 * 60;
    private double age;

    public SpaceAge(double age) {
        this.age = age;
    }

    public double onEarth(){
        double val = (age / EARTH_YEARS_IN_SECONDS) * 100;
        val = Math.round(val);
        val = val /100;
        return val;
    }

    public double onMercury() {
        double val = (onEarth() / 0.2408467) * 100;
        val = Math.round(val);
        val = val /100;
        return val;
    }

    public double onVenus() {
        double val = (onEarth() / 0.61519726) * 100;
        val = Math.round(val);
        val = val /100;
        return val;
        }

    public double onMars() {
        double val = (onEarth() / 1.8808158) * 100;
        val = Math.round(val);
        val = val /100;
        return val;
    }

    public double onJupiter() {
        double val = (onEarth() / 11.862615) * 100;
        val = Math.round(val);
        val = val /100;
        return val;
    }

    public double onSaturn() {
        double val = (onEarth() / 29.447498) * 100;
        val = Math.round(val);
        val = val /100;
        return val;
    }

    public double onUranus () {
        double val = (onEarth() / 84.016846) * 100;
        val = Math.round(val);
        val = val /100;
        return val;
    }

    public double onNeptune () {
        double val = (onEarth() / 164.79132) * 100;
        val = Math.round(val);
        val = val /100;
        return val;
    }

    @Override
    public String toString() {
        return "SpaceAge{" +
                "ageInSeconds=" + age +
                '}';
    }
}
