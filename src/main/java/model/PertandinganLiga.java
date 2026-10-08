/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kidst
 */
public class PertandinganLiga extends Pertandingan {

    private int pekan;

    public PertandinganLiga(
            int idPertandingan,
            String tanggal,
            String lokasi,
            String timKandang,
            String timTandang,
            String status,
            int pekan) {

        super(
                idPertandingan,
                tanggal,
                lokasi,
                timKandang,
                timTandang,
                status
        );

        this.pekan = pekan;
    }

    @Override
    public String getInfoPertandingan() {

        return "Pertandingan Liga | "
                + getTimKandang()
                + " vs "
                + getTimTandang()
                + " | Pekan "
                + pekan
                + " | "
                + getTanggal()
                + " | "
                + getLokasi()
                + " | Status: "
                + getStatus();
    }

    public int getPekan() {
        return pekan;
    }

    public void setPekan(int pekan) {
        this.pekan = pekan;
    }
}