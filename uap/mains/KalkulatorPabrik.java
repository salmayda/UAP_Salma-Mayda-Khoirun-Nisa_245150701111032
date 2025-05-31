package uap.mains;

import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP");
        System.out.println("NIM");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double R = sc.nextDouble(); // 7
        System.out.print("Isikan radius   : ");
        double r = sc.nextDouble(); // 3.5

        Torus torus = new Torus(R, r);
        System.out.println("=============================================");
        torus.printInfo();
        System.out.println("Massa dalam kg  : " + torus.toKilogram());
        System.out.println("Biaya kirim     : Rp" + torus.biayaKirim());

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radiusSphere = sc.nextDouble(); // 21

        Sphere sphere = new Sphere(radiusSphere);
        System.out.println("=============================================");
        sphere.printInfo();
        System.out.println("Massa dalam kg  : " + sphere.toKilogram());
        System.out.println("Biaya kirim     : Rp" + sphere.biayaKirim());
        System.out.println("=============================================");

        sc.close();
    }
}
