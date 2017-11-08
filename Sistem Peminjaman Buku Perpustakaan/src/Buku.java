/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hilman Fauzi Rijal
 */
public class Buku {
    private String kode,judul,pengarang,penerbit;
    private int jumlah;

    public Buku() {
    }

    public Buku(String kode, String judul, String pengarang, String penerbit, int jumlah) {
        this.kode = kode;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.jumlah = jumlah;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getKode() {
        return kode;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getPengarang() {
        return pengarang;
    }
    
}
