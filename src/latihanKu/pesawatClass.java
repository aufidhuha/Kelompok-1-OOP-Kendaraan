/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

/**
 *
 * @author ASUS
 */
public class pesawatClass {
    String noreg, jenis, maskapai, nomor_seri, pangkalan;
    int tahun_produksi, jam_terbang;
    
    public void setnoreg(String noreg){
        this.noreg = noreg;
    }
    public String getnoreg(){
        return this.noreg;
    }
    
    public void setjenis(String jenis){
        this.jenis = jenis;
    }
    public String getjenis(){
        return this.jenis;
    }
    
    public void setmaskapai(String maskapai){
        this.maskapai = maskapai;
    }
    public String getmaskapai(){
        return this.maskapai;
    }
    
    public void setnomor_seri(String nomor_seri){
        this.nomor_seri = nomor_seri;
    }
    public String getnomor_seri(){
        return this.nomor_seri;
    }
    
    public void setpangkalan(String pangkalan){
        this.pangkalan = pangkalan;
    }
    public String getpangkalan(){
        return this.pangkalan;
    }
    
    public void settahun_produksi(int tahun_produksi){
        this.tahun_produksi = tahun_produksi;
    }
    public int gettahun_produksi(){
        return this.tahun_produksi;
    }
    
    public void setjam_terbang(int jam_terbang){
        this.jam_terbang = jam_terbang;
    }
    public int getjam_terbang(){
        return this.jam_terbang;
    }
}