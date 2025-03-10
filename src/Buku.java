/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

public class Buku {
    public String judul;
    private int rating;
    private String ulasan;
    
    public Buku(String judul) {
        this.judul = judul;
    }
    
    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Rating harus antara 1 dan 5.");
        }
    }
    
    public void setUlasan(String ulasan) {
        this.ulasan = ulasan;
    }
    
    public int getRating() {
        return rating;
    }
    
    public String getUlasan() {
        return ulasan;
    }
}

