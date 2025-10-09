/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

/**
 *
 * @author ASUS
 */
public class KendaraanMain {
    public static void main(String[] args) {
        
        sepedaClass sepeda = new sepedaClass();
        sepeda.setMerk("Polygon");
        sepeda.setTipe("City Bike");
        sepeda.setwarna("Hitam");
        sepeda.setberat(1.7);
        sepeda.setHarga(2000000);
        sepeda.setTahun_produksi(2021);
        
        sepeda.tampil();
        
        System.out.println("");
        
        motorClass motor = new motorClass();
        motor.setMerk("Honda");
        motor.setTipe("Vario");
        motor.setwarna("Hitam");
        motor.setHarga(17000000);
        motor.setTahun_produksi(2019);
        motor.setstatus_pajak(true);
        motor.tampil();
        
        System.out.println("");
        
        truckClass truck = new truckClass();
        truck.setMerk("Mitsubishi");
        truck.setTipe("Fuso 300");
        truck.setWarna("Kuning");
        truck.setmesin("4V12-2AT4");
        truck.setHarga(350000000);
        truck.setTahun_produksi(2017);
        truck.tampil();
        
        System.out.println("");
        
        busClass bus = new busClass();
        bus.setMerk("Hino");
        bus.setTipe("Medium Bus");
        bus.setmesin("N04C-WV");
        bus.setwarna("Biru");
        bus.setHarga(20000);
        bus.setterminal_awal("Terminal Arjosari Malang");
        bus.setterminal_akhir("Terminal Bungurasih");
        bus.tampil();
        
        System.out.println("");
        
        keretaApiClass keretaApi = new keretaApiClass();
        keretaApi.setMerk("Argo Bromo");
        keretaApi.setTipe("Eksekutif");
        keretaApi.setHarga(500000);
        keretaApi.setTahun_produksi(2018);
        keretaApi.setStatiunAwal("Malang");
        keretaApi.setStasiunAkhir("Gambir");
        keretaApi.tampil();
        keretaApi.berjalan();
        keretaApi.berhenti();
        
        System.out.println("");
        
        pesawatClass pesawat = new pesawatClass();
        pesawat.setnoreg("096456");
        pesawat.setmaskapai("Garuda Indonesia");
        pesawat.setnomor_seri("776253");
        pesawat.setMerk("Bussines Class");
        pesawat.setHarga(1500000);
        pesawat.setpangkalan("Halim Perdana Kusuma");
        pesawat.setTahun_produksi(2009);
        
        System.out.println("No Reg\t\t: " + pesawat.getnoreg());
        System.out.println("Maskapai\t\t: " + pesawat.getmaskapai());
        System.out.println("No Seri\t\t: " + pesawat.getnomor_seri());
        System.out.println("Jenis\t\t: " + pesawat.getMerk());
        System.out.println("Harga\t\t: " + pesawat.getHarga());
        System.out.println("Bandara\t\t: " + pesawat.getpangkalan());
        System.out.println("Produksi\t\t: " + pesawat.getTahun_produksi());
    }
}
