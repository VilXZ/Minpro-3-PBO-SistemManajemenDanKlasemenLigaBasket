/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author kidst
 */
import model.HasilPertandingan;
import model.Klasemen;
import model.Pertandingan;
import model.PertandinganFinal;
import model.PertandinganLiga;
import model.Tim;
import controller.ValidasiInput;
import view.MenuView;

import java.util.ArrayList;

public class LigaController implements ValidasiInput {

    private MenuView view;

    private ArrayList<Tim> daftarTim;
    private ArrayList<Pertandingan> daftarPertandingan;
    private ArrayList<HasilPertandingan> daftarHasil;
    private ArrayList<Klasemen> daftarKlasemen;

    public LigaController(MenuView view) {

        this.view = view;

        daftarTim = new ArrayList<>();
        daftarPertandingan = new ArrayList<>();
        daftarHasil = new ArrayList<>();
        daftarKlasemen = new ArrayList<>();

        isiDummyData();
    }

    public void jalankan() {

        int pilihan;

        do {

            view.tampilkanMenuUtama();

            pilihan = view.inputInt("Pilih menu: ");

            switch (pilihan) {

                case 1:
                    menuTim();
                    break;

                case 2:
                    menuPertandingan();
                    break;

                case 3:
                    menuHasil();
                    break;

                case 4:
                    tampilkanKlasemen();
                    break;

                case 5:
                    view.tampilkanPesan(
                            "Program selesai. Terima kasih!"
                    );
                    break;

                default:
                    view.tampilkanPesan(
                            "Pilihan menu tidak tersedia!"
                    );
            }

        } while (pilihan != 5);

        view.tutupScanner();
    }

    private void menuTim() {

        int pilihan;

        do {

            System.out.println();
            System.out.println("===== MANAJEMEN TIM =====");
            System.out.println("1. Tambah Tim");
            System.out.println("2. Tampilkan Tim");
            System.out.println("3. Ubah Tim");
            System.out.println("4. Hapus Tim");
            System.out.println("5. Kembali");

            pilihan = view.inputInt("Pilih menu: ");

            switch (pilihan) {

                case 1:
                    tambahTim();
                    break;

                case 2:
                    tampilkanTim();
                    break;

                case 3:
                    ubahTim();
                    break;

                case 4:
                    hapusTim();
                    break;

                case 5:
                    break;

                default:
                    view.tampilkanPesan(
                            "Pilihan tidak valid!"
                    );
            }

        } while (pilihan != 5);
    }

    private void tambahTim() {

        System.out.println();
        System.out.println("===== TAMBAH TIM =====");

        int id = view.inputInt("ID Tim: ");

        if (cariTim(id) != null) {
            view.tampilkanPesan(
                    "ID Tim sudah digunakan!"
            );
            return;
        }

        String nama = view.inputString("Nama Tim: ");
        String kota = view.inputString("Kota: ");
        String pelatih = view.inputString("Pelatih: ");

        daftarTim.add(
                new Tim(id, nama, kota, pelatih)
        );

        view.tampilkanPesan(
                "Tim berhasil ditambahkan."
        );
    }

    private void tampilkanTim() {

        System.out.println();
        System.out.println("===== DAFTAR TIM =====");

        if (daftarTim.isEmpty()) {

            view.tampilkanPesan(
                    "Belum ada data tim."
            );

            return;
        }

        for (Tim tim : daftarTim) {
            System.out.println(tim);
        }
    }

    private void ubahTim() {

        tampilkanTim();

        int id = view.inputInt(
                "Masukkan ID tim yang ingin diubah: "
        );

        Tim tim = cariTim(id);

        if (tim == null) {

            view.tampilkanPesan(
                    "Tim tidak ditemukan."
            );

            return;
        }

        String nama = view.inputString(
                "Nama Tim baru: "
        );

        String kota = view.inputString(
                "Kota baru: "
        );

        String pelatih = view.inputString(
                "Pelatih baru: "
        );

        tim.setNamaTim(nama);
        tim.setKota(kota);
        tim.setPelatih(pelatih);

        view.tampilkanPesan(
                "Data tim berhasil diubah."
        );
    }

    private void hapusTim() {

        tampilkanTim();

        int id = view.inputInt(
                "Masukkan ID tim yang ingin dihapus: "
        );

        Tim tim = cariTim(id);

        if (tim == null) {
            view.tampilkanPesan(
                    "Tim tidak ditemukan."
            );
            return;
        }

        daftarTim.remove(tim);

        view.tampilkanPesan(
                "Tim berhasil dihapus."
        );
    }

    private Tim cariTim(int id) {

        for (Tim tim : daftarTim) {
            if (tim.getIdTim() == id) {
                return tim;
            }
        }
        return null;
    }

    private void menuPertandingan() {

        int pilihan;

        do {

            System.out.println();
            System.out.println("===== MANAJEMEN PERTANDINGAN =====");
            System.out.println("1. Tambah Pertandingan");
            System.out.println("2. Tampilkan Pertandingan");
            System.out.println("3. Hapus Pertandingan");
            System.out.println("4. Kembali");

            pilihan = view.inputInt("Pilih menu: ");

            switch (pilihan) {

                case 1:
                    tambahPertandingan();
                    break;

                case 2:
                    tampilkanPertandingan();
                    break;

                case 3:
                    hapusPertandingan();
                    break;

                case 4:
                    break;

                default:
                    view.tampilkanPesan(
                            "Pilihan tidak valid!"
                    );
            }
        } while (pilihan != 4);
    }

    private void tambahPertandingan() {

        if (daftarTim.size() < 2) {
            view.tampilkanPesan(
                    "Minimal harus ada 2 tim."
            );
            return;
        }

        tampilkanTim();

        System.out.println();
        System.out.println("===== TAMBAH PERTANDINGAN =====");

        int id = view.inputInt(
                "ID Pertandingan: "
        );

        if (cariPertandingan(id) != null) {
            view.tampilkanPesan(
                    "ID pertandingan sudah digunakan!"
            );
            return;
        }

        String tanggal = view.inputString(
                "Tanggal: "
        );

        String lokasi = view.inputString(
                "Lokasi: "
        );

        int idKandang = view.inputInt(
                "ID Tim Kandang: "
        );

        Tim kandang = cariTim(idKandang);

        if (kandang == null) {
            view.tampilkanPesan(
                    "Tim kandang tidak ditemukan."
            );
            return;
        }
        int idTandang = view.inputInt(
                "ID Tim Tandang: "
        );

        Tim tandang = cariTim(idTandang);

        if (tandang == null) {
            view.tampilkanPesan(
                    "Tim tandang tidak ditemukan."
            );

            return;
        }

        if (idKandang == idTandang) {
            view.tampilkanPesan(
                    "Tim kandang dan tim tandang tidak boleh sama."
            );

            return;
        }

        System.out.println();
        System.out.println("Jenis pertandingan:");
        System.out.println("1. Liga");
        System.out.println("2. Final");

        int jenis = view.inputInt(
                "Pilih jenis: "
        );
        
        Pertandingan pertandingan;

        if (jenis == 1) {

            int pekan = view.inputInt(
                    "Pekan ke: "
            );
            pertandingan = new PertandinganLiga(
                    id,
                    tanggal,
                    lokasi,
                    kandang.getNamaTim(),
                    tandang.getNamaTim(),
                    "Belum Dimainkan",
                    pekan
            );

        } else if (jenis == 2) {

            String babak = view.inputString(
                    "Babak final: "
            );
            pertandingan = new PertandinganFinal(
                    id,
                    tanggal,
                    lokasi,
                    kandang.getNamaTim(),
                    tandang.getNamaTim(),
                    "Belum Dimainkan",
                    babak
            );

        } else {

            view.tampilkanPesan(
                    "Jenis pertandingan tidak valid."
            );
            return;
        }
        daftarPertandingan.add(pertandingan);

        view.tampilkanPesan(
                "Pertandingan berhasil ditambahkan."
        );
    }

    private void tampilkanPertandingan() {

        System.out.println();
        System.out.println("===== DAFTAR PERTANDINGAN =====");

        if (daftarPertandingan.isEmpty()) {
            view.tampilkanPesan(
                    "Belum ada pertandingan."
            );
            return;
        }

        for (Pertandingan pertandingan : daftarPertandingan) {
            System.out.println(
                    pertandingan.getInfoPertandingan()
            );
        }
    }

    private void hapusPertandingan() {

        tampilkanPertandingan();

        int id = view.inputInt(
                "ID pertandingan yang ingin dihapus: "
        );

        Pertandingan pertandingan =
                cariPertandingan(id);

        if (pertandingan == null) {
            view.tampilkanPesan(
                    "Pertandingan tidak ditemukan."
            );
            return;
        }

        daftarPertandingan.remove(pertandingan);

        view.tampilkanPesan(
                "Pertandingan berhasil dihapus."
        );
    }

    private Pertandingan cariPertandingan(int id) {

        for (Pertandingan pertandingan : daftarPertandingan) {

            if (pertandingan.getIdPertandingan() == id) {
                return pertandingan;
            }
        }
        return null;
    }

    private void menuHasil() {

        int pilihan;

        do {

            System.out.println();
            System.out.println("===== HASIL PERTANDINGAN =====");
            System.out.println("1. Tambah Hasil");
            System.out.println("2. Tampilkan Hasil");
            System.out.println("3. Kembali");

            pilihan = view.inputInt(
                    "Pilih menu: "
            );

            switch (pilihan) {

                case 1:
                    tambahHasil();
                    break;

                case 2:
                    tampilkanHasil();
                    break;

                case 3:
                    break;

                default:
                    view.tampilkanPesan("Pilihan tidak valid.");
            }
        } while (pilihan != 3);
    }

    private void tambahHasil() {

        tampilkanPertandingan();

        int idPertandingan = view.inputInt(
                "ID Pertandingan: "
        );

        Pertandingan pertandingan =
                cariPertandingan(idPertandingan);

        if (pertandingan == null) {
            view.tampilkanPesan("Pertandingan tidak ditemukan.");
            return;
        }

        int idHasil = view.inputInt("ID Hasil: ");

        int skorKandang = view.inputInt("Skor tim kandang: ");

        int skorTandang = view.inputInt("Skor tim tandang: ");

        if (!validasiSkor(skorKandang)
                || !validasiSkor(skorTandang)) {

            view.tampilkanPesan("Skor tidak boleh negatif.");
            return;
        }

        HasilPertandingan hasil =
                new HasilPertandingan(
                        idHasil, idPertandingan, skorKandang, skorTandang, pertandingan.getTimKandang(), pertandingan.getTimTandang()
                );

        daftarHasil.add(hasil);

        pertandingan.setStatus("Selesai");

        view.tampilkanPesan("Hasil berhasil ditambahkan.");

        view.tampilkanPesan("Pemenang otomatis: " + hasil.getPemenang());
    }

    private void tampilkanHasil() {

        System.out.println();
        System.out.println("===== DAFTAR HASIL =====");

        if (daftarHasil.isEmpty()) {
            view.tampilkanPesan("Belum ada hasil pertandingan.");
            return;
        }

        for (HasilPertandingan hasil : daftarHasil) {
            System.out.println(hasil);
        }
    }

    private void tampilkanKlasemen() {

        System.out.println();
        System.out.println("===== KLASEMEN =====");

        if (daftarTim.isEmpty()) {

            view.tampilkanPesan("Belum ada data tim.");
            return;
        }

        daftarKlasemen.clear();

        for (Tim tim : daftarTim) {

            int main = 0;
            int menang = 0;
            int kalah = 0;
            int poin = 0;

            for (HasilPertandingan hasil : daftarHasil) {

                Pertandingan pertandingan =
                        cariPertandingan(
                                hasil.getIdPertandingan()
                        );

                if (pertandingan == null) {
                    continue;
                }

                boolean timKandang =
                        pertandingan.getTimKandang()
                                .equals(tim.getNamaTim());

                boolean timTandang =
                        pertandingan.getTimTandang()
                                .equals(tim.getNamaTim());

                if (!timKandang && !timTandang) {
                    continue;
                }

                main++;

                if (hasil.getPemenang()
                        .equals(tim.getNamaTim())) {

                    menang++;
                    poin += 2;

                } else if (hasil.getPemenang()
                        .equals("Seri")) {

                    poin += 1;

                } else {

                    kalah++;
                }
            }

            daftarKlasemen.add(
                    new Klasemen(
                            tim.getNamaTim(), main, menang, kalah, poin
                    )
            );
        }

        for (int i = 0;
             i < daftarKlasemen.size() - 1;
             i++) {

            for (int j = i + 1;
                 j < daftarKlasemen.size();
                 j++) {

                if (daftarKlasemen.get(j).getPoin()
                        > daftarKlasemen.get(i).getPoin()) {

                    Klasemen temp =
                            daftarKlasemen.get(i);

                    daftarKlasemen.set(
                            i,
                            daftarKlasemen.get(j)
                    );

                    daftarKlasemen.set(
                            j,
                            temp
                    );
                }
            }
        }

        int posisi = 1;

        for (Klasemen klasemen : daftarKlasemen) {

            System.out.println(
                    posisi + ". " + klasemen
            );
            posisi++;
        }
    }

    private void isiDummyData() {

        Tim lakers = new Tim(
                1, "Los Angeles Lakers", "Los Angeles", "JJ Redick"
        );

        Tim warriors = new Tim(
                2, "Golden State Warriors", "San Francisco", "Steve Kerr"
        );

        Tim celtics = new Tim(
                3, "Boston Celtics", "Boston", "Joe Mazzulla"
        );

        daftarTim.add(lakers);
        daftarTim.add(warriors);
        daftarTim.add(celtics);

        Pertandingan pertandingan =
                new PertandinganLiga(
                        1,"22-10-2025","Crypto.com Arena","Los Angeles Lakers","Golden State Warriors","Selesai",1
                );

        daftarPertandingan.add(pertandingan);

        HasilPertandingan hasil =
                new HasilPertandingan(
                        1, 1, 120, 115, "Los Angeles Lakers", "Golden State Warriors"
                );

        daftarHasil.add(hasil);
    }

    @Override
    public boolean validasiNama(String nama) {

        return nama != null
                && !nama.trim().isEmpty();
    }

    @Override
    public boolean validasiAngka(int angka) {

        return angka >= 0;
    }

    @Override
    public boolean validasiSkor(int skor) {

        return skor >= 0;
    }
}