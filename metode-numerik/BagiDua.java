/*
 * Code for Numerical Methode
 * "Metode Bagi-Dua
 */

package Metode;
import Metode.Fungsi.*;
/**
 *
 * @author dkakunsi
 */
public class BagiDua extends Metode{
    protected int i;

    public BagiDua() {
        super();
        this.i = 0;
    }

    public void Cetak() {
        System.out.println("X awal1 = " +super.Xawal1);
        System.out.println("X awal2 = " +super.Xawal2);
        System.out.println("Toleransi error = " +super.toleransi);
        System.out.println("Batas Iterasi = " +super.batas_iterasi);
        System.out.println("Pilihan = " +super.pilihan);
    }

    public double proses() {
        bagi_dua bd = new bagi_dua();
        double Xbaru = 0;

        switch(pilihan) {
            case 1:Xbaru = bd.proses1();
                break;
            case 2:Xbaru = bd.proses2();
                break;
            case 3:Xbaru = bd.proses3();
                break;
            case 4:Xbaru = bd.proses4();
                break;
        }
        return Xbaru;
    }
    
    public int get_i() {
        return i;
    }
}

class bagi_dua extends BagiDua {
    int x;
    double Xbaru;
    double fx;

    public bagi_dua(){
        super();
        this.Xbaru = 0;
        this.fx = 0;
    }

    public double proses1() {
        Fungsi1 func1 = new Fungsi1();
        for(x = 0; x < batas_iterasi; x++) {
            Xbaru = (Xawal1 + Xawal2) / 2;
            fx = func1.hitung(Xbaru);

            if(fx == 0) {
                System.out.println("fx = " +fx);
                break;
            } else {
                if(fx < 0) {
                    Xawal1 = Xbaru;
                    i++;
                } else {
                    Xawal2 = Xbaru;
                    i++;
                }
            }
        }
        return Xbaru;
    }

    public double proses2() {
        Fungsi2 func2 = new Fungsi2();

        for(x = 0; x < batas_iterasi; x++) {
            Xbaru = (Xawal1 + Xawal2) / 2;
            fx = func2.hitung(Xbaru);

            if(fx == 0) {
                System.out.println("fx = " +fx);
                break;
            } else {
               if(fx < 0) {
                   Xawal1 = Xbaru;
                   i++;
               } else {
                   Xawal2 = Xbaru;
                   i++;
               }
            }
        }
        return Xbaru;
    }

    public double proses3() {


        for(x = 0; x < batas_iterasi; x++) {
            Fungsi3 func3 = new Fungsi3();
            Xbaru = (Xawal1 + Xawal2) / 2;
            fx = func3.hitung(Xbaru);

            if(fx == 0) {
                System.out.println("fx = " +fx);
                break;
            } else {
               if(fx < 0) {
                   Xawal1 = Xbaru;
                   i++;
               } else {
                   Xawal2 = Xbaru;
                   i++;
               }
            }
        }
        return Xbaru;
    }

    public double proses4() {
        Fungsi4 func4 = new Fungsi4();

        for(x = 0; x < batas_iterasi; x++) {
            Xbaru = (Xawal1 + Xawal2) / 2;
            fx = func4.hitung(Xbaru);

            if(fx == 0) {
                System.out.println("fx = " +fx);
                break;
            } else {
               if(fx < 0) {
                   Xawal1 = Xbaru;
                   i++;
               } else {
                   Xawal2 = Xbaru;
                   i++;
               }
            }
        }
        return Xbaru;
    }
}
