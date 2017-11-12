/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hilman Fauzi Rijal
 */
public class Admin {

    private String id, nama, jabatan, pass;

    public Admin() {
        this.id = "123456";
        this.nama = "Impal";
        this.jabatan = "Admin";
        this.pass = "123123";
    }

    public Admin(String id, String nama, String jabatan, String pass) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
        this.pass = pass;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getNama() {
        return nama;
    }

    public boolean adminLogin(String id, String pass) {
        if (id.equals(this.id) && pass.equals(this.pass)) {
            System.out.println("Login berhasil");
            return true;
        } else {
            System.out.println("Login gagal");
            return false;
        }
    }
}
