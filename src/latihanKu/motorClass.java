/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

/**
 *
 * @author ASUS
 */
public class motorClass extends kendaraanClass{

    String warna;
    boolean status_pajak;

    public void setwarna(String warnaQ) {
        this.warna = warnaQ;
    }

    public String getwarna() {
        return this.warna;
    
    }

    public void setstatus_pajak(boolean status_pajakQ) {
        this.status_pajak = status_pajakQ;
    }

    public boolean getstatus_pajak() {
        return this.status_pajak;
    }
    
    public void tampil(){
        System.out.println("Nama Merk : " + super.merk);
        System.out.println("Tipe : " + super.tipe);
        System.out.println("Tahun Produksi : " + super.tahun_produksi);
        System.out.println("Harga : " + super.harga);
        System.out.println("Warna : " + this.warna);
        System.out.println("Status Pajak : " + this.status_pajak);
         
    }
}
