<?php
/* Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 1 dalam mata kuliah Desain Pemrograman Berorientasi
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

require("CRUD.php");

$data = array(); // Array untuk menampung data yang user input.
$list = new Crud($data); // Instansiasi CRUD.

/* Create/Add Data Mahasiswa */
echo "Data Mahasiswa Awal";
$list->create("Ananda Myzza", "2100702", "ilkom", "fpmipa", "img/inthenameofgod.png");
$list->create("Jean Gunnhildr", "2100314", "Knight of Favonius", "FPS", "img/Jean.jpg");

// Read data mahasiswa
$list->read();

/* Update & Delete Data Mahasiswa */
echo "Data Mahasiswa setelah Update dan Delete";
// Update
$index = $list->search("2100702");
$list->update($index, "Ananda Myzza Marhelio", "Ilmu Komputer", "FPMIPA", "img/sleeazy.jpg");
// Delete
$index = $list->search("2100314");
$list->remove($index);
$list->read();

?>