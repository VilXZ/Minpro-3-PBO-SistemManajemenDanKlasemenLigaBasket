/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kidst
 */
public class HasilPertandingan {

    private int idHasil;
    private int idPertandingan;
    private int skorKandang;
    private int skorTandang;
    private String namaTimKandang;
    private String namaTimTandang;
    private String pemenang;

    public HasilPertandingan(
            int idHasil,
            int idPertandingan,
            int skorKandang,
            int skorTandang,
            String namaTimKandang,
            String namaTimTandang) {

        this.idHasil = idHasil;
        this.idPertandingan = idPertandingan;
        this.skorKandang = skorKandang;
        this.skorTandang = skorTandang;
        this.namaTimKandang = namaTimKandang;
        this.namaTimTandang = namaTimTandang;

        tentukanPemenang();
    }

    private void tentukanPemenang() {

        if (skorKandang > skorTandang) {
            pemenang = namaTimKandang;
        } else if (skorTandang > skorKandang) {
            pemenang = namaTimTandang;
        } else {
            pemenang = "Seri";
        }
    }

    public int getIdHasil() {
        return idHasil;
    }

    public int getIdPertandingan() {
        return idPertandingan;
    }

    public int getSkorKandang() {
        return skorKandang;
    }

    public int getSkorTandang() {
        return skorTandang;
    }

    public String getPemenang() {
        return pemenang;
    }

    @Override
    public String toString() {

        return "ID Hasil: " + idHasil
                + " | Pertandingan: "
                + namaTimKandang
                + " vs "
                + namaTimTandang
                + " | Skor: "
                + skorKandang
                + " - "
                + skorTandang
                + " | Pemenang: "
                + pemenang;
    }
}