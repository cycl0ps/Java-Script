/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Metode;

/**
 *
 * @author dkakunsi
 */
public class Metode {
    protected double Xawal1;
    protected double Xawal2;
    protected int batas_iterasi;
    protected double toleransi;
    int pilihan;

    public Metode() {
        //konstruktor kosong
    }

    public Metode(int pilihan, double xawal1, double xawal2, int batas, double toleransi) {
        this.Xawal1 = xawal1;
        this.Xawal2 = xawal2;
        this.batas_iterasi = batas;
        this.toleransi = toleransi;
        this.pilihan = pilihan;
    }
}
