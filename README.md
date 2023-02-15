## Janji
Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Deskripsi Tugas Latihan 1 DPBO 2023
Buatlah program berbasis OOP menggunakan bahasa pemrograman C++, Java, Python, dan PHP yang menampilkan informasi daftar mahasiswa (sekumpulan objek mahasiswa) dan memiliki fitur menambah, mengubah, dan menghapus data. Setiap mahasiswa memiliki data nama, NIM, program studi, fakultas, dan foto profil (khusus bahasa PHP).

## Desain Program
Terdapat 2 class di program ini, yaitu:
1. **Class Mahasiswa** memiliki 4 atribut umum yaitu name (Nama), NIM (Nomor Induk Mahasiswa), major (Program Studi), faculty (Fakultas) dan 1 atribut tambahan di bahasa PHP, photo (Foto Profil). Setiap atribut pada class ini diberi setter dan getter.
2. **Class CRUD** merupakan class yang dibuat untuk metode Create (Menambahkan data, create()), Read (Menampilkan data, read()), Update (Mengubah data, update()), dan Delete (Menghapus data, remove()), serta 1 metode tambahan untuk membantu proses update dan delete yaitu search (Mencari data berdasarkan NIM, search()). Class ini memiliki 1 atribut dinamakan data yang merupakan List of Object dari Class Mahasiswa.

## Alur Program
C++, Java, dan Python memiliki alur program yang sama, yaitu sebagai berikut:
1. Pengguna akan dihadapi dengan menu yang terdiri dari 5 pilihan.

![Screenshot_20230215_220851](https://user-images.githubusercontent.com/100767177/219066797-dac1d494-b1b9-4539-a832-dafe12df1267.png)

2. Pilihan 1 akan menampilkan tampilan formulir yang harus diisi oleh pengguna.

![Screenshot_20230215_220948](https://user-images.githubusercontent.com/100767177/219067074-790e5b23-dfcb-4e8c-a38b-e2b0185ede75.png)

3. Pilihan 2 akan menampilkan data mahasiswa yang sudah diinput pengguna, terdapat tampilan lain apabila tidak ada data sama sekali.

![image](https://user-images.githubusercontent.com/100767177/219067287-7198faea-729f-4332-890d-1d29cc031be7.png)
![image](https://user-images.githubusercontent.com/100767177/219067714-5a0f7e6a-7e54-4495-b53f-49e5bf63342b.png)

4. Pilihan 3, pengguna akan diminta menginput NIM mahasiswa yang ingin diubah datanya, terdapat tampilan lain apabila NIM yang dicari tidak ada.

![image](https://user-images.githubusercontent.com/100767177/219068114-d816c4b9-9c50-44bd-a993-7cff578a10e6.png)
![image](https://user-images.githubusercontent.com/100767177/219067989-5b7b83c4-b661-47a7-aca6-fd13457d7464.png)

5. Pilihan 4, pengguna akan diminta menginput NIM mahasiswa yang ingin dihapus datanya, terdapat tampilan lain apabila NIM yang dicari tidak ada.

![image](https://user-images.githubusercontent.com/100767177/219068516-9d7f7576-08ec-4808-993c-8a0cb05354e8.png)
![image](https://user-images.githubusercontent.com/100767177/219068445-4b8268fc-fb7e-44cf-8e40-a2ec7a714f6a.png)

6. Pilihan 5, program akan terhenti.

![image](https://user-images.githubusercontent.com/100767177/219068905-61932139-ebac-46c9-854f-c657cee5752f.png)

7. Jika memilih selain pilihan 1-5, maka tampilan berikut akan muncul.

![image](https://user-images.githubusercontent.com/100767177/219069081-ac897270-f19b-477a-a40d-a9a27842e2ba.png)

Note: Di bahasa PHP, inputan dilakukan secara hardcode.

## Dokumentasi
#### 1. PHP
![Dokumentasi](https://user-images.githubusercontent.com/100767177/219070194-c292054a-c73e-4456-91ca-98c47c47845b.png)

#### 2. Python
![Dokumentasi_1](https://user-images.githubusercontent.com/100767177/219070637-bf413c56-d077-4ed3-8570-d864b1b80894.png)
![Dokumentasi_2](https://user-images.githubusercontent.com/100767177/219070692-01adb995-16df-4eeb-b5d1-a28e71b11704.png)
