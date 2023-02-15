<?php
/* Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 1 dalam mata kuliah Desain Pemrograman Berorientasi
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

include_once "Mahasiswa.php";

class CRUD
{
    private $data = array(); // Attribut private

    /* Constructor */
    public function __construct($data = [])
    {
        $this->data = $data;
    }

    /* Public Method */
    /* Create */
    public function create($name, $NIM, $major, $faculty, $photo)
    {
        $mhs = new Mahasiswa($name, $NIM, $major, $faculty, $photo);
        array_push($this->data, $mhs);
    }

    /* Read */
    public function read()
    {
        if (count($this->data) >= 0) // Jika banyaknya data lebih dari sama dengan 0.
        {
            echo "<table border='3'>";
            echo "<tr>
                <th> Name </th>
                <th> NIM </th>
                <th> Major </th>
                <th> Faculty </th>
                <th> Photo </th>
                </tr>";
            for ($i = 0; $i < sizeof($this->data); $i++) // Maka akan dilakukan proses perulangan print data.
            {
                echo "<tr><td>";
                echo $this->data[$i]->get_name();
                echo "</td><td>";
                echo $this->data[$i]->get_NIM();
                echo "</td><td>";
                echo $this->data[$i]->get_major();
                echo "</td><td>";
                echo $this->data[$i]->get_faculty();
                echo "</td><td>";
                echo "<img src='" . $this->data[$i]->get_photo(). "'style='width: 150px'>";
                echo "</td></tr>";
            }
            echo "</table>";
        }
    }

    /* Update */
    public function update($index, $name, $major, $faculty, $photo)
    {
        if ($index >= 0 && $index < count($this->data)) // Jika index lebih dari sama dengan 0 dan index kurang dari jumlah data.
        {
            // Maka set data yang di update.
            $this->data[$index]->set_name($name);
            $this->data[$index]->set_major($major);
            $this->data[$index]->set_faculty($faculty);
            $this->data[$index]->set_photo($photo);
        }
    }

    /* Delete */
    public function remove($index)
    {
        if ($index >= 0 && $index < count($this->data)) // Jika index lebih dari sama dengan 0 dan index kurang dari jumlah data.
        {
            array_splice($this->data, $index, 1); // Maka data akan dihapus.
        }
    }

    /* Search */
    public function search($NIM)
    {
        $temp = -1; // Inisialisasi.
        for ($i = 0; $i < count($this->data); $i++) // Perulangan untuk mencari index NIM yang dicari.
        {
            if ($this->data[$i]->get_NIM() == $NIM) // Jika NIM dalam list sama dengan NIM yang diinput user.
            {
                $temp = $i; // Maka temp menampung index NIM tersebut.
            }
        }

        return $temp; // Return nilai temp.
    }

    /* Destructor */
    public function __destruct()
    {
    }
}
?>