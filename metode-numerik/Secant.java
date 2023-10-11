/*
 * perhitungan menggunakan Metode Secant
 */

package Metode;
import Metode.Fungsi.*;
/**
 *
 * @author dkakunsi
 */
public class Secant extends Metode{
    protected int  i;

    public Secant() {
        super();
        this.i = 0;
    }

    public double proses() {
        secant scn = new secant();
        double Xbaru = 0;

        switch(pilihan) {
            case 1:Xbaru = scn.proses1();
                break;
            case 2:Xbaru = scn.proses2();
                break;
            case 3:Xbaru = scn.proses3();
                break;
            case 4:Xbaru = scn.proses4();
                break;
        }
        return Xbaru;
    }

    public int get_i() {
        return i;
    }
}

class secant extends Secant{
    int x;
    double fx1, fx2;
    double Xbaru;
    double pembilang;
    double penyebut;

    public secant() {
        super();
        this.Xbaru = 0;
        this.fx1 = 0;
        this.fx2 = 0;
        this.pembilang = 0;
        this.penyebut = 0;
    }

    public double proses1() {
        Fungsi1 func1 = new Fungsi1();
        for(x = 0; x < batas_iterasi; x++) {
            fx1 = func1.hitung(Xawal1);
            fx2 = func1.hitung(Xawal2);

            pembilang = fx2 * (Xawal2 - Xawal1);
            penyebut = fx2 - fx1;
            Xbaru = Xawal2 - (pembilang / penyebut);

            System.out.println("xbaru = " +Xbaru);

            if(Xbaru - Xawal2 <= toleransi) {
                break;
            } else {
                Xawal1 = Xawal2;
                Xawal2 = Xbaru;
                i++;
                System.out.print("\n");
            }
        }
        return Xbaru;
    }

    public double proses2() {
        Fungsi2 func2 = new Fungsi2();
        for(x = 0; x < batas_iterasi; x++) {
            fx1 = func2.hitung(Xawal1);
            fx2 = func2.hitung(Xawal2);

            pembilang = fx2 * (Xawal2 - Xawal1);
            penyebut = fx2 - fx1;
            Xbaru = Xawal2 - (pembilang / penyebut);

            System.out.println("xbaru = " +Xbaru);

            if(Xbaru - Xawal2 <= toleransi) {
                break;
            } else {
                Xawal1 = Xawal2;
                Xawal2 = Xbaru;
                i++;
                System.out.print("\n");
            }
        }
        return Xbaru;
    }

    public double proses3() {
        Fungsi3 func3 = new Fungsi3();
        for(x = 0; x < batas_iterasi; x++) {
            fx1 = func3.hitung(Xawal1);
            fx2 = func3.hitung(Xawal2);

            pembilang = fx2 * (Xawal2 - Xawal1);
            penyebut = fx2 - fx1;
            Xbaru = Xawal2 - (pembilang / penyebut);

            System.out.println("xbaru = " +Xbaru);

            if(Xbaru - Xawal2 <= toleransi) {
                break;
            } else {
                Xawal1 = Xawal2;
                Xawal2 = Xbaru;
                i++;
                System.out.print("\n");
            }
        }
        return Xbaru;
    }

    public double proses4() {
        Fungsi4 func4 = new Fungsi4();
        for(x = 0; x < batas_iterasi; x++) {
            fx1 = func4.hitung(Xawal1);
            fx2 = func4.hitung(Xawal2);

            pembilang = fx2 * (Xawal2 - Xawal1);
            penyebut = fx2 - fx1;
            Xbaru = Xawal2 - (pembilang / penyebut);

            System.out.println("Xbaru = " +Xbaru);

            if(Xbaru - Xawal2 <= toleransi) {
                break;
            } else {
                Xawal1 = Xawal2;
                Xawal2 = Xbaru;
                i++;
                System.out.print("\n");
            }
        }
        return Xbaru;
    }
}
