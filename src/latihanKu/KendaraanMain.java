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
        sepeda.setmerk("Polygon");
        sepeda.settipe("City Bike");
        sepeda.setwarna("Hitam");
        sepeda.setberat(1.7);
        sepeda.setharga(2000000);
        sepeda.settahunProduksi(2021);
        
        System.out.println("Merk\t\t: " + sepeda.getmerk());
        System.out.println("Tipe\t\t: " + sepeda.gettipe());
        System.out.println("Warna\t\t: " + sepeda.getwarna());
        System.out.println("Berat\t\t: " + sepeda.getberat());
        System.out.println("Harga\t\t: " + sepeda.getharga());
        System.out.println("Produksi\t\t: " + sepeda.gettahunProduksi());
        
        System.out.println("");
        
        motorClass motor = new motorClass();
        motor.setmerek("Honda");
        motor.settipe("Vario");
        motor.setwarna("Hitam");
        motor.setharga(17000000);
        motor.settahun_pembuatan(2019);
        motor.setstatus_pajak(true);
        
        System.out.println("Merk\t\t: " + motor.getmerek());
        System.out.println("Tipe\t\t: " + motor.gettipe());
        System.out.println("Warna\t\t: " + motor.getwarna());
        System.out.println("Harga\t\t: " + motor.getharga());
        System.out.println("Produksi\t\t: " + motor.gettahun_pembuatan());
        System.out.println("Pajak\t\t: " + motor.getstatus_pajak());
        
        System.out.println("");
        
        truckClass truck = new truckClass();
        truck.setMerek("Mitsubishi");
        truck.setTipe("Fuso 300");
        truck.setWarna("Kuning");
        truck.setmesin("4V12-2AT4");
        truck.setharga(350000000);
        truck.settahunProduk(2017);
        
        System.out.println("Merk\t\t: " + truck.getMerek());
        System.out.println("Tipe\t\t: " + truck.getTipe());
        System.out.println("Warna\t\t: " + truck.getWarna());
        System.out.println("Mesin\t\t: " + truck.getmesin());
        System.out.println("Harga\t\t: " + truck.getharga());
        System.out.println("Produk\t\t: " + truck.gettahunProduk());
        
        System.out.println("");
        
        busClass bus = new busClass();
        bus.setmerk("Hino");
        bus.settype("Medium Bus");
        bus.setmesin("N04C-WV");
        bus.setwarna("Biru");
        bus.setharga(20000);
        bus.setterminal_awal("Terminal Arjosari Malang");
        bus.setterminal_akhir("Terminal Bungurasih");
        
        System.out.println("Merk\t\t: " + bus.getmark());
        System.out.println("Tipe\t\t: " + bus.gettype());
        System.out.println("Mesin\t\t: " + bus.getmesin());
        System.out.println("Warna\t\t: " + bus.warna);
        System.out.println("H-Tiker\t\t: " + bus.harga());
        System.out.println("Berangkat\t: " + bus.getterminal_awal());
        System.out.println("Berhenti\t\t: " + bus.getterminal_akhir());
        
        System.out.println("");
        
        keretaApiClass keretaApi = new keretaApiClass();
        keretaApi.setNamaKereta("Argo Bromo");
        keretaApi.setTipeKereta("Eksekutif");
        keretaApi.setHarga(500000);
        keretaApi.setTahunProduksi(2018);
        keretaApi.setStatiunAwal("Malang");
        keretaApi.setStasiunAkhir("Gambir");
        
        System.out.println("Merk\t\t: " + keretaApi.getNamaKereta());
        System.out.println("Tipe\t\t: " + keretaApi.getTipeKereta());
        System.out.println("H-Tiket\t\t: " + keretaApi.getHarga());
        System.out.println("Produksi\t\t: " + keretaApi.getTahunProduksi());
        System.out.println("Berangkat\t: " + keretaApi.getStasiunAwal());
        System.out.println("Berhenti\t\t: " + keretaApi.getStasiunAkhir());
        keretaApi.berjalan();
        keretaApi.berhenti();
        
        System.out.println("");
        
        pesawatClass pesawat = new pesawatClass();
        pesawat.setnoreg("096456");
        pesawat.setmaskapai("Garuda Indonesia");
        pesawat.setnomor_seri("776253");
        pesawat.setjenis("Bussines Class");
        pesawat.setHarga(1500000);
        pesawat.setpangkalan("Halim Perdana Kusuma");
        pesawat.settahun_produksi(2009);
        
        System.out.println("No Reg\t\t: " + pesawat.getnoreg());
        System.out.println("Maskapai\t\t: " + pesawat.getmaskapai());
        System.out.println("No Seri\t\t: " + pesawat.getnomor_seri());
        System.out.println("Jenis\t\t: " + pesawat.getjenis());
        System.out.println("Harga\t\t: " + pesawat.getHarga());
        System.out.println("Bandara\t\t: " + pesawat.getpangkalan());
        System.out.println("Produksi\t\t: " + pesawat.gettahun_produksi());
    }
}
