/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kidst
 */
public abstract class Pertandingan {

    private int idPertandingan;
    private String tanggal;
    private String lokasi;
    private String timKandang;
    private String timTandang;
    private String status;

    public Pertandingan(
            int idPertandingan,
            String tanggal,
            String lokasi,
            String timKandang,
            String timTandang,
            String status) {

        this.idPertandingan = idPertandingan;
        this.tanggal = tanggal;
        this.lokasi = lokasi;
        this.timKandang = timKandang;
        this.timTandang = timTandang;
        this.status = status;
    }

    public abstract String getInfoPertandingan();

    // Overloading
    public String getInfoPertandingan(boolean tampilLokasi) {

        String info = timKandang + " vs " + timTandang;

        if (tampilLokasi) {
            info += " | Lokasi: " + lokasi;
        }

        return info;
    }

    public int getIdPertandingan() {
        return idPertandingan;
    }

    public void setIdPertandingan(int idPertandingan) {
        this.idPertandingan = idPertandingan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getTimKandang() {
        return timKandang;
    }

    public void setTimKandang(String timKandang) {
        this.timKandang = timKandang;
    }

    public String getTimTandang() {
        return timTandang;
    }

    public void setTimTandang(String timTandang) {
        this.timTandang = timTandang;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}