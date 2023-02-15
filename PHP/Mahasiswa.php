<?php
/* Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 1 dalam mata kuliah Desain Pemrograman Berorientasi
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

class Mahasiswa
{
    /* Attribut Private */
    private $name;
    private $NIM;
    private $major;
    private $faculty;
    private $photo;

    /* Constructor */
    public function __construct($name = "", $NIM = "", $major = "", $faculty = "", $photo = "")
    {
        $this->name = $name;
        $this->NIM = $NIM;
        $this->major = $major;
        $this->faculty = $faculty;
        $this->photo = $photo;
    }

    /* Setter dan Getter */
    /* Setter & Getter untuk Name */
    public function get_name()
    {
        return $this->name;
    }
    public function set_name($name)
    {
        $this->name = $name;
    }

    /* Setter & Getter untuk NIM */
    public function get_NIM()
    {
        return $this->NIM;
    }
    public function set_NIM($NIM)
    {
        $this->NIM = $NIM;
    }

    /* Setter & Getter untuk Major / Jurusan */
    public function get_major()
    {
        return $this->major;
    }
    public function set_major($major)
    {
        $this->major = $major;
    }

    /* Setter & Getter untuk Faculty / Fakultas */
    public function get_faculty()
    {
        return $this->faculty;
    }
    public function set_faculty($faculty)
    {
        $this->faculty = $faculty;
    }
    
    /* Setter & Getter untuk Foto */
    public function get_photo()
    {
        return $this->photo;
    }
    public function set_photo($photo)
    {
        $this->photo = $photo;
    }

    /* Destructor */
    public function __destruct()
    {
    }
}

?>