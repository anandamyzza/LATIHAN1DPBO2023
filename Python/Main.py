# Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 1 dalam mata kuliah Desain Pemrograman Berorientasi
# Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

from CRUD import CRUD

# Deklarasi Variabel
list = []  # List untuk menampung data yang user input.
crud = CRUD(list)  # Instansiasi CRUD.
operation = -1  # Inisialisasi operatio.

# Perulangan untuk Meminta Inputan User
while operation != 5:  # Perulangan yang akan berhenti jika operation bernilai 5.
    # Meminta user untuk memilih operasi CRUD yang ingin digunakan.
    print("+---------------------+")
    print("| Choose an operation |")
    print("| 1. Add Data         |")
    print("| 2. Show Data        |")
    print("| 3. Update Data      |")
    print("| 4. Delete Data      |")
    print("| 5. Exit Menu        |")
    print("+---------------------+")
    operation = int(input("Choose: "))

    # Syarat untuk melakukan operasi CRUD.
    if operation == 1:  # Jika yang dipilih 1.
        # Maka akan melakukan proses CREATE atau ADD data.
        print("Insert the following data!")
        name = input("Name    : ")
        NIM = input("NIM     : ")
        major = input("Major   : ")
        faculty = input("Faculty : ")

        # Memanggil operasi create dari CRUD.
        crud.create(name, NIM, major, faculty)
        print("\nData has been successfully added!\n")
    elif operation == 2:  # Jika yang dipilih 2.
        # Maka akan menampilkan proses READ data untuk menampilkan data yang sudah diinput user.
        crud.read()
    elif operation == 3:  # Jika yang dipilih 3.
        # Maka akan melakukan proses UPDATE data berdasarkan NIM yang user pilih.
        print("Insert the person's NIM you want to update the data!")
        find = input("NIM     : ")  # Meminta NIM yang ingin di update datanya.
        # Mencari index keberapa NIM yang dicari berada.
        index = crud.search(find)

        if index == -1:  # Jika index bernilai -1.
            # Maka data tidak ada dalam list.
            print("\nData doesn't exist!\n")
        else:  # Jika selain bernilai -1.
            # Maka akan meminta user untuk update data pada NIM yang dicari.
            print("Data exist! Insert the following to update the data!!")
            name = input("Name    : ")
            major = input("Major   : ")
            faculty = input("Faculty : ")

            # Memanggil operasi update dari CRUD.
            crud.update(index, name, major, faculty)
            print("\nData has been successfully updated!\n")
    elif operation == 4:  # Jika yang dipilih 4.
        # Maka akan melakukan proses DELETE data berdasarkan NIM yang user pilih.
        print("Insert the person's NIM you want to delete!")
        find = input("NIM     : ")  # Meminta NIM yang ingin di delete datanya.
        # Mencari index keberapa NIM yang dicari berada.
        index = crud.search(find)

        if index == -1:  # Jika index bernilai -1.
            # Maka data tidak ada dalam list.
            print("\nData doesn't exist!\n")
        else:  # Jika selain bernilai -1.
            # Maka akan memanggil operasi delete dari CRUD.
            crud.remove(index)
            print("\nData has been successfully deleted!\n")
    elif operation == 5:  # Jika yang dipilih 5.
        print("\nBYE.")  # Maka program selesai.
    else:  # Jika yang dipilih selai angka 1-5.
        # Maka akan mengeluarkan invalid operations.
        print("\nInvalid operation.\n")
