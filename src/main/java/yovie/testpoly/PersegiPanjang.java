/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yovie.testpoly;

/**
 *
 * @author LENOVO
 */
public class PersegiPanjang extends ObjekGeometri{
    private int lebar;
    private int panjang;
    
    PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    void Luas(){
        System.out.println("haisl luas :" + panjang * lebar);
    }
}
