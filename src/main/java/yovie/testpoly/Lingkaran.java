/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yovie.testpoly;

/**
 *
 * @author LENOVO
 */
public class Lingkaran extends ObjekGeometri{
    private int r;
    private Double phi = 3.14;
    
    Lingkaran(int r){
        this.r = r;
        
    }
    @Override
    void Luas(){
        System.out.println("haisl luas :" + phi * r * r);
    }
}
