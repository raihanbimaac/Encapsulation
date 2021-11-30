/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationaplikasirental;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Period;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author TOSHIBA
 */
public class Tambahan {
    static Map<String, List<String>> memberData = new HashMap<String, 
            List<String>>();
    static int waktuRental;
    
    static void tambahMember() {
        
        List<String> data1 = new ArrayList<String>();
        data1.add("Mr. X");
        data1.add("Silver");
        
        List<String> data2 = new ArrayList<String>();
        data2.add("Mr. Y");
        data2.add("Gold");
        
        List<String> data3 = new ArrayList<String>();
        data3.add("Mr. Z");
        data3.add("Platinum");
        
        memberData.put("M001", data1);
        memberData.put("M002", data2);
        memberData.put("M003", data3);
    }
    
    
    static void cariMember(String idMember) {       
         
        if(memberData.containsKey(idMember)) {
            
            for(Map.Entry<String, List<String>> entry : memberData.entrySet()) {
                if(entry.getKey().equals(idMember)) {
                    
                String key = entry.getKey();
                List<String> values = entry.getValue();
                System.out.print("++++++++++++++++++ NOTA ++++++++++++++++++\n");
                System.out.println("ID Member                         : " + key);
                System.out.println("Nama Member                       : " + values.get(0));
                System.out.println("Jenis Member                      : " + values.get(1));
                System.out.println();
                }
            }
        } else {
                System.out.println("Data yang anda masukkan, Belum Terdaftar");
        }
    }
    
    static String cekMember(String idMember) {
        
        String jenisMember = null;
        if(memberData.containsKey(idMember)) {
            for(Map.Entry<String, List<String>> entry : memberData.entrySet()) {
                if(entry.getKey().equals(idMember)) {                    
                List<String> values = entry.getValue();               
                jenisMember = values.get(1);
                }
            }
        }
        return jenisMember;
    }
    
    static int durasiSewa(int hariSewa, int bulanSewa, int tahunSewa, int hariKembali, int bulanKembali, int tahunKembali) {
        
        if(tahunKembali >= tahunSewa) {
            if(bulanKembali >= bulanSewa) {                
                    LocalDateTime rent = LocalDateTime.of(tahunSewa, bulanSewa, hariSewa, 23, 59, 59);
                    LocalDateTime returned = LocalDateTime.of(tahunKembali, bulanKembali, hariKembali, 23, 59, 59);
                    Duration duration = Duration.between(rent, returned);        
                    waktuRental = (int) duration.toDays();
                 
            } else {
                System.out.println("Tanggal kembali tidak valid, silakan ulangi program");
            }
        } else {
            System.out.println("Tanggal kembali tidak valid, silakan ulangi program");
        }        
        return waktuRental;
    }    
}
