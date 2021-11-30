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
public class Gold extends Silver {
    private int cashback;
    public void setcashback(int cb){
        this.cashback = cb;
    }
    public int getcashback(){
        return this.cashback;
    }
    Gold() {
        sethargaRental (30000);
        setpoint (5);
        setdiskon (2);
        setcashback (5000);
    }    
}