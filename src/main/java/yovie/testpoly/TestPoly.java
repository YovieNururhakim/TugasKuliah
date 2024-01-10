/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package yovie.testpoly;

/**
 *
 * @author LENOVO
 */
public class TestPoly {

    public static void main(String[] args) {
        
        //Biasa
        
        Persegi Kotak1 = new Persegi(8);
        Kotak1.Keliling();
        Lingkaran Circle1 = new Lingkaran(5);
        Circle1.Luas();
        
        
        //Dynamic
        ObjekGeometri BangunGeo;
        BangunGeo = new PersegiPanjang(6,8);
        BangunGeo.Luas();
  
        BangunGeo = new Persegi(5);
        BangunGeo.Luas();
        BangunGeo.Keliling();
        
        BangunGeo = new Segitiga(3,8);
        BangunGeo.Luas();

        
    }
}
