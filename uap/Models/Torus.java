package uap.models;

import uap.bases.BaseCetakan;
import uap.interfaces.HitungBiaya;
import uap.interfaces.KonversiMassa;

public class Torus extends BaseCetakan implements HitungBiaya, KonversiMassa {
    private double R;
    private double r;

    public Torus(double R, double r) {
        this.R = R;
        this.r = r;
        hitung();
    }

    @Override
    public void hitung() {
        volume = 2 * PI * PI * R * r * r;
        luasPermukaan = 4 * PI * PI * R * r;
        massa = luasPermukaan * ketebalan;
    }

    @Override
    public double toKilogram() {
        return massa / 1000;
    }

    @Override
    public int biayaKirim() {
        double kg = toKilogram();
        return (int) Math.ceil(kg) * 5000;
    }
}
