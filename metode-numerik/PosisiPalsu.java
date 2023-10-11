/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Metode;
import Metode.Fungsi.*;
/**
 *
 * @author dkakunsi
 */
public class PosisiPalsu extends Metode{
    protected int  i;

    public PosisiPalsu() {
        super();
        this.i = 0;
    }

    public double proses() {
        posisi_palsu pp = new posisi_palsu();
        double Xbaru = 0;

        switch(pilihan) {
            case 1:Xbaru = pp.proses1();
                break;
            case 2:Xbaru = pp.proses2();
                break;
            case 3:Xbaru = pp.proses3();
                break;
            case 4:Xbaru = pp.proses4();
                break;
        }
        return Xbaru;
    }

    public int get_i() {
        return i;
    }
}

class posisi_palsu extends PosisiPalsu{
    int x;
    double fx1, fx2;
    double Xbaru;
    double pembilang;
    double penyebut;

    public posisi_palsu() {
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
        Fungsi1 func2 = new Fungsi1();
        for(x = 0; x < batas_iterasi; x++) {
                fx1 = func2.hitung(Xawal1);
                fx2 = func2.hitung(Xawal2);

                pembilang = fx2 * (Xawal2 - Xawal1);
                penyebut = fx2 - fx1;
                Xbaru = Xawal2 - (pembilang / penyebut);

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
        Fungsi1 func3 = new Fungsi1();
        for(x = 0; x < batas_iterasi; x++) {
                fx1 = func3.hitung(Xawal1);
                fx2 = func3.hitung(Xawal2);

                pembilang = fx2 * (Xawal2 - Xawal1);
                penyebut = fx2 - fx1;
                Xbaru = Xawal2 - (pembilang / penyebut);

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
        Fungsi1 func4 = new Fungsi1();
        for(x = 0; x < batas_iterasi; x++) {
                fx1 = func4.hitung(Xawal1);
                fx2 = func4.hitung(Xawal2);

                pembilang = fx2 * (Xawal2 - Xawal1);
                penyebut = fx2 - fx1;
                Xbaru = Xawal2 - (pembilang / penyebut);

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
