/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

/**
 *
 * @author ASUS
 */
public class pesawatClass extends kendaraanClass {
    String noreg, maskapai, nomor_seri, pangkalan, jam_terbang;
    
    
    public void setnoreg(String noreg){
        this.noreg = noreg;
    }

    public String getnoreg() {
        return this.noreg;
    }

    public void setmaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    public String getmaskapai() {
        return this.maskapai;
    }

    public void setnomor_seri(String nomor_seri) {
        this.nomor_seri = nomor_seri;
    }

    public String getnomor_seri() {
        return this.nomor_seri;
    }

    public void setpangkalan(String pangkalan) {
        this.pangkalan = pangkalan;
    }

    public String getpangkalan() {
        return this.pangkalan;
    }

    public String getjam_terbang(){
        return this.jam_terbang;
    }

    public void setJam_terbang(String jam_terbang) {
        this.jam_terbang = jam_terbang;
    }
    
    
    
    public void tampil(){
        System.out.println("Jenis : " + super.tipe);
        System.out.println("Tahun Produksi : " + super.tahun_produksi);
        System.out.println("Noreg : " + this.noreg);
        System.out.println("Maskapai : " + this.maskapai);
        System.out.println("Nomor Seri : " + this.nomor_seri);
        System.out.println("Pangkalan : " + this.pangkalan);
        System.out.println("Jam Terbang : " + this.jam_terbang);
    }
    
}
