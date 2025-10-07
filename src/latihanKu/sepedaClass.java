/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

/**
 *
 * @author ASUS
 */
public class sepedaClass extends kendaraanClass{

    String warna;
    double berat;

    public void setwarna(String warna) {
        this.warna = warna;
    }

    public String getwarna() {
        return this.warna;
    }

    public void setberat(double berat) {
        this.berat = berat;
    }

    public double getberat() {
        return this.berat;
    }
    
    public void tampil(){
        System.out.println("Nama Merk/t: " + super.merk);
        System.out.println("Tipe/t: " + super.tipe);
        System.out.println("Tahu Produksi/t: " + super.tahun_produksi);
        System.out.println("Harga/t: " + super.harga);
        System.out.println("Warna/t: " + this.warna);
        System.out.println("Berat/t: " + this.berat);
    }
}
