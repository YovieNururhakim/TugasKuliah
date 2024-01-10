/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yovie.testpoly;

/**
 *
 * @author LENOVO
 */
public class Persegi extends ObjekGeometri {
    private int sisi;
    
    Persegi(int sisi){
        this.sisi = sisi;
    }
    @Override
    void Luas(){
        System.out.println("haisl luas :" + sisi * sisi);
    }
    
    @Override
    void Keliling(){
        System.out.println("haisl luas :" + 4 * sisi);
    }
}
