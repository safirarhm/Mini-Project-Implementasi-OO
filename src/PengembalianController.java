package perpustakaan;

import java.util.List;

public class PengembalianController {
    private List<Buku> daftarBukuDipinjam;

    public PengembalianController(List<Buku> daftarBukuDipinjam) {
        this.daftarBukuDipinjam = daftarBukuDipinjam;
    }

    public void prosesPengembalian(Buku buku) {
        if (!daftarBukuDipinjam.contains(buku)) {
            System.out.println("Buku ini tidak sedang dipinjam.");
            return;
        }
        daftarBukuDipinjam.remove(buku);
        System.out.println("Buku berhasil dikembalikan.");
        
        // Setelah pengembalian, beri opsi untuk memberi rating
        RatingBuku.beriRating(buku);
    }
}
