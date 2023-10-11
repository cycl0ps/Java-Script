/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Metode.*;


/**
 *
 * @author dkakunsi
 */
public class Mulai {
    public static void main(String[] args) {
        Reader rdr = new Reader();
        Mulai mlai = new Mulai();

        int pilihan;
        double Xawal1 = 0;
        double Xawal2 = 0;
        int batas_iterasi = 0;
        double toleransi = 0;
        int jmlh_iterasi;

        try {
            System.out.print("masukan nilai awal pertama : ");
            Xawal1 = Reader.readDouble();

            System.out.print("masukan nilai awal kedua : ");
            Xawal2 = Reader.readDouble();

            System.out.print("masukan toleransi nilai : ");
            toleransi = Reader.readDouble();

            System.out.print("masukan batas iterasi : ");
            batas_iterasi = Reader.readInt();
        }
        catch (Exception e) {
            System.out.println("error " +e);
        }

        pilihan = mlai.pilih_fungsi();
/*
 * instansiasi objek-objek
 */
        Metode mtd = new Metode(pilihan, Xawal1, Xawal2, batas_iterasi, toleransi);
        BagiDua bd = new BagiDua();
        PosisiPalsu pp = new PosisiPalsu();
        Secant scn = new Secant();
        double x; // untuk menampung nilai Xbaru, yaitu nilai x hasil proses

        bd.Cetak(); //HAPUS
/*
 * untuk objek bagi-dua
 */

        x = bd.proses();
        jmlh_iterasi = bd.get_i();

        System.out.println("Metode Bagi Dua");
        System.out.println("hasil akhir = " +x);
        System.out.println("pada iterasi ke-" +jmlh_iterasi);

/*
 * untuk objek posisi-palsu
 */
        x = pp.proses();
        jmlh_iterasi = pp.get_i();

        System.out.println("Metode Posisi Palsu");
        System.out.println("hasil akhir = " +x);
        System.out.println("pada iterasi ke-" +jmlh_iterasi);

/*
 * untuk objek Secant
 */
        x = scn.proses();
        jmlh_iterasi = scn.get_i();

        System.out.println("Metode Secant");
        System.out.println("hasil akhir = " +x);
        System.out.println("pada iterasi ke-" +jmlh_iterasi);
    }

    public int pilih_fungsi() {
        Reader rdr = new Reader();
        int pilihan = 0;

        System.out.println("PILIH FUNGSI ANDA!");
        System.out.println("1. X^2-2x-1\n2. X^3-3x+2\n3. X^2-10x+23\n4. X^3-x-3");

        try {
            System.out.print("Pilihan anda : ");
            pilihan = Reader.readInt();
        }
        catch (Exception e) {
            System.out.print("error " +e);
        }
        return pilihan;
    }
}
