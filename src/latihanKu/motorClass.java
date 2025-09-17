/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

/**
 *
 * @author ASUS
 */
public class motorClass {
    String merek,tipe,warna;
    int tahun_pembuatan;
    double harga;
    boolean status_pajak;
    
    public void setmerek(String merekQ){
        this.merek = merekQ;
    }
    public  String getmerek(){
        return this.merek;
    }
    
    public void settipe(String tipeQ){
        this.tipe = tipeQ;
    }
    public String gettipe(){
        return this.tipe;
    }
    
    public void setwarna(String warnaQ){
        this.warna = warnaQ;
    }
    public String getwarna(){
        return this.warna;
    }
    
    public void settahun_pembuatan(int tahun_pembuatanQ){
        this.tahun_pembuatan = tahun_pembuatanQ;
    }
    public int gettahun_pembuatan(){
        return this.tahun_pembuatan;
    }
    
    public void setharga(double hargaQ){
        this.harga = hargaQ;
    }
    public double getharga(){
        return this.harga;
    }
    
    public void setstatus_pajak(boolean status_pajakQ){
        this.status_pajak = status_pajakQ;
    }
    public boolean getstatus_pajak(){
        return this.status_pajak;
    }
}
