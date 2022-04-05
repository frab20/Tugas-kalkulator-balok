/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun2D;

/**
 *
 * @author WXO
 */
public class PersegiPanjang implements MenghitungBidang{
    
    public final double panjang,lebar;
    private double keliling,luas;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public String Keliling() {
        keliling = (panjang + lebar)*2;
        return  "Keliling persegi panjang= " + keliling;
    }

    @Override
    public String Luas() {
        luas = panjang*lebar;
        return "Luas persegi panjang= " + luas;
    }

    public double getLuas() {
        return luas;
    }
     
    
}
