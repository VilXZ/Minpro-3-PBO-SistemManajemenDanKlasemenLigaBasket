/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kidst
 */
public class PertandinganFinal extends Pertandingan {

    private String babak;

    public PertandinganFinal(
            int idPertandingan,
            String tanggal,
            String lokasi,
            String timKandang,
            String timTandang,
            String status,
            String babak) {

        super(
                idPertandingan,
                tanggal,
                lokasi,
                timKandang,
                timTandang,
                status
        );

        this.babak = babak;
    }

    @Override
    public String getInfoPertandingan() {

        return "Pertandingan Final | "
                + getTimKandang()
                + " vs "
                + getTimTandang()
                + " | "
                + babak
                + " | "
                + getTanggal()
                + " | "
                + getLokasi()
                + " | Status: "
                + getStatus();
    }

    public String getBabak() {
        return babak;
    }

    public void setBabak(String babak) {
        this.babak = babak;
    }
}