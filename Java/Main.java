/* Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 1 dalam mata kuliah Desain Pemrograman Berorientasi
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        /* Deklarasi Variabel */
        ArrayList<Mahasiswa> list = new ArrayList<>(); // ArrayList untuk menampung data yang user input.
        CRUD crud = new CRUD(list); // Instansiasi CRUD.
        int operation, index; // Integer untuk menampung pilihan operasi yang user input, dan tampungan index untuk mencari data mahasiswa.
        String name, NIM, major, faculty, find; // String tampungan sementara untuk data mahasiswa.

        /* Perulangan untuk Meminta Inputan User */
        do {
            // Meminta user untuk memilih operasi CRUD yang ingin digunakan.
            System.out.println("+---------------------+");
            System.out.println("| Choose an operation |");
            System.out.println("| 1. Add Data         |");
            System.out.println("| 2. Show Data        |");
            System.out.println("| 3. Update Data      |");
            System.out.println("| 4. Delete Data      |");
            System.out.println("| 5. Exit Menu        |");
            System.out.println("+---------------------+");
            System.out.print("Choose: ");

            Scanner scanner = new Scanner(System.in);
            operation = scanner.nextInt();

            // Syarat menggunakan switch untuk melakukan operasi CRUD.
            switch (operation)
            {
                case 1: // Jika yang dipilih 1.
                {
                    // Maka akan melakukan proses CREATE atau ADD data.
                    scanner.nextLine();
                    System.out.println("Insert the following data!");
                    System.out.print("Name    : ");
                    name = scanner.nextLine();
                    System.out.print("NIM     : ");
                    NIM = scanner.nextLine();
                    System.out.print("Major   : ");
                    major = scanner.nextLine();
                    System.out.print("Faculty : ");
                    faculty = scanner.nextLine();
                    
                    crud.create(name, NIM, major, faculty); // Memanggil operasi create dari CRUD.

                    System.out.println("\nData has been successfully added!\n");
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
                    System.out.println("Insert the person's NIM you want to update the data!");
                    System.out.print("NIM     : ");
                    find = scanner.next(); // Meminta NIM yang ingin di update datanya.
                    index = crud.search(find); // Mencari index keberapa NIM yang dicari berada.

                    if (index == -1) // Jika index bernilai -1.
                    {
                        // Maka data tidak ada dalam list.
                        System.out.println("\nData doesn't exist!\n");
                    }
                    else // Jika selain bernilai -1.
                    {
                        // Maka akan meminta user untuk update data pada NIM yang dicari.
                        scanner.nextLine();
                        System.out.println("\nData exist! Insert the following to update the data!");
                        System.out.print("Name    : ");
                        name = scanner.nextLine();
                        System.out.print("Major   : ");
                        major = scanner.nextLine();
                        System.out.print("Faculty : ");
                        faculty = scanner.nextLine();
                        
                        crud.update(index, name, major, faculty); // Memanggil operasi update dari CRUD.

                        System.out.println("\nData has been successfully updated!\n");
                    }
                    break;
                }
                case 4: // Jika yang dipilih 4.
                {
                    // Maka akan melakukan proses DELETE data berdasarkan NIM yang user pilih.
                    System.out.println("Insert the person's NIM you want to delete!");
                    System.out.print("NIM     : ");
                    find = scanner.next(); // Meminta NIM yang ingin di delete datanya.
                    index = crud.search(find); // Mencari index keberapa NIM yang dicari berada.

                    if (index == -1) // Jika index bernilai -1.
                    {
                         // Maka data tidak ada dalam list.
                        System.out.println("\nData doesn't exist!\n");
                    }
                    else // Jika selain bernilai -1.
                    {
                        crud.remove(index); // Maka akan memanggil operasi delete dari CRUD.

                        System.out.println("\nData has been successfully deleted!\n");
                    }
                    break;
                }
                case 5: // Jika yang dipilih 5.
                {
                    System.out.println("\nBYE."); // Maka program selesai.
                    break;
                }
                default: // Jika yang dipilih selai angka 1-5.
                    System.out.println("\nInvalid operation.\n"); // Maka akan mengeluarkan invalid operations.
                    break;
            }
        } while (operation != 5); // Perulangan yang akan berhenti jika operation bernilai 5.
    }
}