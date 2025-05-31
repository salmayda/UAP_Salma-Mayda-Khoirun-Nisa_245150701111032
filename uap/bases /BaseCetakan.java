package uap.bases;

public abstract class BaseCetakan {
    protected static final double PI = 22.0 / 7;
    protected static final double ketebalan = 0.5;
    protected double volume;
    protected double luasPermukaan;
    protected double massa;

    public abstract void hitung();

    public void printInfo() {
        System.out.println("Volume          : " + volume);
        System.out.println("Luas permukaan  : " + luasPermukaan);
        System.out.println("Massa           : " + massa);
    }

    public double getMassa() {
        return massa;
    }
}
