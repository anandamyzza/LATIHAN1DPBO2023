/* Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 1 dalam mata kuliah Desain Pemrograman Berorientasi
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

public class Mahasiswa {
    /* Attribut  private */
    private String name;
    private String NIM;
    private String major;
    private String faculty;

    /* Constructor */
    public Mahasiswa()
    {
        this.name = "";
        this.NIM = "";
        this.major = "";
        this.faculty = "";
    }
    public Mahasiswa(String name, String NIM, String major, String faculty)
    {
        this.name = name;
        this.NIM = NIM;
        this.major = major;
        this.faculty = faculty;
    }

    /* Setter dan Getter */
    /* Setter & Getter untuk Name */
    public String get_name()
    {
        return this.name;
    }
    public void set_name(String name)
    {
        this.name = name;
    }

    /* Setter & Getter untuk NIM */
    public String get_NIM()
    {
        return this.NIM;
    }
    public void set_NIM(String NIM)
    {
        this.NIM = NIM;
    }

    /* Setter & Getter untuk Major / Jurusan */
    public String get_major()
    {
        return this.major;
    }
    public void set_major(String major)
    {
        this.major = major;
    }

    /* Setter & Getter untuk Faculty / Fakultas */
    public String get_faculty()
    {
        return this.faculty;
    }
    public void set_faculty(String faculty)
    {
        this.faculty = faculty;
    }
}