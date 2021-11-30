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
public class Platinum extends Gold {
    private int bonusPulsa;
    
    Platinum() {
        sethargaRental (45000);
        setpoint (10);
        setdiskon (3);
        setcashback (10000);
    }
    
    protected int getBonus(int lamaSewa) {
        
        bonusPulsa = lamaSewa * 5000;
        return bonusPulsa;
    }    
}
