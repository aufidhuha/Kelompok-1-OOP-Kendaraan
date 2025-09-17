/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

/**
 *
 * @author ASUS
 */
public class sepedaClass {
    String merk, tipe, warna;
    int tahunProduksi;
    double harga, berat;
   
    public void setmerk(String merk){
        this.merk = merk;
    }
    public String getmerk(){
        return this.merk;
    }  
    
    public void settipe(String tipe){
        this.tipe = tipe;
    }
    public String gettipe(){
        return this.tipe;
    }
    
    public void setwarna(String warna){
        this.warna = warna;
    }
    public String getwarna(){
        return this.warna;
    }
    
    public void settahunProduksi(int tahunProduksi){
        this.tahunProduksi = tahunProduksi;
    }
    public int gettahunProduksi(){
        return this.tahunProduksi;
    }
    
    public void setharga(double harga){
        this.harga = harga;
    }
    public double getharga(){
        return this.harga;
    }
    
    public void setberat(double berat){
        this.berat = berat;
    }
    public double getberat(){
        return this.berat;
    }
}
