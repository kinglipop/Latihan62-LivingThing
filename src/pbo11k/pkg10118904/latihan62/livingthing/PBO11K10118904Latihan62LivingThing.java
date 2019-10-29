/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan62.livingthing;

/**
 *
 * @author Firman Alfinas
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi program untuk menampilkan teks
 */
public class PBO11K10118904Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human manusia = new Human();
        
        manusia.setNama("Firman Alfinas");
        manusia.walk(manusia.getNama());
        manusia.breath(manusia.getNama());
        manusia.eat(manusia.getNama());
    }
    
}
