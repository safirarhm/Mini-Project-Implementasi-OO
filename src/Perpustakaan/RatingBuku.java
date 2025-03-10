package perpustakaan;
import java.util.Scanner;


public class RatingBuku {
    public static void beriRating(Buku buku) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan rating (1-5): ");
        int rating = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline
        
        System.out.print("Masukkan ulasan: ");
        String ulasan = scanner.nextLine();
        
        buku.setRating(rating);
        buku.setUlasan(ulasan);
        
        System.out.println("Rating berhasil diberikan.");
    }
}
