/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

/**
 *
 * @author ASUS
 */
public class truckClass {
    String Merek, Tipe, warna,mesin;
    int tahun_Produksi, harga;
    
    public void setMerek(String MerekC){
        this.Merek = MerekC;
    }
    public String getMerek(){
       return this.Merek;
    }
    public void setTipe(String TipeC){
        this.Tipe = TipeC;
    }
    public String getTipe(){
       return this.Tipe;
    }
    public void setWarna(String WarnaC){
        this.warna= WarnaC;
    }
    public String getWarna(){
       return this.warna;
    }
    public void setmesin(String mesinC){
        this.mesin = mesinC;
    }
    public String getmesin(){
       return this.mesin;
    }
    public void settahunProduk (int Tahnpro){
        this.tahun_Produksi= Tahnpro;
    }
    public int gettahunProduk(){
       return this.tahun_Produksi;
    }
    public void setMerek(int Harga){
        this.harga = Harga;
    }
    public int getharga(){
       return this.harga;
    }
}
