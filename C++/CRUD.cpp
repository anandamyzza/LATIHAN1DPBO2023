/* Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 1 dalam mata kuliah Desain Pemrograman Berorientasi
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

#include <bits/stdc++.h>
#include "Mahasiswa.cpp"

using namespace std;

class CRUD
{
private: // Attribut  private
    vector<Mahasiswa> data;

public:
    /* Constructor */
    CRUD(vector<Mahasiswa> data)
    {
        this->data = data;
    }

    /* Public Method */
    /* Create */
    void create(string name, string NIM, string major, string faculty)
    {
        Mahasiswa mhs(name, NIM, major, faculty);
        data.push_back(mhs);
    }

    /* Read */
    void read()
    {
        if (data.size() >= 0) // Jika banyaknya data lebih dari sama dengan 0.
        {
            for (int i = 0; i < data.size(); i++) // Maka akan dilakukan proses perulangan print data.
            {
                if (i == 0)
                {
                    cout << "\n";
                }
                cout << i + 1 << ". Biodata " << data[i].get_name() << endl;
                cout << "NIM     : " << data[i].get_NIM() << endl;
                cout << "Major   : " << data[i].get_major() << endl;
                cout << "Faculty : " << data[i].get_faculty() << endl
                     << endl;
            }
        }
        else // Jika tidak.
        {
            // Maka data tidak ada.
            cout << "\nThere is no data exist!\n"
                 << endl;
        }
    }

    /* Update */
    void update(int index, string name, string major, string faculty)
    {
        if (index >= 0 && index < data.size()) // Jika index lebih dari sama dengan 0 dan index kurang dari jumlah data.
        {
            // Maka set data yang di update.
            data[index].set_name(name);
            data[index].set_major(major);
            data[index].set_faculty(faculty);
        }
        else // Jika tidak.
        {
            // Maka tidak ada data.
            cout << "\nData doesn't exist!\n"
                 << endl;
        }
    }

    /* Delete */
    void remove(int index)
    {
        if (index >= 0 && index < data.size()) // Jika index lebih dari sama dengan 0 dan index kurang dari jumlah data.
        {
            data.erase(data.begin() + index); // Maka data akan dihapus.
        }
        else // Jika tidak.
        {
            // Maka tidak ada data.
            cout << "\nData doesn't exist!\n"
                 << endl;
        }
    }

    /* Search */
    int search(string NIM)
    {
        int temp = -1;                        // Inisialisasi.
        for (int i = 0; i < data.size(); i++) // Perulangan untuk mencari index NIM yang dicari.
        {
            if (data[i].get_NIM() == NIM) // Jika NIM dalam list sama dengan NIM yang diinput user.
            {
                temp = i; // Maka temp menampung index NIM tersebut.
            }
        }

        return temp; // Return nilai temp.
    }
};