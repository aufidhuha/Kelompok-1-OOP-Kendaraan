/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanKu;

/**
 *
 * @author ASUS
 */
public class busClass {
    String merk, warna, mesin, type, terminal_awal, terminal_akhir;
    int harga;
    
    public void setmerk(String merk){
        this.merk = merk;
    }
    public String getmark(){
        return this.merk;
    }
    
    public void setwarna(String warna){
        this.warna = warna;
    }
    public String getwarna(){
        return this.warna;
    }
    
    public void setmesin(String mesin){
        this.mesin = mesin;
    }
    public String getmesin(){
        return this.mesin;
    }
    
    public void settype(String type){
        this.type = type;
    }
    public String gettype(){
        return this.type;
    }
    
    public void setterminal_awal(String terminal_awal){
        this.terminal_awal = terminal_awal;
    }
    public String getterminal_awal(){
        return this.terminal_awal;
    }
    
    public void setterminal_akhir(String terminal_akhir){
        this.terminal_akhir = terminal_akhir;
    }
    public String getterminal_akhir(){
        return this.terminal_akhir;
    }
    
    public void setharga(int harga){
        this.harga = harga;
    }
    public int harga(){
        return this.harga;
    }
}
