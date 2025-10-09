/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

/**
 *
 * @author ASUS
 */
public class keretaApiClass {
    
    String tipeKereta, namaKereta, stasiunAwal, stasiunAkhir;
    int hargaTiket, tahunProduksi;
    
    
    public void setTipeKereta(String tipeKereta){
        this.tipeKereta = tipeKereta;
    }
    
    public String getTipeKereta(){
        return this.tipeKereta;
    }
    
    
    public void setNamaKereta(String namaKereta){
        this.namaKereta = namaKereta;
    }
    
    public String getNamaKereta(){
        return this.namaKereta;
    }
    
    
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
    
    
    public void setHarga(int harga){
        this.hargaTiket = harga;
    }
    
    public int getHarga(){
        return this.hargaTiket;
    }
    
    
    public void setTahunProduksi(int tahunProduksi){
        this.tahunProduksi = tahunProduksi;
    }
    
    public int getTahunProduksi(){
        return this.tahunProduksi;
    }
    
    
    public void berjalan(){
        System.out.println("Kereta api " + this.namaKereta + " berangkat dari Stasiun " + this.stasiunAwal);
    }
    
    public void berhenti(){
        System.out.println("Kereta api " + this.namaKereta + " berhenti di Stasiun " + this.stasiunAkhir);
    }
    
}
