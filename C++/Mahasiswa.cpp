/* Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 1 dalam mata kuliah Desain Pemrograman Berorientasi
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

#include <bits/stdc++.h>

using namespace std;

class Mahasiswa
{
private: // Attribut private
    string name;
    string NIM;
    string major;
    string faculty;

public:
    /* Constructor */
    Mahasiswa()
    {
        this->name = "";
        this->NIM = "";
        this->major = "";
        this->faculty = "";
    }
    Mahasiswa(string name, string NIM, string major, string faculty)
    {
        this->name = name;
        this->NIM = NIM;
        this->major = major;
        this->faculty = faculty;
    }

    /* Setter dan Getter */
    /* Setter & Getter untuk Name */
    string get_name()
    {
        return this->name;
    }
    void set_name(string name)
    {
        this->name = name;
    }

    /* Setter & Getter untuk NIM */
    string get_NIM()
    {
        return this->NIM;
    }
    void set_NIM(string NIM)
    {
        this->NIM = NIM;
    }

    /* Setter & Getter untuk Major / Jurusan */
    string get_major()
    {
        return this->major;
    }
    void set_major(string major)
    {
        this->major = major;
    }

    /* Setter & Getter untuk Faculty / Fakultas */
    string get_faculty()
    {
        return this->faculty;
    }
    void set_faculty(string faculty)
    {
        this->faculty = faculty;
    }

    /* Destructor */
    ~Mahasiswa()
    {
    }
};