/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationaplikasirental;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class EncapsulationAplikasiRental extends Tambahan {
    public static void main(String[] args) {
        Silver s = new Silver();
        Gold g = new Gold();
        Platinum p = new Platinum();
        
        tambahMember();
        
        String idMember;
        int hariSewa, bulanSewa, tahunSewa, hariKembali, bulanKembali, tahunKembali;
        Scanner input = new Scanner(System.in);
        
        System.out.print("ID Member                         : ");
        idMember = input.nextLine();
        
        System.out.print("Masukkan Tanggal Pinjam (1 - 31)  : ");
        hariSewa = input.nextInt();
        
        System.out.print("Masukkan Bulan Pinjam (1 - 12)    : ");
        bulanSewa = input.nextInt();
        
        System.out.print("Masukkan Tahun Pinjam             : ");
        tahunSewa = input.nextInt();
        
        System.out.print("Masukkan Tanggal Kembali (1 - 31) : ");
        hariKembali = input.nextInt();
        
        System.out.print("Masukkan Bulan Kembali (1 - 12)   : ");
        bulanKembali = input.nextInt();
        
        System.out.print("Masukkan Tahun Kembali            : ");
        tahunKembali = input.nextInt();
        System.out.println();
        cariMember(idMember);
        
        System.out.println("Tanggal Pinjam                  : " + hariSewa + " - " + bulanSewa + " - " + tahunSewa);
        System.out.println("Tanggal Pinjam                  : " + hariKembali + " - " + bulanKembali + " - " + tahunKembali);
        
        
        // show rent duration
        int lamaSewa = durasiSewa(hariSewa, bulanSewa, tahunSewa, hariKembali, bulanKembali, tahunKembali );
        System.out.println("Lama Sewanya                    : " + lamaSewa + " hari");
        System.out.println();
        
        
        // show rent cost
        String jenisMember = cekMember(idMember);
        if(jenisMember == "Silver") {
            System.out.println("Total Sewa                        : Rp. " + s.jumlahHarga(lamaSewa));
            System.out.println("Jumlah Poin                       : " + s.getPoint(lamaSewa));
        
        } else if(jenisMember == "Gold") {
            System.out.println("Total Sewa                        : Rp. " + g.jumlahHarga(lamaSewa));
            System.out.println("Jumlah Poin                       : " + g.getPoint(lamaSewa));
            System.out.println("Jumlah Cashback                   : " + g.getcashback());
            
        } else {
            System.out.println("Total Sewa                        : Rp. " + p.jumlahHarga(lamaSewa));
            System.out.println("Jumlah Poin                       : " + p.getPoint(lamaSewa));
            System.out.println("Jumlah Cashback                   : " + p.getcashback());
            System.out.println("Bonus Pulsa                       : " + p.getBonus(lamaSewa));
        }
}
}