/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

/**
 *
 * @author ASUS
 */
public class busClass extends kendaraanClass{

    String warna, mesin, terminal_awal, terminal_akhir;
    
    public void setwarna(String warna) {
        this.warna = warna;
    }

    public String getwarna() {
        return this.warna;
    }

    public void setmesin(String mesin) {
        this.mesin = mesin;
    }

    public String getmesin() {
        return this.mesin;
    }


    public void setterminal_awal(String terminal_awal) {
        this.terminal_awal = terminal_awal;
    }

    public String getterminal_awal() {
        return this.terminal_awal;
    }

    public void setterminal_akhir(String terminal_akhir) {
        this.terminal_akhir = terminal_akhir;
    }

    public String getterminal_akhir() {
        return this.terminal_akhir;
    }
    
    
    public void tampil(){
        System.out.println("Nama Merk/t: " + super.merk);   
        System.out.println("Type/t: " + super.tipe);
        System.out.println("Tahun Produksi/t: " + super.tahun_produksi);
        System.out.println("Harga/t: " + super.harga);
        System.out.println("Warna/t: " + this.warna);
        System.out.println("Mesin/t: " + this.mesin);
        System.out.println("Terminal Awal/t: " + this.terminal_awal);
        System.out.println("Terminal Akhir/t: " + this.terminal_akhir);
    }

}
