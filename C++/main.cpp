/* Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 1 dalam mata kuliah Desain Pemrograman Berorientasi
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

#include <bits/stdc++.h>
#include "CRUD.cpp"

using namespace std;

int main()
{
    /* Deklarasi Variabel */
    vector<Mahasiswa> list;                 // Vector untuk menampung data yang user input.
    CRUD crud(list);                        // Instansiasi CRUD.
    int operation, index;                   // Integer untuk menampung pilihan operasi yang user input, dan tampungan index untuk mencari data mahasiswa.
    string name, NIM, major, faculty, find; // String tampungan sementara untuk data mahasiswa.

    /* Perulangan untuk Meminta Inputan User */
    do
    {
        // Meminta user untuk memilih operasi CRUD yang ingin digunakan.
        cout << "+---------------------+" << endl;
        cout << "| Choose an operation |" << endl;
        cout << "| 1. Add Data         |" << endl;
        cout << "| 2. Show Data        |" << endl;
        cout << "| 3. Update Data      |" << endl;
        cout << "| 4. Delete Data      |" << endl;
        cout << "| 5. Exit Menu        |" << endl;
        cout << "+---------------------+" << endl;
        cout << "Choose: ";
        cin >> operation;

        // Syarat menggunakan switch untuk melakukan operasi CRUD.
        switch (operation)
        {
        case 1: // Jika yang dipilih 1.
        {
            // Maka akan melakukan proses CREATE atau ADD data.
            cin.ignore();
            cout << "Insert the following data!\n";
            cout << "Name    : ";
            getline(cin, name);
            cout << "NIM     : ";
            getline(cin, NIM);
            cout << "Major   : ";
            getline(cin, major);
            cout << "Faculty : ";
            getline(cin, faculty);

            crud.create(name, NIM, major, faculty); // Memanggil operasi create dari CRUD.

            cout << "\nData has been successfully added!\n"
                 << endl;
            break;
        }
        case 2: // Jika yang dipilih 2.
        {
            // Maka akan menampilkan proses READ data untuk menampilkan data yang sudah diinput user.
            crud.read();
            break;
        }
        case 3: // Jika yang dipilih 3.
        {
            // Maka akan melakukan proses UPDATE data berdasarkan NIM yang user pilih.
            cout << "Insert the person's NIM you want to update the data!\n";
            cout << "NIM     : ";
            cin >> find;               // Meminta NIM yang ingin di update datanya.
            index = crud.search(find); // Mencari index keberapa NIM yang dicari berada.

            if (index == -1) // Jika index bernilai -1.
            {
                cout << "\nData doesn't exist!\n"
                     << endl; // Maka data tidak ada dalam list.
            }
            else // Jika selain bernilai -1.
            {
                // Maka akan meminta user untuk update data pada NIM yang dicari.
                cin.ignore();
                cout << "\nData exist! Insert the following to update the data!\n";
                cout << "Name    : ";
                getline(cin, name);
                cout << "Major   : ";
                getline(cin, major);
                cout << "Faculty : ";
                getline(cin, faculty);

                crud.update(index, name, major, faculty); // Memanggil operasi update dari CRUD.

                cout << "\nData has been successfully updated!\n"
                     << endl;
            }
            break;
        }
        case 4: // Jika yang dipilih 4.
        {
            // Maka akan melakukan proses DELETE data berdasarkan NIM yang user pilih.
            cout << "Insert the person's NIM you want to delete!\n";
            cout << "NIM     : ";
            cin >> find;               // Meminta NIM yang ingin di delete datanya.
            index = crud.search(find); // Mencari index keberapa NIM yang dicari berada.

            if (index == -1) // Jika index bernilai -1.
            {
                cout << "\nData doesn't exist!\n"
                     << endl; // Maka data tidak ada dalam list.
            }
            else // Jika selain bernilai -1.
            {
                crud.remove(index); // Maka akan memanggil operasi delete dari CRUD.

                cout << "\nData has been successfully deleted!\n"
                     << endl;
            }
            break;
        }
        case 5: // Jika yang dipilih 5.
        {
            cout << "\nBYE." << endl; // Maka program selesai.
            break;
        }
        default: // Jika yang dipilih selai angka 1-5.
            cout << "\nInvalid operation.\n"
                 << endl; // Maka akan mengeluarkan invalid operations.
            break;
        }
    } while (operation != 5); // Perulangan yang akan berhenti jika operation bernilai 5.

    return 0;
}
