/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan62.livingthing;

/**
 *
 * @author Firman Alfinas
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    public void breath(String nama) {
        System.out.println(nama + " Bernafas");
    }
    public void eat(String nama) {
        System.out.println(nama + " Makan");
    }
}
