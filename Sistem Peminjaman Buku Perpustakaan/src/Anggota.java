
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hilman Fauzi Rijal
 */
public class Anggota {
    private String no,nim,nama;
    private Date massaBerlaku;

    public Anggota() {
    }

    public Anggota(String no, String nim, String nama, Date massaBerlaku) {
        this.no = no;
        this.nim = nim;
        this.nama = nama;
        this.massaBerlaku = massaBerlaku;
    }

    public void setMassaBerlaku(Date massaBerlaku) {
        this.massaBerlaku = massaBerlaku;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getMassaBerlaku() {
        return massaBerlaku;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNo() {
        return no;
    }
    
}
