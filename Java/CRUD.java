/* Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 1 dalam mata kuliah Desain Pemrograman Berorientasi
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

import java.util.ArrayList;
import java.util.List;

class CRUD {
    /* Attribut Private */
    private List<Mahasiswa> data;

    /* Constructor */
    public CRUD(List<Mahasiswa> data)
    {
        this.data = data;
    }

    /* Public Method */
    /* Create */
    public void create(String name, String NIM, String major, String faculty)
    {
        Mahasiswa mhs = new Mahasiswa(name, NIM, major, faculty);
        data.add(mhs);
    }

    /* Read */
    public void read()
    {
        if (data.size() > 0) // Jika banyaknya data lebih dari sama dengan 0.
        {
            for (int i = 0; i < data.size(); i++) // Maka akan dilakukan proses perulangan print data.
            {
                if (i == 0)
                {
                    System.out.println();
                }
                System.out.println((i + 1) + ". Biodata " + data.get(i).get_name());
                System.out.println("NIM     : " + data.get(i).get_NIM());
                System.out.println("Major   : " + data.get(i).get_major());
                System.out.println("Faculty : " + data.get(i).get_faculty() + "\n");
            }
        }
        else // Jika tidak.
        {
            // Maka data tidak ada.
            System.out.println("\nThere is no data exist!\n");
        }
    }

    /* Update */
    public void update(int index, String name, String major, String faculty)
    {
        if (index >= 0 && index < data.size()) // Jika index lebih dari sama dengan 0 dan index kurang dari jumlah data.
        {
            // Maka set data yang di update.
            data.get(index).set_name(name);
            data.get(index).set_major(major);
            data.get(index).set_faculty(faculty);
        }
        else // Jika tidak.
        {
            // Maka tidak ada data.
            System.out.println("\nData doesn't exist!\n");
        }
    }

    /* Delete */
    public void remove(int index)
    {
        if (index >= 0 && index < data.size()) // Jika index lebih dari sama dengan 0 dan index kurang dari jumlah data.
        {
            data.remove(index); // Maka data akan dihapus.
        }
        else // Jika tidak.
        {
            // Maka tidak ada data.
            System.out.println("\nData doesn't exist!\n");
        }
    }

    /* Search */
    public int search(String NIM)
    {
        int temp = -1; // Inisialisasi.
        for (int i = 0; i < data.size(); i++) // Perulangan untuk mencari index NIM yang dicari.
        {
            if (data.get(i).get_NIM().equals(NIM)) // Jika NIM dalam list sama dengan NIM yang diinput user.
            {
                temp = i; // Maka temp menampung index NIM tersebut.
            }
        }

        return temp; // Return nilai temp.
    }
}
