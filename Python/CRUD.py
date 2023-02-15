# Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 1 dalam mata kuliah Desain Pemrograman Berorientasi
# Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

from Mahasiswa import Mahasiswa


class CRUD:
    # Constructor
    def __init__(self, data: list):
        self.__data = data

    # Public Method
    # Create
    def create(self, name, NIM, major, faculty):
        mhs = Mahasiswa(name, NIM, major, faculty)
        self.__data.append(mhs)

    # Read
    def read(self):
        # Jika banyaknya data lebih dari sama dengan 0.
        if len(self.__data) > 0:
            # Maka akan dilakukan proses perulangan print data.
            for i, mhs in enumerate(self.__data):
                print(f"{i + 1}. Biodata {mhs.get_name()}")
                print(f"NIM     : {mhs.get_NIM()}")
                print(f"Major   : {mhs.get_major()}")
                print(f"Faculty : {mhs.get_faculty()}\n")
        # Jika tidak.
        else:
            # Maka data tidak ada.
            print("\nThere is no data exist!\n")

    # Update
    def update(self, index, name, major, faculty):
        # Jika index lebih dari sama dengan 0 dan index kurang dari jumlah data.
        if 0 <= index < len(self.__data):
            # Maka set data yang di update.
            self.__data[index].set_name(name)
            self.__data[index].set_major(major)
            self.__data[index].set_faculty(faculty)
        # Jika tidak.
        else:
            # Maka tidak ada data.
            print("\nData doesn't exist!\n")

    # Delete
    def remove(self, index):
        # Jika index lebih dari sama dengan 0 dan index kurang dari jumlah data.
        if 0 <= index < len(self.__data):
            # Maka data akan dihapus.
            self.__data.pop(index)
        # Jika tidak.
        else:
            # Maka tidak ada data.
            print("\nData doesn't exist!\n")

    # Search
    def search(self, NIM):
        temp = -1  # Inisialisasi.
        # Perulangan untuk mencari index NIM yang dicari.
        for i, mhs in enumerate(self.__data):
            # Jika NIM dalam list sama dengan NIM yang diinput user.
            if mhs.get_NIM() == NIM:
                # Maka temp menampung index NIM tersebut.
                temp = i
        # Return nilai temp.
        return temp
