package module3.offline.task2;

public class Convertetion {
    private final double raid;


    public Convertetion(double raid) {
        this.raid = raid;
    }

    public double convert(double grivna) {
        double cur = grivna / raid;
        return cur;
    }
}
