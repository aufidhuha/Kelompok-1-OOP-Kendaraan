/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

/**
 *
 * @author ASUS
 */
public class keretaApiClass extends kendaraanClass{
    
    String stasiunAwal, stasiunAkhir;
    
    public void setStatiunAwal(String stasiunAwal){
        this.stasiunAwal = stasiunAwal;
    }
    
    public String getStasiunAwal(){
        return this.stasiunAwal;
    }
    
    
    public void setStasiunAkhir(String stasiunAkhir){
        this.stasiunAkhir = stasiunAkhir;
    }
    
    public String getStasiunAkhir(){
        return this.stasiunAkhir;
    }
    
    public void tampil(){
        System.out.println("Nama Merk : " + super.merk);   
        System.out.println("Type : " + super.tipe);
        System.out.println("Tahun Produksi : " + super.tahun_produksi);
        System.out.println("Harga : " + super.harga);
        System.out.println("Warna : " + this.stasiunAwal);
        System.out.println("Mesin : " + this.stasiunAkhir);
    }
    
    public void berjalan(){
        System.out.println("Kereta api " + super.merk + " berangkat dari Stasiun " + this.stasiunAwal);
    }
    
    public void berhenti(){
        System.out.println("Kereta api " + super.merk + " berhenti di Stasiun " + this.stasiunAkhir);
    }
    
}
