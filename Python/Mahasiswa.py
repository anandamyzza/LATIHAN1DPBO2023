# Saya Ananda Myzza Marhelio NIM 2100702 mengerjakan soal Latihan 1 dalam mata kuliah Desain Pemrograman Berorientasi
# Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

class Mahasiswa:
    # Attribut  private
    __name = ""
    __NIM = ""
    __major = ""
    __faculty = ""

    # Constructor
    def __init__(self, name="", NIM="", major="", faculty=""):
        self.__name = name
        self.__NIM = NIM
        self.__major = major
        self.__faculty = faculty

    # Setter dan Getter
    # Setter & Getter untuk Name
    def get_name(self):
        return self.__name

    def set_name(self, name):
        self.__name = name

    # Setter & Getter untuk NIM
    def get_NIM(self):
        return self.__NIM

    def set_NIM(self, NIM):
        self.__NIM = NIM

    # Setter & Getter untuk Major / Jurusan
    def get_major(self):
        return self.__major

    def set_major(self, major):
        self.__major = major

    # Setter & Getter untuk Faculty / Fakultas
    def get_faculty(self):
        return self.__faculty

    def set_faculty(self, faculty):
        self.__faculty = faculty
