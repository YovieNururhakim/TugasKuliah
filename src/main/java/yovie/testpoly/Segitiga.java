/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yovie.testpoly;

/**
 *
 * @author LENOVO
 */
public class Segitiga extends ObjekGeometri {
    private int alas, tinggi;
    
    Segitiga(int alas,int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    @Override
    void Luas(){
        System.out.println("haisl luas :" +  * alas * tinggi);
    }
    
    
}
