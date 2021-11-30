/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationaplikasirental;

/**
 *
 * @author TOSHIBA
 */
public class Silver {
    // atribut
    private int hargaRental, point, diskon, hargaSementara, jumlahDiskon, totalHarga;
    
    public void sethargaRental(int hr){
        this.hargaRental = hr;
    }
    public void setpoint(int pt){
        this.point = pt;
    }
    public void setdiskon(int dc){
        this.diskon = dc;
    }
    Silver() {
        sethargaRental (25000);
        setpoint (1);
        setdiskon (1);
    }    
    protected int jumlahHarga(int lamaSewa) {
        
        hargaSementara = lamaSewa * hargaRental;
        jumlahDiskon = (hargaSementara * diskon) / 100;
        totalHarga = hargaSementara - jumlahDiskon;
        
        return totalHarga;
    }    
    protected int getPoint(int lamaSewa) {        
        int totalPoint = lamaSewa * point;
        return totalPoint;
    }    
}
