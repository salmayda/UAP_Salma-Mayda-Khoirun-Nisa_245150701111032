package uap.models;

import uap.bases.BaseCetakan;
import uap.interfaces.HitungBiaya;
import uap.interfaces.KonversiMassa;

public class Sphere extends BaseCetakan implements HitungBiaya, KonversiMassa {
    private double r;

    public Sphere(double r) {
        this.r = r;
        hitung();
    }

    @Override
    public void hitung() {
        volume = 4 * PI * r * r * r / 3;
        luasPermukaan = 4 * PI * r * r;
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
