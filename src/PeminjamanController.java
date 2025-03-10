package perpustakaan;

import java.util.ArrayList;
import java.util.List;
import perpustakaan.FormPeminjaman;

public class PeminjamanController {
    private List<Buku> daftarBukuDipinjam;

    public PeminjamanController(List<Buku> daftarBukuDipinjam) {
        this.daftarBukuDipinjam = daftarBukuDipinjam;
    }

    public void pinjamBuku(Buku buku) {
        if (daftarBukuDipinjam.contains(buku)) {
            System.out.println("Buku ini sudah dipinjam.");
            return;
        }
        daftarBukuDipinjam.add(buku);
        System.out.println("Buku berhasil dipinjam.");
    }

    public void showFormPeminjaman() {
        FormPeminjaman form = new FormPeminjaman();
        form.setVisible(true);
    }
}
