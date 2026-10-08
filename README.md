# Sistem Manajemen Pertandingan dan Klasemen Liga Basket

## Deskripsi Singkat Program

Program **Sistem Manajemen Pertandingan dan Klasemen Liga Basket** merupakan program berbasis Java yang digunakan untuk mengelola data dalam sebuah liga basket. Program ini memungkinkan pengguna untuk mengelola data tim, pertandingan, hasil pertandingan, dan klasemen.

Program menerapkan konsep **CRUD (Create, Read, Update, Delete)** serta menggunakan `ArrayList` untuk menyimpan data selama program berjalan. Program juga menggunakan beberapa class, yaitu `Tim`, `Pertandingan`, `HasilPertandingan`, dan `Klasemen`.

Struktur Program

## Alur Program

Saat program dijalankan, pengguna akan diberikan menu utama yang terdiri dari beberapa pilihan:

<img width="272" height="165" alt="image" src="https://github.com/user-attachments/assets/f553d4cf-f744-40d0-bfa4-858d680d7075" />

1. **Manajemen Data Tim**
   - Menambahkan data tim.
   - Menampilkan data tim.
   - Mengubah data tim.
   - Menghapus data tim.

     <img width="267" height="159" alt="image" src="https://github.com/user-attachments/assets/22e79209-7b98-45e5-9606-19822afb8950" />
     <img width="311" height="441" alt="image" src="https://github.com/user-attachments/assets/c5bff1a3-b32d-45cc-ab75-6528dae75305" />
Pada bagian Manajemen Data Tim pengguna dapat menambahkan Tim sesuai dengan keiinginan user, dalam kasus ini digunakan data-data Tim dari Laga asli yaitu dari NBA. Pengguna dapat menampilkan data tim yang telah ditambahkan sebelumnya, jika belum ada data tim yang tersedia maka output yang akan keluar adalah "Belum ada tim.". Jika pengguna merasa melakukan kesalahan pada proses penambahan data tim pengguna dapat melakukan perubahan pada data tim yang telah ditambahkan sebelumnya. Jika data tim sudah tidak relevan maka pengguna dapat menghapusnya.

2. **Manajemen Pertandingan**
   - Menambahkan data pertandingan.
   - Menampilkan data pertandingan.
   - Mengubah data pertandingan.
   - Menghapus data pertandingan.
  
     <img width="392" height="700" alt="image" src="https://github.com/user-attachments/assets/822bcf61-bc86-4576-a590-a39698e77632" />
Pada bagian Manajemen Pertandingan pengguna dapat Menambahkan data pertandingan dengan memilih Tim yang sebelumnya sudah ditambahkan maksimal 2, jika belum ada tim atau tim belum memenuhi jumlah minimal maka output yang akan dihasilkan adalah "Minimal harus ada 2 tim". Setelah data pertandingan ditambahkan pengguna dapat menampilkan data pertandingan tersebut. Jika pengguna mearasa melakukan kesalahan pada proses penambahan data pertandingan pengguna dapat melakukan perubahan pada data pertandingan yang telah ditambahkan sebelumnya. Jika data pertandingan sudah tidak relevan maka pengguna dapat menghapusnya.

3. **Manajemen Hasil Pertandingan**
   - Menambahkan hasil pertandingan.
   - Menampilkan hasil pertandingan.
   - Mengubah hasil pertandingan.
   - Menghapus hasil pertandingan.
  
     <img width="452" height="629" alt="image" src="https://github.com/user-attachments/assets/88e31acb-23af-45aa-aa0f-f3f4afc4f8e1" />
Pada bagian Manajemen Hasil Pertandingan pengguna dapat menambahkan hasil pertandingan daripada pertandingan yang telah ditambahkan sebelumnya. Setelah menambahkan hasil pertandingan pengguna dapat menampilkannya. Jika pengguna merasa melakukan keasalahan pada proses penambahan hasil pertandingan pengguna dapat melakukan perubahan pada data hasil pertandingan yang telah ditambahkan sebelumnya. Jika hasil pertandingan sudah tidak dibutuhkan maka pengguna dapat menghapusnya.

4. **Manajemen Klasemen**
   - Menambahkan data klasemen.
   - Menampilkan data klasemen.
   - Mengubah data klasemen.
   - Menghapus data klasemen.
  
     <img width="509" height="758" alt="image" src="https://github.com/user-attachments/assets/e538a8e8-a4f3-4103-87a6-e6c8177ac9ea" />
Pada bagian Manajemen Klasemen pengguna dapat menambahkan data klasemen tetapi jika belum ada tim yang ditambahkan maka output yang akan dihasilkan adalah "Belum ada tim". Jika pengguna telah menambahkan seluruh data dari data tim, data pertandingan, dan hasil pertandingan maka pengguna dapat menentukan klasemen untuk tim-tim yang ada. Jika pengguna telah menambahkan data klasemen maka data klasemen tersebut dapat ditampilkan oleh pengguna. Jika pengguna merasa melakukan kesalahan pada proses penambahan data klasemen pengguna dapat melakukan perubahan pada data klasemen tersebut. Jika data klasemen tidak relevan maka pengguna juga dapat menghapusnya.

5. **Keluar**
   - Mengakhiri program.

Pengguna memilih menu dengan memasukkan nomor pilihan melalui `Scanner`. Setiap menu memiliki submenu untuk melakukan proses CRUD. Program menggunakan perulangan sehingga menu akan terus ditampilkan dan dapat digunakan kembali sampai pengguna memilih pilihan **Keluar**.

Data yang dimasukkan pengguna akan disimpan ke dalam `ArrayList` sesuai dengan jenis datanya. Data tim disimpan pada `ArrayList<Tim>`, data pertandingan pada `ArrayList<Pertandingan>`, data hasil pertandingan pada `ArrayList<HasilPertandingan>`, dan data klasemen pada `ArrayList<Klasemen>`.

## Encapsulation

Encapsulation digunakan pada masing-masing class dengan menerapkan `Access Modifier` dan `Setter` `Getter`. Encapsulation `Setter` `Getter` dapat ditemukan pada class Tim, Pertandingan, Hasil Pertandingan, dan Klasemen. Hal tersebut digunakan penulis untuk digunakan sebagai pintu gerbang resmi dari atribut-atribut yang diterapkan `Access Modifier` yang dimana atribut ditetapkan sebagai `private`.

## Inheritance

Inheritance diterapkan pada class `Pertandingan` sebagai Parent dengan `PertandinganLiga` dan `PertandingaFinal` sebagai subclassnya.

## Overriding dan Overloading

Overriding dan Overloading diterapkan pada subclass PertandinganLiga dan PertandinganFinal, intinya berkaitan dengan Pertandingan.

Overriding diterapkan pada method `getInfoPertandingan()` yang terdapat pada abstract class `Pertandingan`. Method tersebut kemudian diimplementasikan kembali pada subclass `PertandinganLiga` dan `PertandinganFinal` dengan bentuk informasi yang berbeda sesuai dengan jenis pertandingan.

Pada class `PertandinganLiga`, method `getInfoPertandingan()` digunakan untuk menampilkan informasi pertandingan liga, termasuk nomor pekan. Sedangkan pada class `PertandinganFinal`, method tersebut digunakan untuk menampilkan informasi pertandingan final, termasuk babak pertandingan.

Contoh kode program overriding:

<img width="1414" height="116" alt="image" src="https://github.com/user-attachments/assets/66252fe1-1967-45f4-b4f8-c334359d9232" />

Contoh kode program overloading:

<img width="482" height="214" alt="image" src="https://github.com/user-attachments/assets/cf0caddd-e9a6-4915-bd05-a7f656f4412d" />

Kedua method memiliki nama yang sama, tetapi memiliki parameter yang berbeda. Method pertama tidak memiliki parameter, sedangkan method kedua memiliki parameter boolean. Hal tersebut merupakan penerapan method overloading.

## Polymorphism

Polymorphism diterapkan dengan menggunakan reference dari class Pertandingan untuk menyimpan object dari subclass PertandinganLiga maupun PertandinganFinal.

## Abstract

Abstraction diterapkan dengan menjadikan class Pertandingan sebagai abstract class.

Class `Pertandingan` digunakan sebagai dasar atau rancangan umum untuk jenis-jenis pertandingan. Class tersebut tidak dibuat menjadi object secara langsung, tetapi diwariskan kepada subclass `PertandinganLiga` dan `PertandinganFinal`.

Selain itu, method `getInfoPertandingan()` dibuat sebagai abstract method. Artinya, subclass yang mewarisi class Pertandingan wajib memberikan implementasi terhadap method tersebut.

Dengan menggunakan abstraction, informasi umum seperti ID pertandingan, tanggal, lokasi, tim kandang, tim tandang, dan status dapat ditempatkan pada parent class, sedangkan informasi khusus untuk pertandingan liga dan pertandingan final dapat diterapkan pada masing-masing subclass.

Method `getInfoPertandingan()` yang dipanggil akan menyesuaikan dengan object sebenarnya.

Jika object merupakan `PertandinganLiga`, maka implementasi `getInfoPertandingan()` milik `PertandinganLiga` yang dijalankan. Jika object merupakan `PertandinganFinal`, maka implementasi milik `PertandinganFinal` yang dijalankan.

Hal tersebut merupakan contoh runtime polymorphism, karena method yang dijalankan ditentukan berdasarkan object yang digunakan pada saat program berjalan.

## Interface

Interface digunakan untuk memisahkan aturan validasi dari proses utama program. Dengan demikian, validasi input dapat dibuat lebih terstruktur dan dapat digunakan kembali apabila nantinya terdapat class lain yang membutuhkan aturan validasi yang sama.

Interface `ValidasiInput` merupakan pengembangan tambahan (value-add) dalam penerapan konsep Object-Oriented Programming pada program ini.

<img width="422" height="258" alt="image" src="https://github.com/user-attachments/assets/ceaed272-311e-4cbd-829c-97e932efecc1" />

Validasi Input

Program juga menerapkan validasi input untuk mencegah data yang tidak sesuai masuk ke dalam sistem.

Validasi yang diterapkan antara lain:

- Input angka harus berupa angka.
- Input nama tidak boleh kosong.
- Skor pertandingan tidak boleh bernilai negatif.
- Pertandingan hanya dapat ditambahkan apabila minimal terdapat dua tim.
- Tim yang dipilih untuk pertandingan harus berasal dari data tim yang tersedia.

Pada proses input angka, program menggunakan try-catch untuk menangani kesalahan ketika pengguna memasukkan data yang bukan angka.
